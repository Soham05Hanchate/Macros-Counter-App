package fruits;

public class Apple {

    public float prot=0;
    public float cal=0;
    public float carbs=0;
    public float fats=0;
    public Apple(double weight){
        double calmul=0.52;
        double protmul=0.003;
        double carbsmul=0.14;
        double fatsmul=0.3;
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
