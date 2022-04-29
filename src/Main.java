import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var count = scanner.nextInt();

        var queue = new Queue<Integer>();
        var stack = new Stack<Integer>();
        while (count > 0){
            queue.Push(count);
            stack.Push(count);
            var sc = new Scanner(System.in);
            count = sc.nextInt();
        }
        /*for (var i = 0; i < count; i++) {
            System.out.print(i + " ");
            queue.Push(i);
            stack.Push(i);
        }*/
        var c = queue.Count();
        long start = System.currentTimeMillis();
        System.out.println("\nQueue\t\tStack");
        while (!queue.IsEmpty()) {
            System.out.println(queue.Pop() + "\t\t\t" + stack.Pop());
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Количество элементов: " + c + "\nПрошло времени, мс: " + elapsed);
    }
}
