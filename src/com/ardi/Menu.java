package com.ardi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    private final int B_WIDTH = 300;
    private final int B_HEIGHT = 300;

    private Board board;

    public Menu(Board board) {
        this.board = board;
        initMenu();
    }

    private void initMenu() {
        setBackground(Color.CYAN);
        //setFocusable(true);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        Button restartButton = new Button("Restart");

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.restartGame();
            }
        });

        this.add(restartButton);

    }

}
