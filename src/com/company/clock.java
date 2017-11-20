package com.company;

import javax.swing.*;

public class clock implements Runnable{
    int time=0;
    Thread t;
    String m;
    clock(int x,String m){
        time=x;
        this.m=m;
        t=new Thread(this);
        t.start();


        System.out.println("starting");
    }
    public void start(int x ,String m){
        time=x;
        this.m=m;
        t=new Thread(this);
        t.start();


        System.out.println("starting");
    }

    @Override
    public void run() {
        int i=0;
        while(i!=time){
            System.out.println("runnig"+i);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
        System.out.println("after loop");
        JOptionPane.showMessageDialog(null,m,"Time out",JOptionPane.YES_NO_OPTION);

    }
}
