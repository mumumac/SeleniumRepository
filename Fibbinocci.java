package week.day2;

public class Fibbinocci {
public static void main(String[] args) {
	int firstNum = 0;
	int secNum =1;
	int sum =0;
	System.out.println("fibbinocci:");
	for (int i = 0; i <11; i++) {
		
		sum =firstNum + secNum;
		firstNum = secNum;
		secNum =sum;
	firstNum = sum;
		System.out.println(sum);
		
		
	}
}
}
