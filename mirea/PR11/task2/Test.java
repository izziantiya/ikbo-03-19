package PR11.task2;

public class Test {
    public static void main(String[] args) {
        Queue queueOne = new ArrayQueue();

        System.out.println("Array");
        fill(queueOne);
        dump(queueOne);
        System.out.println("__________________");
        fill(queueOne);
        clear(queueOne);
        System.out.println("__________________");
        fill(queueOne);
        getArray(queueOne);

        System.out.println("\n________________________________________");

        Queue queueTwo = new LinkedQueue();

        System.out.println("Linked");
        fill(queueTwo);
        dump(queueTwo);
        System.out.println("__________________");
        fill(queueTwo);
        clear(queueTwo);
        System.out.println("__________________");
        fill(queueTwo);
        getArray(queueTwo);

    }

    public static void fill(Queue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(Queue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " + queue.element() + " " + queue.dequeue());
        }
    }

    public static void getArray(Queue queue) {
        Object[] arr = queue.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void clear(Queue queue) {
        queue.clear();
        System.out.println("Queue is empty? " + queue.isEmpty());
    }
}
