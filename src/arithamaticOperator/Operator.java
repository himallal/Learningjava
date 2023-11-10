package arithamaticOperator;

public class Operator {
	int num1;
	int num2;
	double num3,num4;
	
	
	void add() {
		int sum=num1+num2;
		System.out.println("the sum is"+sum);
	}
void subtract() {
	int difference=num1-num2;
	System.out.println("difference is"+difference);
}
void multiply() {
	int product=num1*num2;
	System.out.println("the product is"+product);
	
}
void division() {
    int quotient =num1/num2;
    int remainder=num1%num2;
   
	System.out.println("the quotient"+quotient);
	System.out.println("the remainder is"+remainder);
	
}
void divide() {
	double quotient=num3/num4;
	System.out.println("the quoatient is"+quotient);
}
}