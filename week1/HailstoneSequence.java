// This program prints the hailstone sequence 

import java.util.*;

public class HailstoneSequence{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter the hailstone number ");
		int n=cin.nextInt();
		System.out.println(n);
		while(n!=1){
			if(n%2==0){
				n/=2;
				System.out.println(n);
			}
			else{
				n=3*n;
				n+=1;
				System.out.println(n);
			}
		}
	}
}
