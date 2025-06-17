package bhaji;

public class Flower{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Flower(double weight){
        double calmul=0.25;
        double protmul=0.02;
        double carbsmul=0.05;
        double fatsmul=0.003;
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