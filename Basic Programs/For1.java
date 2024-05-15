import java.util.*;

class For1 {
	public static void fact(int n) {
		int i, f = 1;
		for (i = n; i >= 1; i--) {
			if (i == 1)
				System.out.print(i);
			else
				System.out.print(i + " x ");
			f = f * i;
		}
		System.out.print(" = " + f);
	}

	public static void main(String as[]) {
		int x;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the No. = ");
		x = obj.nextInt();
		fact(x);
		obj.close();
	}
}