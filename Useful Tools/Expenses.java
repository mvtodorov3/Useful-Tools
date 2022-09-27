import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Expenses {

    //monthly expenses
    //1. input data: income, category of expense;
    //2. loop through every expense category and adding a type double input of the expense:
    //end of the loop: when the user types: Stop
    //3. calculating the percent of the expense for the current category and adding it to a hashmap: key -> expense category, value -> percent of the expense
    //4. looping through the hashmap to print the key/values

    public void expenses(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your income: ");
        double income = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter a category of expense: ");
        String expenseCategory = scanner.nextLine();

        Map<String, Double> hmap = new HashMap<>(); //hashmap to store category of an expense(key) with its corresponding percent (value)

        double percent = 0;
        while (!expenseCategory.equals("Stop")){
            System.out.print("Options: Add an amount for that expense: ");
            double amount = Double.parseDouble(scanner.nextLine());

            percent = (amount / income) * 100; //getting a percent of the expenses for the current category
            hmap.put(expenseCategory, percent);

            System.out.print("Options: Add another category or enter command 'Stop': ");
            expenseCategory = scanner.nextLine();
        }
        System.out.printf("Your income is: %.2f", income);
        System.out.println("Your expense report is: ");
        for (Map.Entry<String, Double> map : hmap.entrySet()){ //foreach loop to print the key and value of hmap
            System.out.print(map.getKey() + " -> ");
            System.out.println(map.getValue()+"%");
        }
    }
}
