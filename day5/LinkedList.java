package day5;

/**
 * Singly Linked List implementation.
 * Interviews focus: Understanding pointer manipulation, edge-case handling (empty list, single node),
 * and time/space complexity trade-offs.
 */
class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    // The 'head' pointer is the entry point to the list. 
    // If head is null, the list is empty.
    Node head;

    /**
     * Appends a new node to the end of the list.
     * Time Complexity: O(n) - We must traverse the entire list to find the tail.
     * Space Complexity: O(1).
     */
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head; // Start traversal from the head
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    /**
     * Prepends a new node to the start of the list.
     * Time Complexity: O(1) - Very efficient as no traversal is needed.
     * Space Complexity: O(1).
     */
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head; // Point new node to current head
        head = newHead;      // Update head to the new node
    }

    /**
     * Deletes the first occurrence of a node with the given value.
     * Logic: Handle the head separately, then use a 'look-ahead' approach for the rest.
     * Time Complexity: O(n) - Worst case we traverse the whole list.
     */
    public void deleteWithValue(int data) {
        // Edge Case: Empty list
        if (head == null) return;

        // Edge Case: Head contains the target value
        if (head.data == data) {
            head = head.next; // Simply bypass the old head
            return;
        }

        // Search for the value in the rest of the list
        Node current = head;
        while (current.next != null) {
            // We check current.next so we can "skip" it if it matches
            if (current.next.data == data) {
                current.next = current.next.next;
                return; // Value found and deleted
            }
            current = current.next;
        }
    }

    /**
     * Reverses the linked list in-place using the iterative "three-pointer" technique.
     * This is a high-frequency interview question.
     * 
     * Time Complexity: O(n) - Single pass through the list.
     * Space Complexity: O(1) - No extra data structures used.
     */
    public void reverse() {
        Node prev = null;     // Tracks the node that will become the 'next' of current
        Node current = head;  // We use a local 'current' to maintain clarity, though 'head' works too
        Node nextNode = null; // Temporary storage for the next node

        while (current != null) {
            nextNode = current.next; // 1. Save the next node (so we don't lose the rest of the list)
            current.next = prev;     // 2. Reverse the link (the actual reversal step)
            prev = current;          // 3. Move prev forward
            current = nextNode;      // 4. Move current forward
        }
        
        // After the loop, 'prev' is pointing to what was the old tail (new head)
        head = prev;
    }
}
