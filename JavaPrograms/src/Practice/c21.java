package Practice;

public class c21 {

	public static void main(String[] args) {

		int res = 0;

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 10; j++) {
				res = res * i / j;
			}
		}
		System.out.println(res);

	}

}
