package hung.dev;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong = 0;
		for (int value = 1; value <=100; value++) {
			tong = tong + value;
		}
		System.out.println("Tong la:" + tong);
	}

}