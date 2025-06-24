//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//задача 1
        System.out.println();
        System.out.println("задача 1");
        System.out.println();
        int[] salaries = new int[]{53489, 86045, 91245, 92453, 85000};
        int sum = 0;

        for (int i = 0; i < salaries.length; i++) {
            sum = sum + salaries[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //задача 2
        System.out.println();
        System.out.println("задача 2");
        System.out.println();
        int[] spendings = new int[]{6165, 7585, 9157, 98117, 15567};
        int maxSpending = -1;

        for (int i = 0; i < spendings.length; i++) {
            if (spendings[i] > maxSpending) {
                maxSpending = spendings[i];
            }
        }
        int minSpending = maxSpending;
        for (int j = 0; j < spendings.length; j++) {
            if (spendings[j] < minSpending) {
                minSpending = spendings[j];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");
        //задача 3
        System.out.println();
        System.out.println("задача 3");
        System.out.println();
        int[] monthSpendings = new int[]{61554, 75858, 91521, 98172, 15674};
        int summa = 0;
        for (int i = 0; i < monthSpendings.length; i++) {
            summa = summa + monthSpendings[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double)summa / monthSpendings.length + " рублей");
        //задача 4
        System.out.println();
        System.out.println("задача 4");
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
