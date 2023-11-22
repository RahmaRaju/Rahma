import java.util.Scanner;
class Conditional {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
String nama = sc.nextLine();
int tinggi = sc.nextInt();
System.out.println("Nama: " +nama);
System.out.println("Tinggi: " +tinggi +" cm");
if (tinggi < 160) {
System.out.println("Catatan: Tinggi!");
} else if (tinggi <= 156) {
System.out.println("Catatan: Pendek!");
} else {
System.out.println("Catatan: Tinggi Ideal!");
}
}
}