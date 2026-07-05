package com.project.patient;

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

    public PatientQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void addPatient(Patient patient) {
        Node newNode = new Node(patient);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Patient servePatient() {
        if (isEmpty()) {
            System.out.println("No patients are waiting.");
            return null;
        }
        Patient served = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return served;
    }

    public void insertAtPosition(Patient patient, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position: " + position);
            return;
        }

        Node newNode = new Node(patient);

        if (position == 0) {
            newNode.next = front;
            front = newNode;
            if (rear == null) {
                rear = newNode;
            }
            size++;
            return;
        }

        Node current = front;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            rear = newNode;
        }

        size++;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The waiting room is empty.");
            return;
        }
        Node current = front;
        int position = 0;
        while (current != null) {
            System.out.println(position + ": " + current.data);
            current = current.next;
            position++;
        }
    }
}