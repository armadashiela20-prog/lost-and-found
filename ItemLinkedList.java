package campuslostandfound;

public class ItemLinkedList {
  
    private Node head;
    private Node tail;

    public ItemLinkedList() {
        head = null;
        tail = null;
    }
   
    public void addItem(item item) {

        if (item == null) {
            throw new IllegalArgumentException(
                    "Item cannot be null.");
        }

        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
