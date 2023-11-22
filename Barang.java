import java.util.Scanner;

public class Barang {
	public static void main(String[] args) {

		int[] hargaBarang = { 2500, 3000, 4000, 5000, 6000 };
		int[] jumlahBarang = new int[hargaBarang.length];

		Scanner scanner = new Scanner(System.in);


		for (int i = 0; i < hargaBarang.length; i++) {
			System.out.print("Masukkan jumlah barang item-" + (i) + ":");
			jumlahBarang[i] = scanner.nextInt();	
		}


		int totalBelanja = 0;

		System.out.println("\n---Struk Belanja ---");
		for (int i = 0; i < hargaBarang.length; i++) {
			int totalItem = hargaBarang[i] * jumlahBarang[i];
			totalBelanja += totalItem;

			System.out.println("item-" + (i) + ":" + jumlahBarang[i] + "barang * Rp" + hargaBarang[i]);
		}

		System.out.println("\nTOTAL BELANJA: Rp" + totalBelanja);


		scanner.close();
	}
}