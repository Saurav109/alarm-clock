package com.company;

import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    window w=new window();
        JFrame j=new JFrame("Alarm Clock");
        j.setBounds(500,500,300,70);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(w);
        j.setVisible(true);
        Date d=new Date();
        System.out.println();
    }
}
