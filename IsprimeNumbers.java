package week.day2;

public class IsprimeNumbers {

		public static void main(String[] args) {
			int input=3;
			boolean notPrimeFlag=false;
			for(int i=2; i<=(input-1);i++) 
			{
				if((input%i)==0)
	{

		notPrimeFlag=true;
	}
			}
			if(notPrimeFlag==false)
			{
				System.out.println("IsprimeNumber="+ input);
			}else {
				
			}
				
			System.out.println("IsprimeNumber="+ input);
			}
	
}		

