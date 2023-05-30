package MainPackage;
import java.util.Scanner;
//this is not from tutorial
public class InterestAndDiscount {

	public static double capital;
	public static double interest;
	public static double inflation;
	public static double duration;

	
	public static void main(String[] args) {
		
	System.out.println("Provide the data for calculations:");
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is the starting capital: ");
	capital = scanner.nextDouble();
	System.out.println("What is the rate of interest in %: ");
	interest = scanner.nextDouble();
	System.out.println("What is the inflation rate in %: ");
	inflation = scanner.nextDouble();
	System.out.println("How long is the duration in years: ");
	duration = scanner.nextDouble();
	Calculator calculator1 = new Calculator(capital, interest, inflation, duration);
	
	calculator1.creditPayments();
	calculator1.capitalIncrease();
	calculator1.capitalDecrease();
	calculator1.getInfo();

	
	scanner.close();
		
	}
	

	}
	


