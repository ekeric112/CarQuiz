package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartMenu extends JFrame {
    private Dimension dim;
    private JPanel startMenu;
    private JPanel btnMenu;
    private JPanel labelMenu;
    private JLabel quizLabel;
    private JButton startBtn;
    private JButton quitBtn;
//    private SetShipMenu shipMenu;


    public StartMenu() throws IOException {
        createComponents();
        wireComponents();
    }

    private void createComponents() throws IOException {
        startMenu = new JPanel(new BorderLayout());
        btnMenu = new JPanel(new GridBagLayout());
        labelMenu = new JPanel(new GridBagLayout());
        quizLabel = new JLabel("Title!");
        quizLabel.setFont(new Font("Times New Roman", Font.BOLD, 48));
        startBtn = new JButton("Start Quiz");
        quitBtn = new JButton("Quit");
        dim = Toolkit.getDefaultToolkit().getScreenSize();
//        shipMenu = new SetShipMenu();

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        btnMenu.add(startBtn, c);

        labelMenu.add(quizLabel, c);


        c.ipady = 0;       //reset to default
        c.insets = new Insets(10, 0, 0, 0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //second row
        btnMenu.add(quitBtn, c);

        startMenu.add(labelMenu, BorderLayout.NORTH);
        startMenu.add(btnMenu, BorderLayout.CENTER);
        add(startMenu);

        setTitle("Car Quiz");
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);

    }

    private void wireComponents() {
        quitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }

}
