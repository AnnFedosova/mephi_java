package lab2.task16;

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

    //сдача 2 лабы. удаление элемента по значению cтроки
    public boolean removeNode(Node node){
        if (node == null)
            return false;
        if (node == head)
            removeFirst();
        else if(node == tail){
            tail = tail.previousNode;
            tail.nextNode = null;
        }
        else {
            node.previousNode.nextNode = node.nextNode;
            node.nextNode.previousNode = node.previousNode;
        }
        return true;
    }

    public boolean removeStr(String string) {
        return removeNode(foundNode(string));
    }

    public Node foundNode(String string){
        Node curNode = new Node();
        curNode = head;
        while (curNode != null && curNode.nextNode != null){
            if (curNode.string.equals(string))
                return curNode;
            else {
                curNode = curNode.nextNode;
            }
        }
        if (curNode == null)
            return null;
        if (curNode.nextNode == null) {
            if (curNode.string.equals(string))
                return curNode;
        }
        return null;
    }

    public void printQueue(){
        Node elem = head;
        while (elem != null) {
            System.out.println(elem.string);
            elem = elem.nextNode;
        }
    }
}
