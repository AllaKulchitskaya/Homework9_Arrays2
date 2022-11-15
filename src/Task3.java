public class Task3 {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        double sum = 0;
        for (int index : expenses) {
            sum += index;
        }
        double averageExpenses = sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
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
