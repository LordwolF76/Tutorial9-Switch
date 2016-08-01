import java.util.Scanner;

/**
 * Created by LordwolF on 7/31/2016.
 */
public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a Command: ");
        String text = input.nextLine();

        switch(text) {
            case "start":
                System.out.println("Machine Started!");
                break;

            case "stop":
                System.out.println("Machine stopped!");
                break;
            
            default:
                System.out.println("Command not recognized");
        }

    }
}
