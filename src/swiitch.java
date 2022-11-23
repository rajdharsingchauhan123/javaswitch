import java.util.Scanner;

public class swiitch {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("please enter a command");
        String text =input.nextLine();
        switch(text){
            case "start":
                System.out.println("Machine started");
                break;
            case "stop":
                System.out.println("machine stop");
                break;
            default:
                System.out.println("commond not recognise");
        }
    }
}
