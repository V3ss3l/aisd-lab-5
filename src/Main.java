import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackLIFO stack_1 = new StackLIFO();
        while (true) {
            System.out.println("Type number for stack element");
            int choice = scanner.nextInt();
            if(choice < 0) break;
            stack_1.addItem(choice);
            System.out.println(stack_1.toString());
        }
    }
}
