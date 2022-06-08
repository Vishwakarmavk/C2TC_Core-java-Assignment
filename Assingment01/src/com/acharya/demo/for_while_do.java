package com.acharya.demo;

public class for_while_do {

	public static void main(String[] args) {
		//for loop
		for(int i=1,j=1;i<10||j<10;i++,j++)
		{
			j++;
			System.out.println("i="+i+"andj="+j);
		}
		//while loop
		int i=1,j=1;
		while(i<10||j<10)
		{
			i++;j++;
			System.out.println("i="+i+"and j="+j);
		}
		//do while loop
		float k=1,m=1;
		do {
			k++;
		m++;
			System.out.println("k="+k+"and m="+m);
		}while(k<10||m<10);
			
	}

}
