import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_storing {
    float protein,calories,carb,fat;
    data_storing(float prot,float cal,float carbs,float fats){
        this.protein=prot;
        this.calories=cal;
        this.carb=carbs;
        this.fat=fats;
        LocalDateTime dt= LocalDateTime.now();

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        String myDate= dt.format(df);

        try {
           // FileWriter file= new FileWriter("C:\\Users\\Soham\\Desktop\\healthdata.txt");
            BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\Soham\\Desktop\\healthdata.txt", true));
            file.write("\n"+myDate+"\nProteins:"+protein+"\nCalories:"+calories+"\nCarbohydrates:"+carb+"\nFats:"+fat+"\n");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
