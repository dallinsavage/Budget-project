import java.util.Scanner;

public class Main_Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String budget[] = new String[2];
		double amount[] = new double[2];
		Scanner input = new Scanner(System.in);
		
		//get budgets and amounts
		
		for (int i = 0; i < budget.length; i++) {
			System.out.println("Enter a budget");
			budget[i] = input.next();
			System.out.println("Enter budget amount");
			amount[i] = input.nextDouble();
		}
		System.out.println("Enter Actual income");
		double income = input.nextDouble();
		double total = 0;
		
		//get total budget amount
		for (int x = 0; x < amount.length; x++) {
			total = total + amount[x];
		}

		System.out.println("Enter another month of income?");
		System.out.println("yes or no");
		String answer = input.next();
		answer = answer.toLowerCase();
		int counter = 0;
		while (answer.equals("yes")) {
			System.out.println("Enter income");
			double nextIncome = input.nextDouble();
			income = income + nextIncome;
			System.out.println("Enter another month of income?");
			System.out.println("yes or no");
			counter++;
		}
		double endAmount = income - total * counter;
		
		//print budgets and amounts
		for (int y = 0; y < budget.length; y++) {
			System.out.printf("%s: $", budget[y]);
			System.out.printf("%4.2f \n", amount[y]);
		}
		System.out.printf("Total Budget $%4.2f\n", total);
		System.out.printf("Income : $%4.2f\n", income);
		if (endAmount >= 0) {
			System.out.printf("Extra : $%4.2f\n", endAmount);
		}
		else {
			System.out.println("You are over budget!");
			System.out.printf("Total Expense $%4.2f", endAmount);
		}

	}
}
