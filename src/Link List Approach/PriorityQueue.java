
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

        int index = 0;
        int tempPriority;

        if (temp.getValue() != null) {
            ++index;

            this.minPriorityIndex = index;
            this.minPriority = temp.getValuePriority();

            this.maxPriorityIndex = index;
            this.maxPriority = temp.getValuePriority();
        }

        while (temp.hasNextNode()) {
            ++index;

            temp = temp.getNextNode();

            tempPriority = temp.getValuePriority();

            if (tempPriority > this.maxPriority) {

                this.maxPriority = tempPriority;
                this.maxPriorityIndex = index;

            } else if (tempPriority < this.minPriority) {

                this.minPriority = tempPriority;
                this.minPriorityIndex = index;

            }

        }

        this.size = index;

    }

    public int getSize() {
        return this.size;
    }

    public int getMaxPriority() {
        return this.maxPriority;
    }

    public int getMinPriority() {
        return this.minPriority;
    }

    public void enQueueWithoutPriority(Object value, int priority) {
        CustomLinkList temp = new CustomLinkList(value, priority);
        this.lastValue.setNextNode(temp);
        ++this.size;

        if (priority > this.maxPriority) {

            this.maxPriority = priority;
            this.maxPriorityIndex = this.size;

        } else if (priority < this.minPriority) {

            this.minPriority = priority;
            this.minPriorityIndex = this.size;

        }
    }

    public void setAllyAt(Object value, int priority, int index) {
        if (index < 1 || index > this.size) {
            throw new RuntimeException("Index out of bounds!");
        }

        CustomLinkList temp = this.list;
        for (int i = 1; i < index; i++) {
            temp = temp.getNextNode();
        }

        if (priority > this.maxPriority) {

            this.maxPriority = priority;
            this.maxPriorityIndex = index;

        } else if (priority < this.minPriority) {

            this.minPriority = priority;
            this.minPriorityIndex = index;

        }

        temp.setValue(value);
        temp.setPriority(priority);
    }

    public void setValueAt(Object value, int index) {
        if (index < 1 || index > this.size) {
            throw new RuntimeException("Index out of bounds!");
        }

        CustomLinkList temp = this.list;
        for (int i = 1; i < index; i++) {
            temp = temp.getNextNode();
        }

        temp.setValue(value);
    }

    public void setValuePriorityAt(int priority, int index) {
        if (index < 1 || index > this.size) {
            throw new RuntimeException("Index out of bounds!");
        }

        CustomLinkList temp = this.list;
        for (int i = 1; i < index; i++) {
            temp = temp.getNextNode();
        }

        if (priority > this.maxPriority) {

            this.maxPriority = priority;
            this.maxPriorityIndex = index;

        } else if (priority < this.minPriority) {

            this.minPriority = priority;
            this.minPriorityIndex = index;

        }

        temp.setPriority(priority);
    }

    

}
