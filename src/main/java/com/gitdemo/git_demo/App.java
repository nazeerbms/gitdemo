package com.gitdemo.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome to git demo");
		}
		
	}

	public void newAddMethod() {
		
			System.out.println("Welcome to New Add Method Added by 2nd Dev");
			System.out.println("Added extra print");
		
	}
	
	public static void main( String[] args )
	{
	      System.out.println( "Hello World!" );
	}
}
