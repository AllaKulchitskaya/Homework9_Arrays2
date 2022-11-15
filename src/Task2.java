public class Task2 {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        int minExpenses = 201_000;
        for (int oneDayExpenses : expenses) {
            if (oneDayExpenses < minExpenses) {
                minExpenses = oneDayExpenses;
            }
        }
        int maxExpenses = 99_000;
        for (int oneDayExpenses2 : expenses) {
            if (oneDayExpenses2 > maxExpenses) {
                maxExpenses = oneDayExpenses2;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }
        return expenses;
    }
}
