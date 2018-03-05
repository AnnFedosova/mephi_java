package lab2.task17;

/**
 * Provide an iterator — an object that yields the elements of the queue in turn —
 * for the queue of the preceding class.
 * Make Iterator a nested class with methods next and hasNext.
 * Provide a method iterator() of the Queue class that yields a Queue.Iterator.
 * Should Iterator be static or not?
 *
 * An inner class, by definition, cannot be static
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.addNode("First str");
        queue.addNode("Second str");
        //сделаем экземпляр итератора и посмотрим, есть ли у головы следующий элемент
        System.out.println(queue.Iterator().hasNext(queue.getHead()));
        //а следующий элемент у следующего элемента?
        //Queue.Iterator iterator = queue.Iterator();
        //System.out.println(iterator.hasNext(iterator.next(queue.getHead())));

        queue.printQueue();

    }
}
