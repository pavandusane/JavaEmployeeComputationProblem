import java.util.Random;

public class empcompute {

	public static void main(String[] args) {
		System.out.println("*************************Welcome to Employee Wage Computational Problem************************");
        Random rand = new Random(); 
		int isPresent=1;
		int wageperhour=20;
		int fulldayhour=8;
		int parttimehour=4;
		int totalhours=0;
		int totaldays=0;
		int dailywage=0;
		int parttimewage=0;
		int monthlyfulltimewage=0;
		int monthlyparttimewage=0;
      int persontype = rand.nextInt(2); 
      int noofdays=20;
      int x=1;
		int[] arr=new int[20];
		int[] arr1=new int[20];
        System.out.println(persontype);
		
        while (true) 
        {
			if (totalhours < 100) 
			{
				if (totaldays < 20) 
				{
					Random r = new Random();
					int low = 1;
					int high = 2;
					int randomcheck = r.nextInt(high-low) + low;					

					switch (randomcheck)
					{
					case 1:
						System.out.println("Employee is present");
						if(persontype==0)
						{
							dailywage=(wageperhour*fulldayhour*randomcheck);
							System.out.println("DailyWage :"+dailywage);
							arr[x]=dailywage;
							totalhours=totalhours+8;
							x=x+1;
						}else {
							parttimewage=(wageperhour*parttimehour*randomcheck);
							System.out.println("ParttimeWage :"+parttimewage);
							arr[x]=parttimewage;
							totalhours=totalhours+4;
							x=x+1;
						}
						totaldays=totaldays+1;
					case 2:
						System.out.println("Employee is absent");
						totaldays=totaldays+1;						
					}							
				}else {
					break;
				}
        }	else {
        	break;
        }
        }
		System.out.println("Total work hours "+totalhours);
        System.out.println("Total Days : "+totaldays);
	}
}
