import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Очередь
        System.out.println("Очередь");
        var queue = new Queue<Character>();
        for (var i = 'a'; i < 'd'; i++) {
            System.out.print(i + " ");
            queue.Push(i);
        }
        System.out.println();
        for (var i = 'a'; i < 'd'; i++) {
            System.out.println(queue.Pop());
        }
        // Стек
        System.out.println("Стек");
        var stack = new Stack<Character>();
        for (var i = 'a'; i < 'd'; i++) {
            System.out.print(i + " ");
            stack.Push(i);
        }
        System.out.println();
        for (var i = 'a'; i < 'd'; i++) {
            stack.Pop();
        }
    }
}
