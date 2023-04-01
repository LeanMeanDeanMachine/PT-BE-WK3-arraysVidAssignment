public class AlternativeAgeInt {

    public static void main(String[] args) {
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println(ages[ages.length-1] - ages[0]);

        Arrays.copyOf(ages, ages.length+1);
        ages[ages.length-1] = 42;

        System.out.println(ages[ages.length-1] - ages[0]);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println(average);
        System.out.println(ages[7]);
    }


    public static class Arrays {
        public static void copyOf(int[] ages, int i) {
        }
    }
}
