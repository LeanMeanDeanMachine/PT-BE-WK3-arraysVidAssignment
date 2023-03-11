public class StringWordIntConcatMethod {
        public static void main(String[] args) {
            String word = "Promineo";
            int n = 7;
            String concatenated = concatenateWord(word, n);
            System.out.println(concatenated);
        }

        public static String concatenateWord(String word, int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(word);
            }
            return sb.toString();
        }
    }
