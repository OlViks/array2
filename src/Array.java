public class Array {
    public static void main(String[] args) {
        System.out.println("Массив 2.1");

        int[] spent = generateRandomArray();

        System.out.println("Задание №1");

        int sum = 0;
        for (int spen : spent){
            sum += spen;
        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");

        System.out.println("Задание №2");
        int min = spent[0];
        for (int j : spent) {
            if (j < min)
                min = j;
        }
        System.out.println("Минимальная сумма трат за день составила " + min +" рублей.");
        int max = spent[0];
        for (int j : spent) {
            if (j > max)
                max = j;
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}