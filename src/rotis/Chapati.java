package rotis;

public class Chapati{
    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Chapati(double weight){
        double calmul=2.58;
        double protmul=0.08;
        double carbsmul=0.532;
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
