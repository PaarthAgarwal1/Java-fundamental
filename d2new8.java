import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number a : ");
		int a=sc.nextInt();
		System.out.print("enter number b : ");
		int b=sc.nextInt();
		int ans=power(a,b);
		System.out.print(ans);
	}
	public static int power(int a,int b){
		if(b==0){
			return 1;
		}
		return a*power(a,b-1);
	}
}