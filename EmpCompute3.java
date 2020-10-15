import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmpCompute3 {
public static final int isPresent=1;
public static final int noofdays=20;
private int wageperhour,fulldayhour,parttimehour;

public EmpCompute3(int i, int j, int k) {
		this.wageperhour=i;
		this.fulldayhour=j;
		this.parttimehour=k;
}

public int[] CalWage() {
	        Random rand = new Random(); 
			int	totalhours=0,totaldays=0,dailywage=0,parttimewage=0,monthlyfulltimewage=0,monthlyparttimewage=0,x=1,totalwage,day=1;
	        int persontype = rand.nextInt(2); 	        
			int[] arr=new int[20];
	        while (true) 
	        {
				if (totalhours < 100) 
				{
					if (totaldays < 20) 
					{
						java.util.Random random = new java.util.Random();
					    int randomcheck = random.nextInt(2) + 1;
					    
						switch (randomcheck)
						{
						case 1:
							System.out.println("Employee is present on day : "+day);
							if(persontype==0)
							{
								dailywage=(wageperhour*fulldayhour*randomcheck);
								System.out.println("FulltimeWage for Day :"+day+" is "+dailywage);
								arr[x]=dailywage;
								monthlyfulltimewage=(monthlyfulltimewage+dailywage);
								arr[x]=monthlyfulltimewage;
								System.out.println("Monthly full time wage : "+monthlyfulltimewage);
								totalhours=totalhours+8;
								x=x+1;
								day=day+1;
								totalwage=monthlyfulltimewage;
							}else {
								parttimewage=(wageperhour*parttimehour*randomcheck);
								System.out.println("ParttimeWage for Day :"+day+" is "+parttimewage);
								arr[x]=parttimewage;
								monthlyfulltimewage=(monthlyfulltimewage+parttimewage);
								arr[x]=monthlyparttimewage;
								System.out.println("Monthly part time wage : "+monthlyfulltimewage);
								totalhours=totalhours+4;
								x=x+1;
								day=day+1;
								totalwage=monthlyfulltimewage;

							}
							totaldays=totaldays+1;
						case 2:
							System.out.println("Employee is absent on day : "+day);
							totaldays=totaldays+1;						
							day=day+1;

						}
					}else {break;}
	        }else {break;}
	      }	        
	        arr[0]=totalhours;
	        arr[1]=totaldays;
	        arr[2]=monthlyfulltimewage;
	        return arr;
	}	
	public static void main(String[] args) {
		System.out.println("*************************Welcome to Employee Wage Computational Problem************************");
		ArrayList<EmpCompute3> EmpWageBuilder1 = new ArrayList<EmpCompute3>(); // Create an ArrayList object
		EmpWageBuilder1.add(new EmpCompute3(20,8,4));
		EmpWageBuilder1.add(new EmpCompute3(10,10,5));
		System.out.println("Which Company Employee Wage You Want(DMART[1] or RELIANCE[2]) : ");
	    Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    int arr4[]=new int[4];
	    int opt=sc.nextInt();
	    switch (opt) {
		case 1:
			System.out.println("********************************DMART***********************************");
			arr4=EmpWageBuilder1.get(0).CalWage(); //int wageperhour,int fulldayhour,int parttimehour

			System.out.println("Monthly wage : "+arr4[2]);
	        System.out.println("==================DMART Total Wages=========================");
	        System.out.println("Total Wage of DMART is : "+arr4[2]);
			break;
			
		case 2:
			System.out.println("********************************Reliance***********************************");
			arr4=EmpWageBuilder1.get(1).CalWage(); //int wageperhour,int fulldayhour,int parttimehour
			System.out.println("Monthly wage : "+arr4[2]);
	        System.out.println("==================Reliance Total Wages=========================");
	        System.out.println("Total Wage of Reliance is : "+arr4[2]);
			break;

		default:
			break;
		}
 	}
}
