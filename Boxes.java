import  java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();

        int boxnumber;

        switch (color) {
            case "red":
                boxnumber = 1;
                break;
            case "green":
                boxnumber = 2;
                break;
            case "black":
                boxnumber = 3;
                break;
            default:
                boxnumber = -1; // Handle unknown colors
                break;
        }

        if (boxnumber != -1) {
            System.out.println(boxnumber);
        } else {
            System.out.println("Unknown color");
        }
    }
}