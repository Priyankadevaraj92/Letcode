package first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {	
public static void main(String[] args) {
	System.out.println("Enter some input");
	Scanner sc=new Scanner(System.in);  //here i can receive from console
	/*int num=sc.nextInt();   //here it can be string,boolean,char 
	                //nextInt()-->Scans the next token of the input as an int. 
	 System.out.println(num);//here if u enter no's in console it will print the same no. in next line
	//int a=num%0;   //--->arithmetic exception we have to use try catch(or try finally) to handle the exception
	//System.out.println(a);
	// System.out.println("completed");
	try {
		int a=num%0;  
		System.out.println(a); 
	} catch (ArithmeticException e) {
		//System.out.println(e);//--->console (java.lang.ArithmeticException: / by zero)
	//e.printStackTrace();//console it will print full error msg
	System.out.println(e.getMessage()); //--> it will print only msg(by zero)
	}
	System.out.println("completed");// here it handled the exception and printed next line( completed)
	//if i enter some letters instead of num it will throw exception in line(int num=sc.nextInt())
	 */
	
	try {
		int num=sc.nextInt();
		int a=num%0;  
		System.out.println(a); 
	} catch (ArithmeticException e) {
	//System.out.println(e.getMessage()); //--> it will print only msg(by zero)
	System.err.println("Divisible by 0 not possible");// if you enter no. it will print Divisible by 0 not possible in red color
	}catch (InputMismatchException e) { //if u run without this catch by entering letters it will throw java.util.InputMismatchException
	 	System.err.println("Input must be number");// if you enter letters it will print Input must be number in red color
	}catch (Exception e) {
		System.err.println("Unknown error"); //-->if we use only exception class instead of arithmetic and input mismatch exception class ,
	                                          //it will print Unknown error even if enter num or letter but its not good way coding
	} // you cant use exception class 1st and followed by their child (arithmetic & inputhandling or some other)it will show error while u use child class
	    // if u select ArithmeticException and click F4 u can see the hierarchy
	finally {   //finally will execute if it goes inside the try block or catch block
	sc.close();	     //there is warning resource leaked sc. is never used
		
	}// finally will used mainly to close ex. if u read anything from database, we have close database connections
		System.out.println("completed");
}
}
