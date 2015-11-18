//Team NightmareBeforeChristmas- Andrea Ma, Sarah Yoon
//APCS1 pd10
//HW33- Do You Even Add, Bro?
//2015-11-18

public class Rational {

    //Instance Variables
    private int num;
    private int den;

    //Default Constructor
    public Rational(){
	num = 0;
	den = 1;
    }

    //Overloaded Constructor
    public Rational(int x, int y){
	this();
	if (y==0) {
	    System.out.println("Error: undefined.");
	}
	else {    
	    num = x;
	    den = y;
	}
    }

    //Methods
    
    //returns Rational as "a/b" (e.g. "1/2")
    public String toString(){
	return num + "/" + den;
    }

    //returns floating value of numerator (typecasted as double) divided by denominator
    public double floatValue(){
	double num2 = num;
	return num2/den;
    }

    //multiplies numerators, multiplies denominators
    public void multiply(Rational R){
	num = num*R.num;
	den = den*R.den;
    }
    
    //divides numerators, divides denominators
    public void divide(Rational R){
	num = num/R.num;
	den = den/R.den;
    }

    //adds two rational objects
    public void add(Rational R){
	num = num*R.den+den*R.num;
	den = den*R.den;
    }

    //substracts two rational objects
    public void subtract(Rational R){
	num = num*R.den-den*R.num;
	den = den*R.den;
    }

    //

    //main method -- Diagnostics
    public static void main(String[] args){
    }

}//end of class Rational
