package breakfast;

public class Milk {
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Milk(double weight){
        double calmul=0.42;
        double protmul=0.034;
        double carbsmul=0.05;
        double fatsmul=0.01;
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