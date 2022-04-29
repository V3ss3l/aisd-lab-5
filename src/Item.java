public class Item<T> {
    public T data;
    public Item next;

    public T getData() {
        return data;
    }

    public void setData(T value) {
        data = value;
    }

    public Item(T number) {
        this.data = number;
    }

    public Item getNext() {
        return next;
    }

    public void SetNext(Item next) {
        this.next = next;
    }

    public Item(T number, Item next) {
        this.data = number;
        this.next = next;
    }
}
