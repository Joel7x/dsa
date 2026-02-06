public class FIFOQueue {
    private int[] queue;
    private int front, rear, size;

    public FIFOQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        front++;
        size--;
        return value;
    }

    public static void main(String[] args) {
        FIFOQueue q = new FIFOQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 2
        System.out.println(q.dequeue()); // 3
    }
}
