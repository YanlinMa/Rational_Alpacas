//Team JackSkellington- Grace Stempel, Andrea Ma
//APCS1 pd10
//HW32- Irrationality Stops Here
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
    public String toString(){
	return num + "/" + den;
    }
    public double floatValue(){
	double num2 = num;
	return num2/den;
    }
    public void multiply(Rational R){
	num = num*R.num;
	den = den*R.den;
    }
    public void divide(Rational R){
	num = num/R.num;
	den = den/R.den;
    }

    //main method
    public static void main(String[] args){
    }

}//end of class Rational
