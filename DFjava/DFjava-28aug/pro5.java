
class Factorial{

	public static void main(String[] args) {
		
	 int x=5;

	 int flag=1,rem,temp=x;
	 do{
		rem=x%10; 
		flag=flag*rem;
		x--;
	   }while(x>=1);
	   System.out.printf("Factorial of %d is %d",temp,flag);
	}
}