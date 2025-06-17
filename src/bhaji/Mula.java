package bhaji;

public class Mula{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Mula(double weight){
        double calmul=0.14;
        double protmul=0.007;
        double carbsmul=0.034;
        double fatsmul=0.001;
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