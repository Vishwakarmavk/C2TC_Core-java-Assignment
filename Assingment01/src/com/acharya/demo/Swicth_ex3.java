package com.acharya.demo;

public class Swicth_ex3 {

	public static void main(String[] args) {
	    String name="editor";
	    switch(name.toLowerCase())
	    {
	    case"author":
	    	System.out.println("Vikas");
	    	break;
	    case"team":
	    	System.out.println("Team java Full stack");
	    	break;
	    case"editor":
	    	System.out.println("Vishnu&Krishna");
	    	break;
	    	default:
	    		System.out.println("Invalid entry");
	    	
	    }
	}

}
