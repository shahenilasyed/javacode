class Check{
	public static void main(String[] args) {
		
		int Age=30;
		char Sex='F',Maraital_Status='N';
	
	
		if((Age>=20 && Age<=40) && Sex=='M'){
			System.out.printf("you may work anywhere");
		}else if((Age>=40 && Age<=60 ) &&  Sex=='M'){
			System.out.printf("you may work only in urban areas");
		} else if(Sex=='F'){
			System.out.printf("you may work only in urban areas");
		}
	}
}