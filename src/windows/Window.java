package windows;

import java.awt.*;

import javax.swing.*;
import java.util.Random;


public class Window extends JFrame{

    public Window() throws InterruptedException {

        Random r = new Random();
        ImageIcon icon = new ImageIcon("src/hat.png");
        JLabel lbl = new JLabel("ur gay lmao");
        JLabel lbl1 = new JLabel("Bottom text", JLabel.CENTER);
        JPanel jpn = new JPanel();

        jpn.add(lbl);
        lbl.setFont(new Font("Calibri", Font.PLAIN, 24));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.BOTTOM);
        lbl.setVerticalTextPosition(JLabel.CENTER);


        this.add(jpn);
        this.setSize(420,420);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.setVisible(true);
        this.setTitle("all rights reserveated @c okser");

        for (int i = 0; i < 100000; i ++) {

            int random = r.nextInt(1000000000);
            jpn.setBackground(new Color(random));
            int random2 = r.nextInt(1000000000);
            int random3 = r.nextInt(1000000000);
            lbl.setForeground(new Color(random2));
            lbl1.setForeground(new Color(random3));
            Thread.sleep(400);

        }

     }
}
