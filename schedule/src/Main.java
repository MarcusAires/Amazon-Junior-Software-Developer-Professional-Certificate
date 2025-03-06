import java.util.Scanner;
// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);
        int subChoice = 0;
        int dayOfTheWeek = 1;
            System.out.println("/********** MENU *****************\n" +
                    "These are the choices for week of the day. \n" +
                    "Please enter only values from 1-7:\n" +
                    "1. MONDAY\n" +
                    "2. TUESDAY\n" +
                    "3. WEDNESDAY\n" +
                    "4. THURSDAY\n" +
                    "5. FRIDAY\n" +
                    "6. SATURDAY\n" +
                    "7. SUNDAY\n" +
                    "**********************************/");
        System.out.println("Enter your choice of the day (1-7):");
        dayOfTheWeek = keyboard.nextInt();
        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
/**                for the input in "dayOfTheWeek" **/
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work\n"+
                        "*********** SUB MENU FOR MONDAY ******\n" +
                        "* 1. Yes, I had my breakfast\n" +
                        "2. No, I would like one\n" +
                        "**************************************\n" +
                        "\n" +
                        "**/");
                subChoice = keyboard.nextInt();
                if (subChoice == 1){
                    System.out.println("Good. Now you have a catchup meeting at 9AM Prepare your notes");
                } else if (subChoice == 2) {
                    System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                }else {
                    System.out.println("NO such choice available");
                }
                break;
            case 2:
                System.out.println("Tuesday: U need to Run");
                break;
            case 3:
                System.out.println("Wednesday: You do some exercises and code");
                break;
            case 4:
                System.out.println("Thursday: Don't need to worry ");
                break;
            case 5:
                System.out.println("Friday: last day of the week enjoy");
                break;
            case 6:
                System.out.println("Saturday: Run again");
                break;
            case 7:
                System.out.println("Sunday: Rest");
                break;
            default:
                System.out.println("You need to input a number from 1 to 7");
        }

    } // end of main method

} // end of main class