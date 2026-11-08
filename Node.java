package campuslostandfound;

public class Node {

    item data;
    Node next;

    public Node(item data) {
        if (data == null) {
            throw new IllegalArgumentException(
                    "Node data cannot be null.");
        }

        this.data = data;
        this.next = null;
    }

    public item getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.getItemName();
    }
}

