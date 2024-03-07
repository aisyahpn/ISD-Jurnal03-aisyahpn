public class main {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.tambahDepan(new Buku("A", "b", 2024));
        list1.tambahDepan(new Buku("A", "b", 2024));
        list1.tambahDepan(new Buku("A", "b", 2024));
        list1.tambahDepan(new Buku("A", "b", 2024));
        list1.tambahDepan(new Buku("A", "b", 2024));
        list1.tambahDepan(new Buku("A", "b", 2024));

        list1.print();
    }
}