package com.ardi;

import java.awt.*;
import javax.swing.*;

public class Snake extends JFrame {

    public Snake() {
        
        initUI();
    }

    private void initUI() {
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        Board board = new Board();

        container.add(board);
        container.add(new Menu(board));

        add(container);

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
