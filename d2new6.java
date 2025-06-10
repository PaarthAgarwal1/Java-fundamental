import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the principal amount: ");
		int p=sc.nextInt();
		System.out.print("enter the interest rate: ");
		int r=sc.nextInt();
		System.out.print("enter the time period : ");
		int t=sc.nextInt();
		double ans=(p*r*t)/100;
		System.out.print(ans);
	}
}