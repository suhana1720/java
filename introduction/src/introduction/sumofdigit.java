package introduction;
import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{int lastdigit=temp%10;
	temp/=10;
	sum=sum+lastdigit;}
		System.out.println(sum +" " +"is the sum of digits of a no.");
	
	
	}

}
