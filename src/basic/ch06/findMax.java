package basic.ch06;

import java.util.Scanner;

public class findMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt(); 
		int result = find(x, y);
		System.out.println(result);
	}
	static int find(int x, int y) {
	int result; 
	result = x > y ? x : y;
	return result;
	} 
}
