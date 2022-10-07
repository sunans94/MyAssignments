package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=7;
		int count=0;
		
		if (n<=1){
			System.out.println("this number is not a prime number");
			return;
		}
		
for (int i=1;i<=n/2;i++){
	if(n%i==0){
		count++;
	}
	}
if(count > 1){
	System.out.println("The number is not prime");
}
else{
	System.out.println("the number is prime");
}
}
}