import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        // create a scanner objects
        Scanner input =new Scanner(System.in);

        // output the prompt
        System.out.println("Enter a floating");
        // wait the user to enter something
       double value =input.nextDouble();
        System.out.println("you enterd:" + value);
    }
}
