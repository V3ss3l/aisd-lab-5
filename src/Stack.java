public class Stack<T> {
    private Item head;
    private int count;

    public Stack() {
        this.head = null;
        count = 0;
    }

    public Stack(Item head, Item tail) {
        this.head = head;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public int Count() {
        return count;
    }

    public void Push(T data) {
        count++;
        head = new Item(data, head);
    }

    public void Pop() {
        count--;
        System.out.println(head.data);
        head = head.next;
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
