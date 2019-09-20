package Coulomb;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("this app calqulates the Coulomb Force Between 2  loads");
        Scanner myObj = new Scanner(System.in);

        System.out.println("enter the first load :");

        int load1 = myObj.nextInt();
        System.out.println("enter the second load :");

        int load2 = myObj.nextInt();
        String calcUn;
        do {

            System.out.println("enter the calculation Unit(C or mC or nC)");

            calcUn = myObj.nextLine();

        }while(!calcUn.equals("C") && !calcUn.equals("mC") && !calcUn.equals("nC"));
        final double K= 9*(Math.pow(10,9));

        double distance;

        do{
        System.out.println("enter the distance between the loads in meters ");

            distance = myObj.nextDouble();


        }while(distance<=0);

         double F;
        if(calcUn.equals("C")){

            F=K*(load1*load2)/(Math.pow(distance,2));


        }else if(calcUn.equals("mC")){
            F=K*(load1*10^(-6)*load2*10^(-6))/(Math.pow(distance,2));




        }else{
            F=K*(load1*10^(-12)*load2*10^(-12))/(Math.pow(distance,2));
        }




        System.out.println("The coulomb Force between the 2 loads is: "+ F);

    }
}
