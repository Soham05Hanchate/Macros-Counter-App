package Nuts;

public class Kaju {

     public float prot=0;
     public float cal=0;
     public float carbs=0;
     public float fats=0;
     public Kaju(double weight){
        double calmul=5.53;
        double protmul=0.1822;
        double carbsmul=0.3019;
        double fatsmul=0.4385;
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