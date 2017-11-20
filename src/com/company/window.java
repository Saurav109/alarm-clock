package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window extends JPanel{
    JTextField in,in2;
    JButton b;
    clock c;
    String message;
    window(){
        in =new JTextField();
        in2 =new JTextField();
        in.setToolTipText("time");
        in2.setToolTipText("note");
        //c=new clock();
        b=new JButton("start timer");
        b.setBounds(0,0,150,20);
        in2.setBounds(0,40,200,25);
        in.setBounds(200,40,70,25);

        setBounds(500,500,300,70);
        setLayout(null);
        add(in);
        add(b);
        add(in2);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                alarm2();
            }
        });
    }

public void  alarm(){
    System.out.println("doing");
    int x= Integer.parseInt(in.getText());
    c.start(x,in2.getText());

}

public void alarm2(){
    int x= Integer.parseInt(in.getText());
    clock n=new clock(x,in2.getText());
    }
}
