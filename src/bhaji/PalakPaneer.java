package bhaji;

public class PalakPaneer{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public PalakPaneer(double weight){
        double calmul=1.2;
        double protmul=0.06;
        double carbsmul=0.05;
        double fatsmul=0.09;
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