package hung.dev;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		while (i <= 100) {
			sum = sum +i;
			i++;
		}
		System.out.println("Tong 100 so la: " +sum);

	}
}