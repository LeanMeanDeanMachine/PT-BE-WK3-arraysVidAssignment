public class DoubleArrayReturnAvgEaElement {
        public static void main(String[] args) {
            double[] values = {2.0, 4.5, 6.8, 7.1, 9.4};
            double average = getAverage(values);
            System.out.println(average);
        }

        public static double getAverage(double[] values) {
            double sum = 0;
            for (double value : values) {
                sum += value;
            }
            return sum / values.length;
        }
    }


