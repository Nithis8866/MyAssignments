package week2.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int range=6;
		int firstNum=0;
		int secondNum=1;
		int sum;
		for (int i =1; i <=range; i++) {
			System.out.println(firstNum+" ");
			sum=firstNum+secondNum;
			secondNum=firstNum;
			firstNum=sum;
			
		}
	}

}
