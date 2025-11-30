
public class PriorityQueue {

    private CustomLinkList list;
    private CustomLinkList lastValue;
    private int size;

    private int minPriorityIndex = -1;
    private int minPriority = 2147483646;

    private int maxPriorityIndex = -1;
    private int maxPriority = -2147483648;

    public PriorityQueue() {

    }

    public PriorityQueue(CustomLinkList list) {
        this.list = list;

        CustomLinkList temp = list;

        int index = 1;

        if (temp.getValue() != null) {
            this.minPriorityIndex = index;
            this.minPriority = temp.getValuePriority();

            this.maxPriorityIndex = index;
            this.maxPriority = temp.getValuePriority();
        }

        while (temp.hasNext()) {
            temp = temp.getNextNode();
            temp 
        }

    }

}
