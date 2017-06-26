package de.keinpunkt;

import javax.swing.*;

@SuppressWarnings("serial")
public class Contact extends JFrame {//inheriting JFram

    JFrame f;

    // constructor
    Contact(){

        JButton b=new JButton("klick");//create button
        b.setBounds(130,100,100, 40);

        add(b);//adding button on frame
        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }


    public static void main(String[] args) {

        new Contact();

    }
}