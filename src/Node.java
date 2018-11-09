public class Node {
    private Node next;
    private Object data;

    Node(Object data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData(){
        return data;

    }
}