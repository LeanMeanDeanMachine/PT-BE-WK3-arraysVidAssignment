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

        //Loop to concatenate ALL the names together and print to console
        System.out.println(" "); //Peace of Mind

        String concatenated = " ";
        for (String name : names) {
            concatenated += name + " ";
        }
        System.out.println(concatenated.trim());

        System.out.println(" "); //Peace of Mind

        //new int Array called nameLengths calculating the length of "names"
        int[] nameLengths = new int[names.length];

        //Loop iterating over names array and adding int length to nameLengths array
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        for (int length : nameLengths) {
            System.out.println(length + " ");
        }

        System.out.println(" ");   //Peace of Mind

        //Loop iterating over nameLengths array calculating sum of all elements
        int sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }
        System.out.println(sum);

    }
}
