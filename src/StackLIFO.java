public class StackLIFO {
    private Item head;
    // private List<T> list;

    public StackLIFO(){
        this.head = null;
    }

    public StackLIFO(Item head) {
        this.head = head;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public void addItem(int number){
        head = new Item(number, head);
    }

    public void deleteItem(){
        head = head.next;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        Item buff = head;
        while (buff!=null){
            sb.append(buff.number + "| ");
            buff = buff.next;
        }
        return sb.toString();
    }
}
