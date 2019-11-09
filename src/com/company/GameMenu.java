package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameMenu extends JFrame {
    private Dimension dim;
    private JPanel panel; //border layout
    private JPanel answerPanel; //holds the answer buttons, goes in the center of the borderlayout
    private JLabel questionLabel; //label that asks the question, goes in the north pos
    private JButton ans1, ans2, ans3, ans4;



    public GameMenu() throws IOException{
        createComponents();
        wireComponents();
    }

    private void createComponents() throws IOException{

    }

    private void wireComponents(){

    }
}
