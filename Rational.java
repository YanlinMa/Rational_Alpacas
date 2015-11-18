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

    //returns gcd of numerator and denominator, Euclidean Algo
    public  int gcd() {
	int ret = 1; int a = num; int b = den;
	if (a==b) {
	    ret = a;
	}
	else {
	    while (a!=0 && b!= 0) {
		if (a>b) {
		    a = a%b;
		    ret= b;
		}
		else {
		    b=b%a;
		    ret =a;
		}
	    }
	}
	return ret;
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

    //reduces fraction, using gcd
    public void reduce() {
	int g = gcd();
	num /= g;
	den /= g;
    }
    
    //main method -- Diagnostics
    public static void main(String[] args){
	Rational n = new Rational(1,3);
	Rational m = new Rational(3,2);
	n.multiply(m);
	System.out.println(n);
	
	System.out.println(n.gcd());
	
	n.reduce();
	System.out.println(n);
	m = new Rational(7,6);
	n.add(m);
	System.out.println(n);
	n.reduce();
	System.out.println(n);
	
    }

}//end of class Rational
