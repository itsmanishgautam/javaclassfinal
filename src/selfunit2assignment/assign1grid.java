package selfunit2assignment;
import java.awt.*;
import javax.swing.*;
public class assign1grid {



    public static class GridLayoutExample
    {
        JFrame frameObj;

        // constructor
        GridLayoutExample()
        {
            frameObj = new JFrame();

// creating 9 buttons
            JButton btn1 = new JButton("1");
            JButton btn2 = new JButton("2");


// adding buttons to the frame
// since, we are using the parameterless constructor, therfore;
// the number of columns is equal to the number of buttons we
// are adding to the frame. The row count remains one.
            frameObj.add(btn1); frameObj.add(btn2);

// setting the grid layout using the parameterless constructor
            frameObj.setLayout(new GridLayout());


            frameObj.setSize(300, 300);
            frameObj.setVisible(true);
        }

        // main method

    }
    public static void main(String argvs[])
    {
        new GridLayoutExample();
    }



}
