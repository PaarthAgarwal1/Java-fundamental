import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length of rectangle : ");
		int l=sc.nextInt();
		System.out.print("enter the breadth of rectangle : ");
		int b=sc.nextInt();
		int ans=2*(l+b);
		System.out.print("perimeter of rectangle : "+ans);
	}
}