
# Patient Management System

A console-based Patient Management System built in Java for the Data Structures and Algorithms course (Semester 4). This project demonstrates a custom-built Queue and a custom-built Doubly Linked List, both implemented from scratch without using Java's built-in collection classes.

## Overview

The program simulates two core hospital workflows:

1. A **waiting room queue**, where patients are added, served, or inserted at a specific position for emergency cases.
2. A **patient history system**, using a doubly linked list, that allows navigation forward and backward through past visit records.
## Features

### Part 1: Patient Waiting Room (Queue)
- Add a patient to the queue
- Serve (remove) the next patient in line
- Insert a patient at a specific position (emergency case)
- Print all patients currently waiting
- Safely handle an empty queue without crashing
### Part 2: Patient History System (Doubly Linked List)
- Preloaded with 10 patient history records
- Navigate to the next record
- Navigate to the previous record
- Display the newest record
- Display the oldest record
- Prevent navigation past the head or tail of the list
## Project Structure

```
patient-management-system/
├── src/
│   ├── Patient.java
│   ├── PatientQueue.java
│   ├── PatientRecord.java
│   ├── PatientHistory.java
│   └── Main.java
├── test/
│   ├── PatientQueueTest.java
│   └── PatientHistoryTest.java
├── .gitignore
└── README.md
```

## Unit Tests

 This project includes 6, split across the two structures.

| Test | What it checks |
|---|---|
| `testServeEmptyQueueReturnsNull` | Serving from an empty queue returns null instead of crashing |
| `testInsertAtPositionPlacesPatientCorrectly` | An emergency patient inserted at a specific index lands in the correct spot |
| `testAddAndServeMaintainsFIFOOrder` | Normal add and serve follows first in, first out order |
| `testCannotNavigatePastOldestRecord` | Moving to "previous" at the oldest record does not crash |
| `testCannotNavigatePastNewestRecord` | Moving to "next" at the newest record does not crash |
| `testNavigationMovesCorrectlyBetweenRecords` | Next and previous correctly move between records in sequence |


## How to Run

1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Use the on-screen menu to interact with the waiting room and patient history

 

