package com.akshay.Projects.BrickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private final Timer timer;
    private final int delay =8;
    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXDir =-1;
    private int ballYDir =-2;
    private MapGenerator map;
    public Gameplay(){
        map = new MapGenerator(3,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){
        // background
        g.setColor(Color.BLACK);
        g.fillRect(1,1,692,592);

        // drawing map
        map.draw((Graphics2D)g);

        // borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);

        // score
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD,25));
        g.drawString(String.valueOf(score),590,30);

        // peddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100,8);

        //ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX,ballposY,20,20);

        if (totalBricks <= 0){
            play = false;
            ballXDir =0;
            ballYDir =0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD,30));
            g.drawString("You Won!!",260,300);

            g.setFont(new Font("serif", Font.BOLD,20));
            g.drawString("Press Enter to Restart" + score ,230,350);
        }

        if (ballposY > 570){
            play = false;
            ballXDir =0;
            ballYDir =0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD,30));
            g.drawString(" Game Over, Score: " + score ,190,300);

            g.setFont(new Font("serif", Font.BOLD,20));
            g.drawString("Press Enter to Restart" + score ,230,350);
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play){
            if (new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle(playerX,550,100,8))){
                ballYDir = -ballYDir;
            }
            A:for (int i=0; i < map.map.length;i++){
                for (int j = 0; j < map.map[0].length; j++){
                    if (map.map[i][j] > 0){
                        int brickX = j * map.brickWidth + 80;
                        int brickY = j * map.brickHeight + 80;
                        int brickwidth = map.brickWidth;
                        int brickheight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickwidth, brickheight);
                        Rectangle ballRect = new Rectangle(ballposX,ballposY,20,20);

                        if (ballRect.intersects(rect)){
                            map.setBrickValue(0, i, j);
                            totalBricks --;
                            score +=5;

                            if (ballposX + 19 <= rect.x || ballposX + 1 >= rect.x + rect.width) {
                                ballXDir = -ballXDir;
                            } else {
                                ballYDir = - ballYDir;
                            }
                            break A;
                        }
                    }
                }
            }

            ballposX += ballXDir;
            ballposY += ballYDir;
            if (ballposX <0){
                ballXDir = -ballXDir;
            }
            if (ballposY <0){
                ballYDir = -ballYDir;
            }
            if (ballposX > 670){
                ballXDir = -ballXDir;
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if (playerX >=600){
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            if (playerX < 10){
                playerX = 10;
            } else {
                moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if (!play){
                play = true;
                ballposX = 120;
                ballposY = 350;
                ballXDir = -1;
                ballYDir = -2;
                playerX = 310;
                score =0;
                totalBricks = 21;
                map= new MapGenerator(3,7);

                repaint();
            }
        }
    }

    public void moveRight() {
        play = true;
        playerX +=20;
    }

    public void moveLeft() {
        play = true;
        playerX -=20;
    }


}
