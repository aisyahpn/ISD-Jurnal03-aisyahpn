public class SinglyLinkedList {
    Node head;
    Node tail;

    public void tambahDepan(Buku data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        Node iterator = head;

        while(iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}