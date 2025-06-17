package bhaji;

public class Batata{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Batata(double weight){
        double calmul=0.86;
        double protmul=0.016;
        double carbsmul=0.2;
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
