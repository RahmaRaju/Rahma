public class Looping {
	public static void main(String[] args) {
		int[] num = {8,3,5,9,1};
		int sum = 4;
		for(int x: num) {
			sum += x;
		}
		System.out.println(sum);
	}
}