package com.demo.calculator;

import javax.swing.*;
import java.awt.*;

public class FrameAbout extends JFrame {

    private final String newline = "\n";
    private JPanel panel;
    private JTextArea aboutText;
    private JScrollPane scrollPaneText;

    public FrameAbout(){
        //Panel
        panel = new JPanel(null);
        panel.setBounds(0,0,400,170);
        panel.setBorder(null);

        //TextArea
        aboutText = new JTextArea(5,20);
        aboutText.setBounds(0,0, 400,400);
        aboutText.setFont(new Font("Verdana", Font.BOLD, 13));
        aboutText.setBackground(Color.white);
        aboutText.setText("1) A calculator is a machine which allows people "+ newline+ "to do math operations more easily."
                +newline+"2) For example, most calculators will add, subtract, "+newline+"multiply, and divide. This calculator can do it :)"
                +newline+"3) Some also do square roots, and more complex "+newline+"calculators can help with calculus and draw function"
                +newline+" graphs. This calculator can't do it :(");
        aboutText.setEditable(false);
        aboutText.setLayout(null);

        //Frame add
        panel.add(aboutText);
        add(panel);
        setTitle("About Calculators");
        setSize(400,170);
        setLocation(730,240);
        setVisible(true);
        setIconImage(new ImageIcon("src/main/java/resources/images/Calculator-icon.png").getImage());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

}
