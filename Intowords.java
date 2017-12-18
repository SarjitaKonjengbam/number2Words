package com.sarjita.Arrays;

import java.util.Scanner;

public class Intowords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		words(no/10000000,"crore");
		words((no/100000)%100,"lakh");
		words((no/1000)%100,"thousand");
		words((no/100)%10,"hundred");	
		words(no%100," ");
		
		
	}
	
	public static void words(int n, String st)
	{
		String[] one={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
				"twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String [] two={" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		if(n<20)
		{
			System.out.print(one[n]);
		}
		else
		{
			System.out.print(two[n/10]+ " "+one[n%10]);
		}
		if(n!=0)
		{
			System.out.print(" "+st+" ");
		}
	}

}
