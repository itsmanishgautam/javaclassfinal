package selfunit2assignment;
import java.awt.*;
import javax.swing.*;
public class assign1flow {


    public static class FlowLayoutExample {

        JFrame frameObj;

        // constructor
        FlowLayoutExample() {
            // creating a frame object
            frameObj = new JFrame();

            // creating the buttons
            JButton b1 = new JButton("1");
            JButton b2 = new JButton("2");



            // adding the buttons to frame
            frameObj.add(b1);
            frameObj.add(b2);


            // parameter less constructor is used
            // therefore, alignment is center
            // horizontal as well as the vertical gap is 5 units.
            frameObj.setLayout(new FlowLayout());

            frameObj.setSize(300, 300);
            frameObj.setVisible(true);
        }

        // main method
    }


    public static void main(String argvs[]) {
        new FlowLayoutExample();
    }

}