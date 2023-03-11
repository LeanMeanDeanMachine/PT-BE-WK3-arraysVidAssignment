public class NamesArrays {
    public static void  main(String[] args) {
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        //Loop to iterate through array and calculate average number of letters per name.
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double average = (double) totalLetters / names.length;
        System.out.println(average);
    }
}
