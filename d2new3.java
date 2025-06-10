import java.util.*;
class d2{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius : ");
		int n=sc.nextInt();
		int ans=(n*9)/5 + 32;
		System.out.print("After converting celsius to fahrenheit : "+ans);
	}
}