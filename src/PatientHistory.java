


// Author Christopher Britten
//SD15



public class PatientHistory {

    private class Node {
        PatientRecord data;
        Node next;
        Node previous;

        Node(PatientRecord data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private Node head;
    private Node tail;
    private Node current;

    public PatientHistory() {
        head = null;
        tail = null;
        current = null;
    }

    public void addRecord(PatientRecord record) {
        Node newNode = new Node(record);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void goToNext() {
        if (current == null) {
            System.out.println("No records loaded.");
            return;
        }
        if (current.next == null) {
            System.out.println("Already at the newest record.");
            return;
        }
        current = current.next;
    }

    public void goToPrevious() {
        if (current == null) {
            System.out.println("No records loaded.");
            return;
        }
        if (current.previous == null) {
            System.out.println("Already at the oldest record.");
            return;
        }
        current = current.previous;
    }

    public void showCurrent() {
        if (current == null) {
            System.out.println("No record to show.");
            return;
        }
        System.out.println(current.data);
    }

    public void showNewest() {
        if (tail == null) {
            System.out.println("No records available.");
            return;
        }
        current = tail;
        System.out.println(current.data);
    }

    public void showOldest() {
        if (head == null) {
            System.out.println("No records available.");
            return;
        }
        current = head;
        System.out.println(current.data);
    }
}
