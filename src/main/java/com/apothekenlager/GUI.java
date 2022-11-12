package com.apothekenlager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class GUI extends Frame implements ActionListener
{
    Label label1,label2,label3;
    TextField text1,text2,text3;
    Button button1,button2,button3,button4,button5;
    public GUI()
    {
        label1 = new Label("PZN");
        label2 = new Label("Stückzahl");
        label3 = new Label("verbleibend");
        text1 = new TextField(10);
        text2 = new TextField(5);
        text3 = new TextField(10);
        button1 = new Button("+");
        button2 = new Button("-");
        button3 = new Button("neu");
        button4 = new Button("Anzeigen");
        button5 = new Button("Beenden");
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        setSize(300,150);
        setTitle("LagerGUI");
        setLayout(new FlowLayout());
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent action) {
        double a1=0,b1=0,c1=0;
        try
        {
            a1 = Double.parseDouble(text1.getText());
        }
        catch (NumberFormatException e) {
            text1.setText("Invalid input entered");
        }
        try
        {
            b1 = Double.parseDouble(text2.getText());
        }
        catch (NumberFormatException e) {
            text2.setText("Invalid input entered");
        }


        if(action.getSource()==button1)
        {
//            c1 = a1 + b1;
            c1 = b1 + 10;
            text3.setText(String.valueOf(c1));
        }
        if(action.getSource()==button2)
        {
            c1 = a1 - b1;
            text3.setText(String.valueOf(c1));
        }
        if(action.getSource()==button3)
        {
            c1 = a1 * b1;
            text3.setText(String.valueOf(c1));
        }
        if(action.getSource()==button4)
        {
            c1 = a1 / b1;
            text3.setText(String.valueOf(c1));
        }
        if(action.getSource() == button5)
        {
            System.exit(0);
        }

    }


}
