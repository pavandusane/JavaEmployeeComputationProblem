import java.util.Random;

public class empcompute {

	public static void main(String[] args){
		System.out.println("*************************Welcome to Employee Wage Computational Problem************************");
		Random r = new Random();
		int low = 1;
		int high = 2;
		int randomcheck = r.nextInt(high-low) + low;					
		if(randomcheck == 0){
		System.out.println("Emplyee is Present");
		}else{
		System.out.println("Emplyee is absent");
		}
}
}
