import service.DefaultUserInputService;
import service.UserInputService;

/**
 * Created by nick on 14/04/17.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Let's play countdown!");
        UserInputService userInputService = new DefaultUserInputService();
        userInputService.initialize();

    }
}
