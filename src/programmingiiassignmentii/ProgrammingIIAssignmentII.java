
package programmingiiassignmentii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProgrammingIIAssignmentII {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Car> cars = new ArrayList<>();
        
        String inputFileName = JOptionPane.showInputDialog(null, "What is the name of the input file?");
        String outputFileName = JOptionPane.showInputDialog(null, "What is the name of the output file?");
        
        try (Scanner scnr = new Scanner(new File(inputFileName))) {
            OUTER:
            while (scnr.hasNext()) {
                switch (scnr.next()) {
                    case "Green":
                        {
                            String x;
                            String y;
                            String z;
                            double a;
                            double b;
                            scnr.next();
                            x = scnr.next();
                            y = scnr.next();
                            a = scnr.nextDouble();
                            z = scnr.next();
                            b = scnr.nextDouble();
                            
                            cars.add(new GreenCar(x, y, a, z, b));
                            break;
                        }
                    case "SUV":
                        {
                            String x;
                            String y;
                            int z;
                            double a;
                            double b;
                            x = scnr.next();
                            y = scnr.next();
                            a = scnr.nextDouble();
                            z = scnr.nextInt();
                            b = scnr.nextDouble();
                            cars.add(new SUV(x, y, a, z, b));
                            break;
                        }
                    
                    case "Used":
                    {
                        String a;
                        String b;                     
                        double c;
                        double d;                       
                        int x;
                        int y;                        
                        scnr.next();                       
                        a = scnr.next();
                        b = scnr.next();
                        c = scnr.nextDouble();
                        x = scnr.nextInt();
                        d = scnr.nextDouble();
                        y = scnr.nextInt();                       
                        cars.add(new UsedSUV(a, b, c, x, d, y));
                        break;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Please check file's name.");
            }
        
        int i;
        try (PrintWriter out = new PrintWriter(new FileWriter(outputFileName))) {
            for(i = 0; i < cars.size(); i++){
                System.out.println(cars.get(i));
                out.println(cars.get(i).toString());
            }
            
            boolean suvSame1 = cars.get(2).equals(cars.get(3));
            boolean suvSame2 = cars.get(4).equals(cars.get(5));
            boolean greenSame = cars.get(0).equals(cars.get(1));
            boolean usedSUVSame = cars.get(6).equals(cars.get(7));
            
            out.println("Are the first and second SUV equal: " + suvSame1);
            out.println("Are the third and fourth SUV equal: " + suvSame2);
            out.println("Are the two Green Cars equal: " + greenSame);
            out.println("Are the two Used SUV equal: " + usedSUVSame);
            
            SUV red = (SUV) cars.get(2);
            red.setDiscount(20);
            out.println("The first SUV's discount has been changed to 20%.");
            out.println("The first SUV's new price is " + red.getActualPrice());
            
            GreenCar blue = (GreenCar)cars.get(0);
            blue.setPremiumPrice(20);
            out.println("The first Green Car's premium discount has been changed to 20%.\n"
                    + "The first Green Car's new price is " + blue.getActualPrice());
            
            UsedSUV green = (UsedSUV)cars.get(6);
            green.setDiscount(5);
            out.println("The first Used SUV's discount has been changed to 5%.\n"
                    + "The first Used SUV's new price is " + green.getActualPrice());
            
            
          
            
        }
    
        
        
    }

}
