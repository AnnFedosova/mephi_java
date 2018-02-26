package lab2.task17;

//Неограниченная очередь строк
class Queue {
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

    class Iterator{

        public Iterator(){}

        public boolean hasNext(Node node){
            return node.nextNode != null;
        }

        public Node next(Node node){
            return node.nextNode;
        }

    }

    public Iterator Iterator(){
        return new Iterator();
    }

    public Queue(){
        head = null;
        tail = null;
    }

    //Добавление узла в конец очереди
    public void addNode(String str){
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
        //return newNode;
    }

    public void removeFirst(){
        if(head.nextNode != null){
            head = head.nextNode;
            head.previousNode = null;
        }
        else {
            head = null;
            tail = null;
        }
    }

    public void printQueue(){
        Node elem = head;
        while (elem != null) {
            System.out.println(elem.string);
            elem = elem.nextNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
