package abstraction3;

import java.util.Scanner;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    public static String checkForName(String animalType) {
        System.out.println("Do you have a name for the " + animalType + "? (Y/N): ");
        String input = scanner.nextLine().trim().toLowerCase();
        if ("y".equals(input)) {
            System.out.println("Enter the name:");
            return scanner.nextLine().trim();
        }
        return null;
    }

    public static Lion getLionObject(String lionName) {
        return lionName != null ? new Lion(lionName) : new Lion();
    }

    public static Giraffe getGiraffeObject(String giraffeName) {
        return giraffeName != null ? new Giraffe(giraffeName) : new Giraffe();
    }

    public static Bear getBearObject(String bearName) {
        return bearName != null ? new Bear(bearName) : new Bear();
    }
}
