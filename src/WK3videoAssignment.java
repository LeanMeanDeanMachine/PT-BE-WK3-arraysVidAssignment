public class WK3videoAssignment {
    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};
        int last = ages.length - 1; //last index of ages array

        int result = ages[last] - ages[0];
        System.out.println(result);

        // Loop for finding average of ages Array

        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = sum / ages.length;
        System.out.println(average);

    }
}
