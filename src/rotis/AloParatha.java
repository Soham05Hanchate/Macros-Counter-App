package rotis;

public class AloParatha{
    public float prot= 0.037F;
    public float cal=0.7735F;
    public float carbs=0;
    public float fats=0;
    public AloParatha(double weight){
        double calmul=1;
        double protmul=1;
        double carbsmul=1;
        double fatsmul=1;
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
