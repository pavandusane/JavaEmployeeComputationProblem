import java.util.Random;

public class empcompute {

	public static void main(String[] args){
		System.out.println("*************************Welcome to Employee Wage Computational Problem************************");
		Random r = new Random();
		int wageperhour=20;
		int fulldayhour=8;
		int parttimehour=4;
		int low = 1;
		int high = 2;
		int randomcheck = r.nextInt(high-low) + low;
		if(randomcheck == 1){
		System.out.println("Emplyee is Present");
		int dailywage=(wageperhour*fulldayhour*randomcheck);
	   System.out.println("DailyWage :"+dailywage);
		int parttimewage=(wageperhour*parttimehour*randomcheck);
		System.out.println("ParttimeWage :"+parttimewage);

		}else{
		System.out.println("Emplyee is absent");
		}
}
}
