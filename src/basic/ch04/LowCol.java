package basic.ch04;

public class LowCol {

	public static void main(String[] args) {
		int i;
		int j;
		System.out.println("-------");
		for( i=0; i < 3; i++){
			System.out.print("|");
			for (j=0; j < 3; j++){
				System.out.print(j + "|");
			}
			System.out.println("\n-------");
		}
		System.out.println();
	}

}
