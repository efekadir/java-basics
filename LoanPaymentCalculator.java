import java.util.Scanner;

public class LoanPaymentCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter annual interest rate: ");
		double interestRate = sc.nextDouble();

		System.out.print("Enter number of years: ");
		double numberOfYears = sc.nextDouble();

		System.out.print("Enter loan amount: ");
		double loanAmount = sc.nextDouble();
		
		double monthlyInterestRate = interestRate / 1200;
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears*12)));
		System.out.println("Your monthly payment is: " + ((int)(monthlyPayment * 100) / 100.0));
	}
}