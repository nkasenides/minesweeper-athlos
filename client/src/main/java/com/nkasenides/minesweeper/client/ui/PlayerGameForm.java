package com.nkasenides.minesweeper.client.ui;

import com.nkasenides.minesweeper.client.MAClient;
import com.nkasenides.minesweeper.client.ui.component.MinesweeperButton;
import com.nkasenides.minesweeper.model.MatrixPosition;
import com.nkasenides.minesweeper.proto.RevealState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;

public class PlayerGameForm extends JFrame {

    //UI
    private JPanel gamePanel;
    private MinesweeperButton[][] buttons;
    private static final int WINDOW_SIZE = 800;

    //Other
    private MAClient client;

    public PlayerGameForm(MAClient client, String playerName) {

        //Initialize UI:
        setTitle(playerName + " | Minesweeper");
        this.client = client;
        this.buttons = new MinesweeperButton[10][10];
        setSize(WINDOW_SIZE, WINDOW_SIZE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Resizing:
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                MinesweeperButton.setIconSize(buttons[0][0].getWidth() - 8);
                MinesweeperButton.resizeIcons();
            }
        });

    }

    public void initialize() {
        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(10, 10));
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                MinesweeperButton button = new MinesweeperButton();
                buttons[row][col] = button;
                gamePanel.add(button);
            }
        }
        add(gamePanel);

        updateButtons();
        setVisible(true);
        MinesweeperButton.setIconSize(buttons[0][0].getWidth() - 8);
        MinesweeperButton.resizeIcons();
    }

    public void update() {
        switch (MAClient.gameState) {
            case NOT_STARTED_GameState:
                JOptionPane.showMessageDialog(null, "Game not started", "Error", JOptionPane.WARNING_MESSAGE);
                dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                break;
            case STARTED_GameState:
            case ENDED_WON_GameState:
            case ENDED_LOST_GameState:
                updateButtons();
                break;
        }
    }

    private void updateButtons() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

//                System.out.println(row + "," + col);

                final String hash = (new MatrixPosition(row, col)).toHash();

                //Set background:
                switch (MAClient.gameState) {
                    case NOT_STARTED_GameState:
                        break;
                    case STARTED_GameState:
                        buttons[row][col].setBackground(Color.LIGHT_GRAY);
                        //Set the background of blank revealed cells to a darker gray:

                        if (MAClient.board.get(hash).getRevealState() == RevealState.REVEALED_0_RevealState) {
                            buttons[row][col].setBackground(Color.GRAY);
                        }
                        break;
                    case ENDED_WON_GameState:
                        buttons[row][col].setBackground(Color.GREEN);
                        break;
                    case ENDED_LOST_GameState:
                        buttons[row][col].setBackground(Color.RED);
                        break;
                }

                //Set the icon:
                switch (MAClient.board.get(hash).getRevealState()) {
                    case COVERED_RevealState:
                    case REVEALED_0_RevealState:
                        buttons[row][col].setIcon(null);
                        break;
                    case FLAGGED_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.FLAG);
                        break;
                    case REVEALED_1_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.ONE);
                        break;
                    case REVEALED_2_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.TWO);
                        break;
                    case REVEALED_3_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.THREE);
                        break;
                    case REVEALED_4_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.FOUR);
                        break;
                    case REVEALED_5_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.FIVE);
                        break;
                    case REVEALED_6_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.SIX);
                        break;
                    case REVEALED_7_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.SEVEN);
                        break;
                    case REVEALED_8_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.EIGHT);
                        break;
                    case REVEALED_MINE_RevealState:
                        buttons[row][col].setIcon(MinesweeperButton.MINE);
                        break;
                }

            }
        }
    }

}