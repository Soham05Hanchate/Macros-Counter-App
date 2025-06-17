package bhaji;

public class Methi{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Methi(double weight){
        double calmul=0.32;
        double protmul=0.03;
        double carbsmul=0.07;
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
