import java.util.Scanner;
public class UcgendeAlanVeCevre {

	public static void main(String[] args) {
		int a, b, c;
		double u, alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1.Kenar� Giriniz: ");
		a = input.nextInt();
		
		System.out.print("2.Kenar� Giriniz: ");
		b = input.nextInt();
		
		System.out.print("3.Kenar� Giriniz: ");
		c = input.nextInt();
		
		u = (a+b+c)/2;
		System.out.println("\n��genin �evresi: "+ u*2);
		
		alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		System.out.println("��genin Alan�: "+ alan);
		
		input.close();
	}
}
