package selfunit2assignment;
import javax.swing.*;
import java.awt.*;
public class assign1border {



        public static void main(String[] args) {
            JFrame frame = new JFrame("BorderLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JButton btnNorth = new JButton("North");
            JButton btnSouth = new JButton("South");
            JButton btnEast = new JButton("East");
            JButton btnWest = new JButton("West");
            JButton btnCenter = new JButton("Center");

            frame.add(btnNorth, BorderLayout.NORTH);
            frame.add(btnSouth, BorderLayout.SOUTH);
            frame.add(btnEast, BorderLayout.EAST);
            frame.add(btnWest, BorderLayout.WEST);
            frame.add(btnCenter, BorderLayout.CENTER);

            frame.setVisible(true);
        }
    }

