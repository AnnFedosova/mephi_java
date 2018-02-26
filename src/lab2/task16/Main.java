package lab2.task16;

/**
 * Implement a class Queue, an unbounded queue of strings.
 * Provide methods add, adding at the tail,
 * and remove, removing at the head of the queue.
 * Store elements as a linked list of nodes.
 * Make Node a nested class. Should it be static or not?
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.addNode("abracadabra");
        queue.addNode("aaaaaaaa");
        queue.addNode("dddd");

        queue.printQueue();
    }
}
