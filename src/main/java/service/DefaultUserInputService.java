package service;

import java.util.Scanner;

/**
 * Created by nick on 14/04/17.
 */
public class DefaultUserInputService implements UserInputService {

    private int numberOfLarge;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        numberOfLarge = askForLargeNumbers(scanner);
    }

    public int getNumberOfLarge() {
        return numberOfLarge;
    }

    private int askForLargeNumbers(Scanner scanner){
        System.out.println("How many large numbers?");
        int numberOfLarge = scanner.nextInt();
        if(numberOfLarge < 0 || numberOfLarge > 4){
            System.out.println("You must pick between 0 and 4 large numbers. Try again.");
            return askForLargeNumbers(scanner);
        }
        return numberOfLarge;
    }
}
