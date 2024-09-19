package app;

public class Main {
    private static final double CONV_K = 2.2046;

    public static void main(String[] args){
        System.out.println("Convert App");
        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsToPound(kgs);
        double kilos = convPoundToKilos(pnds);
        System.out.println("Result is " + pounds + " pounds and " + kilos + " kgs.");
    }

    private static double convKgsToPound(double kgs){
        return kgs*CONV_K;
    }
    private static double convPoundToKilos(double pnds){
        return pnds/CONV_K;
    }
}
