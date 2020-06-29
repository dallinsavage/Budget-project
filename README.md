# <h1> This is my final project for my intro to programing class
This program creates a budget form user input. The program starts by asking for what the user wants the budget categories and amounts to be.
It then runs some calculations to get the total budget and income. Finally it prints out the budget with the totals.
## <h2> motivation
What motivated me to make this program was th fact that i couldnt find a budgeting program that would take into consideration tha actual income being made.
## <h2> Program being run
![budget being run](https://github.com/dallinsavage/Budget-project/blob/master/Screen%20Shot%202020-06-29%20at%204.12.26%20PM.png)
## <h2> Code example
  ```
  	public static void printBudget(String[] budget, double[] amount, int z) {
		System.out.println("------------------");
		for (int y = 0; y < z; y++) {
			if (budget[y].equals("") != true) {
			System.out.printf("| %s: $", budget[y]);
			}
			if (amount[y] != 0) {
			System.out.printf("%4.2f |\n", amount[y]);
			}
		System.out.println("------------------");
```
