package lab2.task16;

//Неограниченная очередь строк
public class Queue {
    private Node head;
    private Node tail;

    class Node{
        private String string;
        private Node nextNode;
        private Node previousNode;

        public Node(){
            string = "";
            nextNode = null;
            previousNode = null;
        }

    }

    public Queue(){
        head = null;
        tail = null;
    }
    //Добавление узла в конец очереди
    public Node addNode(String str){
        Node newNode = new Node();
        if (tail == null) {
            head = newNode;
            newNode.previousNode = null;
        }
        else
        {
            newNode.previousNode = tail;
            newNode.previousNode.nextNode = newNode;
        }
        newNode.string = str;
        newNode.nextNode = null;
        tail = newNode;
        return newNode;
    }

    public void printQueue(){
        Node elem = head;
        while (elem != null) {
            System.out.println(elem.string);
            elem = elem.nextNode;
        }
    }
}
