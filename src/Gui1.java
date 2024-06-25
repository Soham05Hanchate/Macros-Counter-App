import javax.swing.*;
import java.awt.*;

public class Gui1 {
    Gui1(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CALORIE COUNTER");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(1000,600);
        frame.setResizable(true);

        //------ Panel ------------
        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(900,550));
        panel.setBackground(Color.BLUE);

        //-------- Adding to stuff to frame----------
        frame.add(panel);
        frame.setVisible(true);
    }
}
