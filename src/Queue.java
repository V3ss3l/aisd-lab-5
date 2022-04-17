import java.awt.dnd.InvalidDnDOperationException;

public class Queue<T> {
    private Item head;
    private Item tail;
    private int count;

    public Queue() {
        count = 0;
        this.head = null;
        this.tail = null;
    }

    public int Count(){
        return count;
    }

    public Queue(Item head) {
        this.head = head;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public void Push(T data) {
        var item = new Item<T>(data);
        var tempItem = tail;
        tail = item;

        if (count == 0)
            head = tail;
        else
            tempItem.SetNext(tail);

        count++;
    }

    public T Pop() {
        if (count == 0)
            throw new InvalidDnDOperationException("Операция невозможна, нет элементов");
        var output = head.getData();
        head = head.getNext();
        count--;
        return (T) output;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Item buff = head;
        while (buff != null) {
            sb.append(buff.data + "| ");
            buff = buff.next;
        }
        return sb.toString();
    }
}
