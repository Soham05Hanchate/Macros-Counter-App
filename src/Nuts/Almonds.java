package Nuts;

public class Almonds {
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Almonds(double weight){
        double calmul=5.76;
        double protmul=0.26;
        double carbsmul=0.2155;
        double fatsmul=0.494;
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