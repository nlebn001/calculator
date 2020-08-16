package com.demo.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {
    private double num, ans;
    private int calculation;
    private Font fontVerdana15;
    private Font fontVerdana13;
    private ImageIcon icon;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItemAbout;
    private JMenuItem menuItemHelp;
    private JTextField calculatorField;
    private JTextField additionalField;
    private JPanel panelFirst;
    private JPanel panelSecond;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonEquals;
    private JButton buttonPoint;
    private JButton buttonAC;
    private JButton buttonDelete;
    private JButton buttonPercent;

    public Calculator() {
        //Fonts
        fontVerdana15 = new Font("Verdana", Font.BOLD, 15);
        fontVerdana13 = new Font("Verdana", Font.BOLD, 13);

        //Icon
        icon = new ImageIcon("src/main/java/resources/images/Calculator-icon.png");
        setIconImage(icon.getImage());

        //Menu
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menu.setFont(fontVerdana13);
        menuItemAbout = new JMenuItem("About");
        menuItemAbout.setFont(fontVerdana13);
        menuItemHelp = new JMenuItem("Help");
        menuItemHelp.setFont(fontVerdana13);

        //Menu Frames
        menuItemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameAbout frameAbout = new FrameAbout();
            }
        });

        menuItemHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameHelp frameHelp = new FrameHelp();
            }
        });

        //Menu Calculator Field
        calculatorField = new JTextField("0", 20);
        calculatorField.setBounds(0, 80, 406, 100);
        calculatorField.setFont(fontVerdana15);
        calculatorField.setHorizontalAlignment(JTextField.RIGHT);
        calculatorField.setBackground(Color.black);
        calculatorField.setForeground(Color.white);
        calculatorField.setBorder(null);

        //KeyListener
        calculatorField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                calculatorField.setEditable(false);
            }
        });

        //Additional calculator field
        additionalField = new JTextField("0", 30);
        additionalField.setFont(fontVerdana15);
        additionalField.setBounds(0, 0, 406, 80);
        additionalField.setHorizontalAlignment(JTextField.RIGHT);
        additionalField.setBackground(Color.black);
        additionalField.setForeground(Color.lightGray);
        additionalField.setBorder(null);
        additionalField.setEditable(false);

        //Upper Panel
        panelFirst = new JPanel();
        panelFirst.setBounds(5, 5, 406, 180);
        panelFirst.setBackground(Color.black);
        panelFirst.setFont(fontVerdana13);

        //Lower Panel
        panelSecond = new JPanel();
        panelSecond.setBounds(5, 190, 406, 258);
        panelSecond.setFont(fontVerdana13);
        panelSecond.setBackground(Color.black);

        //Buttons
        button1 = new JButton("1");
        button1.setBounds(0, 156, 100, 50);
        button1.setFont(fontVerdana13);
        button1.setBackground(Color.darkGray);
        button1.setForeground(Color.lightGray);
        button1.setBorder(null);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("1");
                } else {
                    calculatorField.setText(calculatorField.getText() + "1");
                }
            }
        });

        button2 = new JButton("2");
        button2.setBounds(102, 156, 100, 50);
        button2.setFont(fontVerdana13);
        button2.setBackground(Color.darkGray);
        button2.setForeground(Color.lightGray);
        button2.setBorder(null);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("2");
                } else {
                    calculatorField.setText(calculatorField.getText() + "2");
                }
            }
        });

        button3 = new JButton("3");
        button3.setBounds(204, 156, 100, 50);
        button3.setFont(fontVerdana13);
        button3.setBackground(Color.darkGray);
        button3.setForeground(Color.lightGray);
        button3.setBorder(null);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("3");
                } else {
                    calculatorField.setText(calculatorField.getText() + "3");
                }
            }
        });

        button4 = new JButton("4");
        button4.setBounds(0, 104, 100, 50);
        button4.setFont(fontVerdana13);
        button4.setBackground(Color.darkGray);
        button4.setForeground(Color.lightGray);
        button4.setBorder(null);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("4");
                } else {
                    calculatorField.setText(calculatorField.getText() + "4");
                }
            }
        });

        button5 = new JButton("5");
        button5.setBounds(102, 104, 100, 50);
        button5.setFont(fontVerdana13);
        button5.setBackground(Color.darkGray);
        button5.setForeground(Color.lightGray);
        button5.setBorder(null);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("5");
                } else {
                    calculatorField.setText(calculatorField.getText() + "5");
                }
            }
        });

        button6 = new JButton("6");
        button6.setBounds(204, 104, 100, 50);
        button6.setFont(fontVerdana13);
        button6.setBackground(Color.darkGray);
        button6.setForeground(Color.lightGray);
        button6.setBorder(null);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("6");
                } else {
                    calculatorField.setText(calculatorField.getText() + "6");
                }
            }
        });

        button7 = new JButton("7");
        button7.setBounds(0, 52, 100, 50);
        button7.setFont(fontVerdana13);
        button7.setBackground(Color.darkGray);
        button7.setForeground(Color.lightGray);
        button7.setBorder(null);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("7");
                } else {
                    calculatorField.setText(calculatorField.getText() + "7");
                }
            }
        });

        button8 = new JButton("8");
        button8.setBounds(102, 52, 100, 50);
        button8.setFont(fontVerdana13);
        button8.setBackground(Color.darkGray);
        button8.setForeground(Color.lightGray);
        button8.setBorder(null);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("8");
                } else {
                    calculatorField.setText(calculatorField.getText() + "8");
                }
            }
        });

        button9 = new JButton("9");
        button9.setBounds(204, 52, 100, 50);
        button9.setFont(fontVerdana13);
        button9.setBackground(Color.darkGray);
        button9.setForeground(Color.lightGray);
        button9.setBorder(null);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("9");
                } else {
                    calculatorField.setText(calculatorField.getText() + "9");
                }
            }
        });

        button0 = new JButton("0");
        button0.setBounds(0, 208, 202, 50);
        button0.setFont(fontVerdana13);
        button0.setBackground(Color.darkGray);
        button0.setForeground(Color.lightGray);
        button0.setBorder(null);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (calculatorField.getText().equals("0") || calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")) {
                    calculatorField.setText("0");
                } else {
                    calculatorField.setText(calculatorField.getText() + "0");
                }
            }
        });

        buttonDivide = new JButton("/");
        buttonDivide.setBounds(306, 0, 100, 50);
        buttonDivide.setFont(fontVerdana15);
        buttonDivide.setBackground(Color.ORANGE);
        buttonDivide.setForeground(Color.white);
        buttonDivide.setBorder(null);
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorField.getText());
                calculation = 4;
                calculatorField.setText("0");
                additionalField.setText(num + "/");
            }
        });

        buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(306, 52, 100, 50);
        buttonMultiply.setFont(fontVerdana15);
        buttonMultiply.setBackground(Color.ORANGE);
        buttonMultiply.setForeground(Color.white);
        buttonMultiply.setBorder(null);
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorField.getText());
                calculation = 3;
                calculatorField.setText("0");
                additionalField.setText(num + "*");
            }
        });

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(306, 156, 100, 50);
        buttonPlus.setFont(fontVerdana15);
        buttonPlus.setBackground(Color.ORANGE);
        buttonPlus.setForeground(Color.white);
        buttonPlus.setBorder(null);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorField.getText());
                calculation = 1;
                calculatorField.setText("0");
                additionalField.setText(num + "+");
            }
        });

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(306, 104, 100, 50);
        buttonPlus.setFont(fontVerdana15);
        buttonMinus.setBackground(Color.ORANGE);
        buttonMinus.setForeground(Color.white);
        buttonMinus.setBorder(null);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorField.getText());
                calculation = 2;
                calculatorField.setText("0");
                additionalField.setText(num + "-");
            }
        });

        buttonPoint = new JButton(".");
        buttonPoint.setBounds(204, 208, 100, 50);
        buttonPoint.setFont(fontVerdana15);
        buttonPoint.setBackground(Color.darkGray);
        buttonPoint.setForeground(Color.lightGray);
        buttonPoint.setBorder(null);
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(calculatorField.getText().contains(".")|| calculatorField.getText().equals("NaN") || calculatorField.getText().equals("Infinity")){
                    calculatorField.setText(calculatorField.getText());
                }else{
                    calculatorField.setText(calculatorField.getText() + ".");
                }
            }
        });

        buttonAC = new JButton("AC");
        buttonAC.setBounds(0, 0, 100, 50);
        buttonAC.setFont(fontVerdana13);
        buttonAC.setBackground(Color.lightGray);
        buttonAC.setForeground(Color.black);
        buttonAC.setBorder(null);
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorField.setText("0");
                additionalField.setText("0");
            }
        });

        buttonDelete = new JButton("<<");
        buttonDelete.setBounds(102, 0, 100, 50);
        buttonDelete.setFont(fontVerdana13);
        buttonDelete.setBackground(Color.lightGray);
        buttonDelete.setForeground(Color.black);
        buttonDelete.setBorder(null);
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = calculatorField.getText().length();
                int number = calculatorField.getText().length() - 1;
                String store;
                if (length > 1) {
                    StringBuilder back = new StringBuilder(calculatorField.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    calculatorField.setText(store);
                }
                if (length == 1) {
                    calculatorField.setText("0");
                }
            }
        });

        buttonPercent = new JButton("%");
        buttonPercent.setBounds(204, 0, 100, 50);
        buttonPercent.setFont(fontVerdana13);
        buttonPercent.setBorder(null);
        buttonPercent.setBackground(Color.lightGray);
        buttonPercent.setForeground(Color.black);
        buttonPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(calculatorField.getText());
                calculation = 5;
                calculatorField.setText("0");
                additionalField.setText(num + "%");
            }
        });

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(306, 208, 100, 50);
        buttonPlus.setFont(fontVerdana15);
        buttonEquals.setBackground(Color.ORANGE);
        buttonEquals.setForeground(Color.white);
        buttonEquals.setBorder(null);
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (calculation) {
                    case 1:
                        ans = num + Double.parseDouble(calculatorField.getText());
                        calculatorField.setText(Double.toString(ans));
                        break;
                    case 2:
                        ans = num - Double.parseDouble(calculatorField.getText());
                        calculatorField.setText(Double.toString(ans));
                        break;

                    case 3:
                        ans = num * Double.parseDouble(calculatorField.getText());
                        calculatorField.setText(Double.toString(ans));
                        break;

                    case 4:
                        ans = num / Double.parseDouble(calculatorField.getText());
                        calculatorField.setText(Double.toString(ans));
                        break;

                    case 5:
                        ans = num / 100 * Double.parseDouble(calculatorField.getText());
                        calculatorField.setText(Double.toString(ans));
                        break;
                }
            }
        });

        //Jpanels ADD
        panelSecond.add(buttonAC);
        panelSecond.add(buttonDelete);
        panelSecond.add(buttonPercent);
        panelSecond.add(buttonDivide);
        panelSecond.add(button7);
        panelSecond.add(button8);
        panelSecond.add(button9);
        panelSecond.add(buttonMultiply);
        panelSecond.add(button4);
        panelSecond.add(button5);
        panelSecond.add(button6);
        panelSecond.add(buttonMinus);
        panelSecond.add(button1);
        panelSecond.add(button2);
        panelSecond.add(button3);
        panelSecond.add(buttonPlus);
        panelSecond.add(button0);
        panelSecond.add(buttonPoint);
        panelSecond.add(buttonEquals);
        panelFirst.add(additionalField);
        panelFirst.add(calculatorField);
        panelFirst.setLayout(null);
        panelSecond.setLayout(null);

        //Frame ADD
        menu.add(menuItemAbout);
        menu.add(menuItemHelp);
        menuBar.add(menu);
        setTitle("Calculator");
        setJMenuBar(menuBar);
        add(panelFirst);
        add(panelSecond);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(422, 510);
        setResizable(false);
        setLocation(700, 200);
    }
}





