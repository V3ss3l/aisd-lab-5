public class StackFIFO {
    private Item head;
    private Item tail;

    public StackFIFO(){
        this.head = null;
    }

    public StackFIFO(Item head, Item tail) {
        this.head = head;
        this.tail = tail;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public Item getTail() {
        return tail;
    }

    public void setTail(Item tail) {
        this.tail = tail;
    }

    public void addItem(int number){

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
