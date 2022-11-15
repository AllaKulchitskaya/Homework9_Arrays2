public class Task1 {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        int sum = 0;
        for (int index : expenses) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
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