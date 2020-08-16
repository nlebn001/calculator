package com.demo.calculator;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class FrameHelp extends JFrame {

    Image image;
    Icon icon;
    JButton buttonHelp;

    public FrameHelp(){
        //Button
        buttonHelp = new JButton(new ImageIcon("src/main/java/resources/images/sos.png"));
        buttonHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    openWebPage("https://www.youtube.com/watch?v=oUlj9-yxSQ0");
            }
        });

        //Frame add
        setTitle("Help");
        add(buttonHelp);
        setSize(400,400);
        setLocation(720,220);
        setVisible(true);
        setIconImage(new ImageIcon("src/main/java/resources/images/Calculator-icon.png").getImage());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setResizable(false);
    }

    public void openWebPage(String url){
        try {
            Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
