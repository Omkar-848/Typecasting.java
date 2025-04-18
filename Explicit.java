package Typecasting;

//2.Explicit Typecasting (Narrowing)
//Explicit typecasting is when a larger data type is converted into a smaller data type. 
//This requires the programmer to explicitly cast the value using parentheses ().

public class Explicit {
            public static void main(String[] args) {
	        double num = 9.99;
	        int result = (int) num; // Explicit casting from double to int
	        System.out.println("The value of result: " + result);
	    }
	}


