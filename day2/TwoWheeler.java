package week1.day2;


public class TwoWheeler {
public static void main(String[] args){

	TwoWheeler obj= new TwoWheeler();
	int noOfWheels= obj.noOfWheels();
	System.out.println(noOfWheels);
	short noOfMirrors= obj.noOfMirrors();
	System.out.println(noOfMirrors);
	long chassisNumber= obj.chassisNumber();
	System.out.println(chassisNumber);
	boolean isPunctured = obj.isPunctured();
	System.out.println(isPunctured);
	String bikeName = obj.bikeName();
	System.out.println(bikeName);
	double runningKM = obj.runningKM();
	System.out.println(runningKM);
	
}
public int noOfWheels(){
	int noOfWheels = 2;
	return noOfWheels;
	
}
public short noOfMirrors(){
	short noOfMirrors = 2;
	return noOfMirrors;
}
public long chassisNumber(){
	long chassisNumber = 123456;
	return chassisNumber;
}
public boolean isPunctured(){
	boolean isPunctured = true;
	return isPunctured;
}
public String bikeName(){
String bikeName="Pulsar";
return bikeName;
}
public double runningKM(){
	double runningKM = 25.90;
	return runningKM;
}
}
