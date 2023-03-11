public class ReturnSumGreater100BooleanLoop {
    public static void main(String[] args) {
        int[] numbers = {7,21,42,84};
        boolean isSumGreater = isSumGreaterThan100(numbers);
        System.out.println(isSumGreater);
    }

    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum > 100;
    }
}
