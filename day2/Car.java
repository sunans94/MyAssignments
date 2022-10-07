package week1.day2;

import org.apache.poi.util.SystemOutLogger;

public class Car {
public static void main(String[] args){
	Car obj = new Car();
	obj.printCarName();
	String getColor = obj.getColor();
	System.out.println(getColor);
	int addThreenos = obj.addThreenos(6, 7, 8);
	System.out.println(addThreenos);
	double mulTwonos = obj.mulTwonos(2.1, 9.9);
	System.out.println(mulTwonos);
	
}
public void printCarName(){
System.out.println("verna");
}
public int getRegNumber(){
	int RegNumber=8888;
	return RegNumber;
}
public String getColor(){
	String Color = "silver";
	return Color;
}
public Boolean isCarpunctured(){
	boolean type = true;
	return type;
}
public int addThreenos(int add1, int add2, int add3){

	int sum = add1+add2+add3;
	return sum;
}
public int subTwoNos(int sub1,int sub2){
	if (sub2> sub1);
	int subtraction = sub2 - sub1;
	return subtraction;
}
public double mulTwonos(double mul1, double mul2){
	double mul = mul1*mul2;
	return mul;
	
}
public int divTwoNos(int div1, int div2){
	int div = div1/div2;
	return div;
}
}
