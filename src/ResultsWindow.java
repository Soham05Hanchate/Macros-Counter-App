import javax.swing.*;
import java.awt.*;

public class ResultsWindow {
    JFrame result=new JFrame();
    JLabel protein=new JLabel();
    JLabel calories=new JLabel();
    JLabel carblabel=new JLabel();
    JLabel fatslabel=new JLabel();
    ResultsWindow(float prot,float cal,float carbs,float fats) {

        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        result.setVisible(true);
        result.setSize(300,300);
        result.setLayout(null);
        protein.setText("Proteins are "+prot+" grams");
        calories.setText(" Calories are "+cal);
        carblabel.setText("Carbohydrates are "+carbs+" grams");
        fatslabel.setText("Fats are "+fats+" grams");
        protein.setBounds(0,0,300,50);
        calories.setBounds(0,50,300,50);
        carblabel.setBounds(0,100,300,50);
        fatslabel.setBounds(0,150,300,50);
        result.add(calories);
        result.add(protein);
        result.add(carblabel);
        result.add(fatslabel);
    }
}
