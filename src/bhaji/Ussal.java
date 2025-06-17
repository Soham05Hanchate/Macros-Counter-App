package bhaji;

public class Ussal {
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Ussal(double weight){
        double calmul=1.134;
        double protmul=0.085;
        double carbsmul=0.195;
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
