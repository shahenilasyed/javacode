class Bill{


public static void main(String[] args) {
	


	int unit=40;
	float unit_1;
	float total;
	
	
	if(unit<=50){
			unit_1=0.50f;
			total=unit*unit_1;
			System.out.printf("for %d The Total electricity bill is %.2f",unit,total);
		}else if(unit>50 && unit<=150){
			unit_1=0.75f;
			total=unit*unit_1;
			System.out.printf("for %d The Total electricity bill is %.2f",unit,total);
		}else if(unit>150 && unit<= 250){
			unit_1=1.20f;
			total=unit*unit_1;
			System.out.printf("for %d The Total electricity bill is %.2f",unit,total);
		}else if(unit >250){
			unit_1=1.50f;
			total=unit*unit_1;
			System.out.printf("for %d The Total electricity bill is %.2f",unit,total);
	}
}
}	