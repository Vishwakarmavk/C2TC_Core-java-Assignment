package com.acharya.demo;

public class Forloop_ex2 {

	public static void main(String[] args) {
		int num=8;
		boolean isPrime=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime==true)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("the number is a not a prime number");
		}
	}

}
