public class PatientQueue {

    private class Node {
        Patient data;
        Node next;

        Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;