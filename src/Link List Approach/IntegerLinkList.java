
public class IntegerLinkList {

    private int value;
    private IntegerLinkList next;

    public IntegerLinkList() {

    }

    public IntegerLinkList(int value) {
        this.value = value;
    }

    public IntegerLinkList(int value, IntegerLinkList next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public IntegerLinkList getNextNode() {
        return this.next;
    }

    public void setNextNode(IntegerLinkList newNext) {
        this.next = newNext;
    }

    public void setNextNode(int newNext) {
        this.next = new IntegerLinkList(newNext);
    }

}
