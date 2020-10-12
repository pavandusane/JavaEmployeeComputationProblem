import java.util.Random;

public class EmpCompute3 {
public static final int isPresent=1;
public static final int wageperhour=20;
public static final int fulldayhour=8;
public static final int parttimehour=4;
public static final int noofdays=20;

	public void CalWage() {
	        Random rand = new Random(); 
			int	totalhours=0;
			int	totaldays=0;
			int	dailywage=0;
			int	parttimewage=0;
			int	monthlyfulltimewage=0;
			int	monthlyparttimewage=0;
	        int persontype = rand.nextInt(2); 	        
	        int	x=1;
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
								monthlyfulltimewage=(monthlyfulltimewage+dailywage);
								arr1[x]=monthlyfulltimewage;
								System.out.println("Monthly full time wage : "+monthlyfulltimewage);
								totalhours=totalhours+8;
								x=x+1;
							}else {
								parttimewage=(wageperhour*parttimehour*randomcheck);
								System.out.println("ParttimeWage :"+parttimewage);
								arr[x]=parttimewage;
								monthlyparttimewage=(monthlyparttimewage+parttimewage);
								arr1[x]=monthlyparttimewage;
								System.out.println("Monthly part time wage : "+monthlyparttimewage);
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
	        System.out.println("Monthly fulltime wage : "+monthlyfulltimewage);
	        System.out.println("Monthly parttime wage : "+monthlyparttimewage);

	}
	public static void main(String[] args) {
		System.out.println("*************************Welcome to Employee Wage Computational Problem************************");
		EmpCompute3 ep = new EmpCompute3();
		ep.CalWage();
 	}
}
