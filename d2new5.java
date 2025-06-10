import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of cylinder : ");
		int r=sc.nextInt();
		System.out.print("Enter the height of cylinder : ");
		int h=sc.nextInt();
		double ans=(3.14*r*r*h);
		System.out.print("Volume of Cylinder : "+ans);
	}
}