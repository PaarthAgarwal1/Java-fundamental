import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter distance in km : ");
		int a=sc.nextInt();
		double ans=a*0.621371;
		System.out.print("distance in miles : "+ans);
	}
}