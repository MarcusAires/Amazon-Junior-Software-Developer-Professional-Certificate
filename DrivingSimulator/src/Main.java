import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        boolean isCarOn = false;
        int carSpeed = 0;
        int userChoice = 0;
        String gear = "P";

        while (userChoice != 5){
        // TODO 2: Display the current state of the car (engine state, gear, speed)
        System.out.println("-------------Car Dashboard------------");
        System.out.println("Speed: "+ carSpeed);
        System.out.println("gear: "+ gear);
        System.out.println("userChoice: "+ userChoice);
        System.out.println("isCarOn: "+ isCarOn);
        // TODO 3: Add print statements for each variable you want to display or options available to the user
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
        // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
        System.out.println("Enter you choice");
        userChoice = keyBoard.nextInt();
        // TODO 5: Implement a switch statement to handle the different menu choices
        switch (userChoice) {
            case 1:
                isCarOn = !isCarOn;
                break;
            case 2:
                System.out.print("Enter gear (P, D, R): ");
                gear = keyBoard.next();
                break;
            case 3:
                if (isCarOn && !gear.equals("P")) {
                    carSpeed += 10; // speed += 10
                }else{
                    System.out.println("Cannot accelerate now");
                }
                break;
            case 4:
                if (isCarOn && carSpeed > 0) {
                    carSpeed -= 10;
                }else{
                    System.out.println("The car is not moving");
                }
                break;
            case 5:
                System.out.println("You ended the simulation");
                break;
            // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!

        }
    }
}
}
