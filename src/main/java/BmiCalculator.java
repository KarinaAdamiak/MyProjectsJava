import java.util.Scanner;

public class BmiCalculator {

    public static double myBMI(double height, double weight){
        double bmi= weight / (height*height);
        return bmi;

    }
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How tall are you?");
        double height= myScanner.nextDouble();

        System.out.println("How much do you weigh?");
        double weight= myScanner.nextDouble();
        System.out.println(myBMI(height, weight));

        if (myBMI(height,weight)<18.5) {
            System.out.println("Under weight");
        }else if (myBMI(height,weight)>=18.5 && myBMI(height,weight)<=24.9){
            System.out.println("Healthy weight");
        }else if (myBMI(height,weight)>=25.0 && myBMI(height,weight)<=29.9){
            System.out.println("Overweight");
        }else if(myBMI(height,weight)>=30.0 && myBMI(height,weight)<=39.9) {
            System.out.println("Obesity");}
        else{
            System.out.println("Sever obesity");




        }
    }}

