import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Graph extends JPanel {
    public Graph() {
       setSize(500, 500);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D) g; // This is if you want to use Graphics2D
        // Now do the drawing here
        ArrayList<Integer> scores = new ArrayList<Integer>(10);

        Random r = new Random();

        for (int i : scores) {
            i = r.nextInt(20);
            System.out.println(r);
        }

        int y1;
        int y2;

        for (int i = 0; i < scores.size() - 1; i++) {
            y1 = (scores.get(i)) * 10;
            y2 = (scores.get(i + 1)) * 10;
            gr.drawLine(i * 10, y1, (i + 1) * 10, y2);
        }
    }
    
}