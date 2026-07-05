# Documentation: Theory Questions

## 1. Why was a Queue appropriate for the waiting room?

A hospital waiting room follows a first come, first served order. Patients who arrive first should be seen first. A queue does this directly, new patients join at the back with addPatient(), and the next patient to be seen is removed from the front with servePatient(). It matches how a real line works.

## 2. Explain the FIFO principle.

FIFO means First In, First Out. The first item added is the first one removed. In PatientQueue, the earliest patient added is the first one served, since patients are only added at the rear and only removed from the front.

## 3. Explain what could happen if a stack was used instead of a queue in Part 1.

A stack is LIFO, Last In, First Out. The most recently added item comes out first. If the waiting room used a stack, the last patient to walk in would be served first, and earlier patients could end up waiting indefinitely while new arrivals keep going ahead of them. That's the opposite of fair treatment in a waiting room.

## 4. Suggest ways you could improve this system (Theory).

A strict FIFO queue doesn't support positional insertion, which is really priority handling and a limitation of this design. A priority queue would model emergency cases better. Instead of inserting at a manually chosen position, patients could be ranked by urgency, like critical, urgent, or routine, and the system would automatically serve the highest priority patient next.

## 5. Why is a Doubly Linked List appropriate for patient history?

Patient history needs to be browsed in both directions, looking at older records and then coming back to more recent ones. A doubly linked list stores a next and a previous pointer on each node, so PatientHistory can move forward and backward from any point without starting over from the beginning.

## 6. What would happen in the DLL if you forgot to update the next and previous pointers when manipulating the DLL?

The list would become inconsistent. A node might still be reachable going forward but not backward, or the other way around, breaking the chain. This could cause records to appear lost, navigation to loop unexpectedly, or a NullPointerException when the code tries to follow a pointer that was never set.

## 7. Explain why a Doubly Linked List works in this case compared to an Array or Array List.

An array or ArrayList stores elements in contiguous memory with fixed positions, so inserting or removing from the middle means shifting every element after it, which is O(n). A doubly linked list only needs to update a few pointers to insert or remove a node. Since PatientHistory navigates one record at a time using next and previous rather than by index, it doesn't need fast random access, it needs fast, flexible pointer movement, which is what a doubly linked list gives.