package pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Border extends JFrame {
    private int ACMilanNum = 0;
    private int RealMadridNum = 0;
    JPanel[] pnl = new JPanel[3];

    public String getWinner(int ACMilan, int RealMadrid) {
        if (ACMilan > RealMadrid) return "AС Milan";
        else if (ACMilan < RealMadrid) return "Real Madrid";
        else return "N/A";
    }

    public Border() {
        super("AC Milan/Real Madrid");
        setLayout(new GridLayout(1,3));
        setSize(1000, 600);

        Font font1 = new Font("Times New Roman", Font.PLAIN, 20);
        Font font2 = new Font("Times New Roman", Font.BOLD, 26);
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }

        JButton btn1 = new JButton("AC Milan");
        JButton btn2 = new JButton("Real Madrid");

        JLabel label1 = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel label3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        label1.setFont(font1);
        label2.setFont(font1);
        label3.setFont(font2);
        btn1.setFont(font2);
        btn2.setFont(font2);

        pnl[0].add(btn1, BorderLayout.CENTER);
        pnl[2].add(btn2, BorderLayout.CENTER);

        pnl[1].setBackground(new Color(255, 240, 245));
        btn1.setBackground(new Color(255, 20, 147));
        btn2.setBackground(new Color(0, 0, 255));

        pnl[1].add(label1, BorderLayout.SOUTH);
        pnl[1].add(label2, BorderLayout.NORTH);
        pnl[1].add(label3, BorderLayout.CENTER);

        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ACMilanNum++;
                label1.setText("Result: " + ACMilanNum + " X " + RealMadridNum);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: " + getWinner(ACMilanNum, RealMadridNum));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RealMadridNum++;
                label1.setText("Result: " + ACMilanNum + " X " + RealMadridNum);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: " + getWinner(ACMilanNum, RealMadridNum));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Border().setVisible(true);
    }
}
