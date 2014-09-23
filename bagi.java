import java.util.Scanner;
public class bagi{
public static void main(String[] args)
{
	Scanner in = new Scanner (System.in);
	int x, y, z;
	System.out.print("input nilai pertama = ");
	x =in.nextInt();
	System.out.print("input nilai kedua = ");
	y =in.nextInt();
	z = x / y;
	System.out.println("Hasil= " + z);
	}
}