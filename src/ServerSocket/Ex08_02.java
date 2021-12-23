package ServerSocket;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class Ex08_02sub extends Frame implements ActionListener {
    private Label lb = new Label("Address : ", Label.RIGHT);
    private TextField tf = new TextField();
    private Button bt = new Button("Moving");
    private TextArea ta = new TextArea();

    public Ex08_02sub(String str){
        super(str);
        this.init();
        this.start();
        this.setSize(500, 400);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(new BorderLayout());
        this.add("Center", ta);
        Panel p = new Panel(new BorderLayout());
        p.add("West", lb);
        p.add("Center", tf);
        p.add("East", bt);
        this.add("North", p);
        tf.requestFocus();
    }

    private void start() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        tf.addActionListener(this);
        bt.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tf || e.getSource() == bt){
            String str = tf.getText().trim();
            if(str == null || str.length() == 0){
                tf.requestFocus();
                return;
            }
            try{
                Socket soc = new Socket(str, 80);
                InputStream is = soc.getInputStream();
                ta.setText("");

                while(true){
                    int xx = is.read();
                    if(xx == -1){
                        break;
                    }
                    ta.append((char)xx + "");
                }
            }catch(Exception ee){}

        }
    }
}

public class Ex08_02 {

    public static void main(String[] args) {

        Ex08_02sub exe = new Ex08_02sub("Web Connected.");
    }
}
//192.168.1.99
//HTTP1.0 200 OK