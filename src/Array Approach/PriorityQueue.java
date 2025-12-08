
public class PriorityQueue {

    private Object[] data;
    private long[] priority;
    private int size;

    private int minPriorityIndex = -1;
    private int minPriority = 2147483646;

    private int maxPriorityIndex = -1;
    private int maxPriority = -2147483648;
}
