package fruits;

public class Banana {
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Banana(double weight){
        double calmul=0.89;
        double protmul=0.011;
        double carbsmul=0.40;
        double fatsmul=0.228;
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