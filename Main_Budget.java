/*Dallin Savage
 * 6/25/20
 * Basic budget program
 */
import java.util.Scanner;

public class Main_Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String budget[] = new String[10];
		double amount[] = new double[10];
		Scanner input = new Scanner(System.in);
		double income = 0;
		for (int j = 0; j < budget.length; j++) {
			budget[j] = "";
		}
		
		//get categories and amounts
		System.out.println("Begin you monthly budget");
		System.out.println("How may budget categories do you want to enter? (up to 10)");
		int z = input.nextInt();
		for (int i = 0; i < z; i++) {
			System.out.println("Enter a budget category:");
			budget[i] = input.next();
			System.out.println("Enter budget amount: $");
			amount[i] = input.nextDouble();
		}
		System.out.println("Enter Actual income: $");
		income = input.nextDouble();
		double mtotal = 0;
		
		//get total budget amount
		for (int x = 0; x < amount.length; x++) {
			mtotal = mtotal + amount[x];
		}
		
		// enter more income
		System.out.println("Enter another month of income?");
		System.out.println("yes or no");
		String answer = input.next();
		answer = answer.toLowerCase();
		int counter = 1;
		while (answer.equals("yes")) {
			System.out.println("Enter month " + (counter + 1) + " income: $");
			double nextIncome = input.nextDouble();
			income = income + nextIncome;
			System.out.println("Enter another month of income?");
			System.out.println("yes or no");
			answer = input.next();
			answer = answer.toLowerCase();
			counter++;
		}
		double endAmount = income - mtotal * counter;
		
		//print budgets and amounts
		for (int y = 0; y < budget.length; y++) {
			if (budget[y].equals("") != true) {
			System.out.printf("%s: $", budget[y]);
			}
			if (amount[y] != 0) {
			System.out.printf("%4.2f \n", amount[y]);
			}
		}
		System.out.printf("One month budget $%4.2f\n", mtotal);
		if (counter > 1) {
		System.out.printf(counter + " month budget $%4.2f\n", mtotal * counter);
		}
		if (counter == 1) {
		System.out.printf(counter + " month income : $%4.2f\n", income);
		}
		else {
			System.out.printf(counter + " months income : $%4.2f\n", income);	
		}
		if (endAmount >= 0) {
			System.out.printf("Extra : $%4.2f\n", endAmount);
		}
		else {
			System.out.println("You are over budget!");
			System.out.printf("Total Expense $%4.2f", endAmount);
		}
		printBudget(budget[], amount[]);
	}
	public static void printBudget(String[] budget, double[] amount) {
		System.out.println("---------------------------------");
		for (int y = 0; y < budget.length; y++) {
			if (budget[y].equals("") != true) {
			System.out.printf("| %s: $", budget[y]);
			}
			if (amount[y] != 0) {
			System.out.printf("%4.2f |\n", amount[y]);
			}
		System.out.println("--------------------------------");
	}
	}
}
