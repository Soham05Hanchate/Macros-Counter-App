package bhaji;

public class Shepu{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Shepu(double weight){
        double calmul=0.2;
        double protmul=0.1;
        double carbsmul=0.03;
        double fatsmul=0.02;
        double calories=calmul*weight;
        double protein=protmul*weight;
        double carbohydrates=carbsmul*weight;
        double fat=fatsmul*weight;
        prot=(float)protein;
        cal=(float)calories;
        carbs=(float)carbohydrates;
        fats=(float)fat;
    }
}
