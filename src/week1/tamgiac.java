package week1;
import java.util.Scanner;
public class tamgiac {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n: ");
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 2*n - 1; j++) {
				if( j <= n + i -1  && j >= n - i + 1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
