package app;

public class Main {
    private static final double CONV_K = 2.2046;

    public static void main(String[] args){
        System.out.println("Convert App");
        double kgs = 5;
        double pounds = convKgsToPound(kgs);
        System.out.println("Result is " + pounds + " pounds.");
    }
    private static double convKgsToPound(double kgs){
        return kgs*CONV_K;
    }
}
