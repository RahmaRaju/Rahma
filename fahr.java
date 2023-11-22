import java.util.Scanner;

public class fahr {

    // Define the fahr() method to convert Celcius to Fahrenhit
    static double fahr(double celcius) {
        double fahrenhit = 1.8 * celcius + 32;
        return fahrenhit;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c)); // Call the fahr() method and print the result
    } 
}
