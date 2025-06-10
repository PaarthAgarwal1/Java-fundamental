import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number a : ");
		int a=sc.nextInt();
		System.out.print("enter number b : ");
		int b=sc.nextInt();
		System.out.print("enter number c : ");
		int c=sc.nextInt();
		double ans=(a+b+c)/3;
		System.out.print("average of above three number is : "+ans);
	}
}