package PR7;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Stack;

public class StackGameInterface extends JFrame {
    JButton addCards1 = new JButton("Add cards to player 1");
    JButton addCards2 = new JButton("Add cards to player 2");
    JButton play = new JButton("Play");
    JLabel winnerLabel = new JLabel("The winner is:");
    JLabel winner = new JLabel("");
    JLabel cards1 = new JLabel();
    JLabel cards2 = new JLabel();
    JLabel player1 = new JLabel();
    JLabel player2 = new JLabel();
    JTextField cards = new JTextField(5);

    public StackGameInterface() {
        super("Пьяница");
        setVisible(true);
        setLayout(null);
        setSize(420, 340);
        Font buttonsFont = new Font("Comic sans ms", Font.PLAIN, 14);
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        add(cards);
        cards.setBounds(160, 20, 80, 20);
        add(addCards1);
        add(addCards2);
        addCards1.setBounds(20, 50, 180, 20);
        addCards1.setFont(buttonsFont);
        addCards2.setBounds(210, 50, 180, 20);
        addCards2.setFont(buttonsFont);
        add(play);
        play.setBounds(165, 200, 70, 20);
        play.setFont(buttonsFont);
        add(winnerLabel);
        winnerLabel.setVerticalAlignment(JLabel.CENTER);
        winnerLabel.setHorizontalAlignment(JLabel.CENTER);
        winnerLabel.setBounds(130, 110, 120, 20);
        winnerLabel.setFont(new Font("Comic sans ms", Font.PLAIN, 14));
        add(winner);
        winner.setVerticalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        winner.setBounds(130, 130, 120, 20);
        winner.setFont(new Font("Comic sans ms", Font.BOLD, 16));
        add(player1);
        player1.setText("First player");
        player1.setVerticalAlignment(JLabel.CENTER);
        player1.setHorizontalAlignment(JLabel.CENTER);
        player1.setBounds(0, 80, 150, 20);
        player1.setFont(new Font("Comic sans ms", Font.BOLD, 13));
        add(player2);
        player2.setText("Second player");
        player2.setVerticalAlignment(JLabel.CENTER);
        player2.setHorizontalAlignment(JLabel.CENTER);
        player2.setBounds(250, 80, 150, 20);
        player2.setFont(new Font("Comic sans ms", Font.BOLD, 13));
        add(cards1);
        cards1.setVerticalAlignment(JLabel.CENTER);
        cards1.setHorizontalAlignment(JLabel.CENTER);
        cards1.setBounds(0, 100, 150, 20);
        add(cards2);
        cards2.setVerticalAlignment(JLabel.CENTER);
        cards2.setHorizontalAlignment(JLabel.CENTER);
        cards2.setBounds(250, 100, 150, 20);

        addCards1.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) { }

            public void mouseClicked(MouseEvent a) {
                String cardsList = cards.getText();
                int[] cardsArr = Arrays.stream(cardsList.split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int i = 0; i < cardsArr.length; i++) {
                    first.add(cardsArr[i]);
                }
                cards1.setText(cards1.getText() + " " + cardsList);
            }

            public void mouseEntered(MouseEvent a) { }

            public void mouseReleased(MouseEvent a) { }

            public void mousePressed(MouseEvent a) { }
        });

        addCards2.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) { }

            public void mouseClicked(MouseEvent a) {
                String cardsList = cards.getText();
                int[] cardsArr = Arrays.stream(cardsList.split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int i = 0; i < cardsArr.length; i++) {
                    second.add(cardsArr[i]);
                }
                cards2.setText(cardsList);
            }

            public void mouseEntered(MouseEvent a) { }

            public void mouseReleased(MouseEvent a) { }

            public void mousePressed(MouseEvent a) { }
        });

        play.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                winner.setText(game(first, second));
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
    }

    public static String game(Stack<Integer> first, Stack<Integer> second) {
        int c = 0;
        for (int i = 0; i < 106; i++) {
            c++;
            if (((first.get(0) == 0) && (second.get(0) == 9)) ||
                    first.get(0) > second.get(0) && ((first.get(0) != 9) && (second.get(0) != 0))) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0) || ((first.get(0) == 9) &&
                    (second.get(0) == 0))) {
                second.add(first.get(0));
                second.add(second.get(0));
            }
            second.remove(0);
            first.remove(0);
            if (second.empty()) {
                return "first " + c;
            } else if (first.empty()) {
                return "second " + c;
            }
        }
        return "botva";
    }

    public static void main(String[] args) {
        new StackGameInterface();
    }
}
