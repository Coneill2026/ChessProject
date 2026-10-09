package main;

import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {

        JFrame window = new JFrame("Cians Chess"); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true); 


        //Add game panel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        gp.launchGame();



        }
}