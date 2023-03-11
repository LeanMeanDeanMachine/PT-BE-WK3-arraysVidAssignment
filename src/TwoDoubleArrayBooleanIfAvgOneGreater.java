public class TwoDoubleArrayBooleanIfAvgOneGreater {

        public static void main(String[] args) {
            double[] array1 = {2.0, 4.5, 6.8, 7.1, 9.4};
            double[] array2 = {1.0, 3.5, 5.8, 8.1, 10.4};
            boolean isAvgGreater = isAvgOfArray1GreaterThanAvgOfArray2(array1, array2);
            System.out.println(isAvgGreater);
        }

        public static boolean isAvgOfArray1GreaterThanAvgOfArray2(double[] array1, double[] array2) {
            double sum1 = 0;
            for (double value : array1) {
                sum1 += value;
            }
            double avg1 = sum1 / array1.length;

            double sum2 = 0;
            for (double value : array2) {
                sum2 += value;
            }
            double avg2 = sum2 / array2.length;

            return avg1 > avg2;
        }
    }
