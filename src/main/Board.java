package main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Board {
    final int maxCol =8 ;
    final int maxRow = 8;
    public static final int squareSize = 100;
    public static final int halfSquareSize = squareSize / 2;

    public void draw(Graphics2D g2) {

        int c =0;
        
        for (int row =0; row < maxRow; row ++) {

            for(int col =0; col < maxCol; col++) {

                if (c == 0) {
                    g2.setColor(new Color(210,165,125));
                    c = 1;
                }

                else {
                    g2.setColor(new Color(175,115,70));
                    c = 0;
                }
                g2.fillRect(col*squareSize, row*squareSize, squareSize,squareSize);
            }
          if (c ==0) {
            c = 1;
          }
          else {
            c = 0;
          }
        }
    }
}
