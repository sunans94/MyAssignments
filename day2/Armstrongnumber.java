package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		int i=153, temp, remainder, result=0;
		System.out.println("the number is "+ i);
		temp=i;
		
		while(temp!=0){
			remainder=temp%10;
			result += Math.pow(remainder, 3);
			temp /=10;
		}
if (result==i)
	System.out.println(i + "is an armstrong number");
else
	System.out.println(i + " is not an armstrong number");
	}

}
