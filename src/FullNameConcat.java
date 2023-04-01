public class FullNameConcat {
        public static void main(String[] args) {
            String firstName = "Robert";
            String lastName = "Dean";
            String fullName = getFullName(firstName, lastName);
            System.out.println(fullName);
        }

        public static String getFullName(String firstName, String lastName) {

            return firstName + " " + lastName;
        }
    }


