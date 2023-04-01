public class AgesIntExercise {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 96, 67};

        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result: " + result);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }

        double average = (double) sum / ages.length;
        System.out.println(average);

    }
}
