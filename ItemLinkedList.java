package campuslostandfound;

public class ItemLinkedList {
  
    private Node head;
    private Node tail;

    public ItemLinkedList() {
        head = null;
        tail = null;
    }
    public Node getHead() {
    return head;
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
     public item searchItem(String keyword) {

        if (keyword == null || keyword.trim().isEmpty()) {
            return null;
        }

        Node current = head;

        while (current != null) {

            item item = current.getData();

            if (item.getItemName().toLowerCase()
                    .contains(keyword.trim().toLowerCase())) {
                return item;
            }

            current = current.getNext();
        }

        return null;
    }
     // UPDATE STATUS
public boolean updateStatus(int index, String status) {

    if (index < 0) {
        return false;
    }

    Node current = head;

    for (int i = 0; current != null && i < index; i++) {
        current = current.getNext();
    }

    if (current == null) {
        return false;
    }

    current.getData().setStatus(status);

    return true;
}
// DELETE ITEM
public boolean deleteItem(int index) {

    if (index < 0 || head == null) {
        return false;
    }

    // Delete the first node.
    if (index == 0) {
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return true;
    }

    Node current = head;

    // Find the node before the target node.
    for (int i = 0;
            current.getNext() != null && i < index - 1;
            i++) {

        current = current.getNext();
    }

    // Check whether the target exists.
    if (current.getNext() == null) {
        return false;
    }

    // Update the tail if the last node is deleted.
    if (current.getNext() == tail) {
        tail = current;
    }

    // Remove the target node.
    current.setNext(current.getNext().getNext());

    return true;
}
}

