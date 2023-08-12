package PracticeQuestion;

import java.util.*;

class Solution {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static Node addTwoLists(Node first, Node second) {
        first = reverseList(first);
        second = reverseList(second);

        Node result = null;
        Node prev = null;
        int carry = 0;
        int sum;

        while (first != null || second != null) {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;

            Node newNode = new Node(sum);

            if (result == null) {
                result = newNode;
            } else {
                prev.next = newNode;
            }

            prev = newNode;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        if (carry > 0) {
            prev.next = new Node(carry);
        }

        return reverseList(result);
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class AddTwoLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = sc.nextInt();

        Node first = new Node(val);
        Node tail = first;
        for (int i = 0; i < n - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        int m = sc.nextInt();
        val = sc.nextInt();

        Node second = new Node(val);
        tail = second;
        for (int i = 0; i < m - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        Solution g = new Solution();
        Node res = g.addTwoLists(first, second);
        printList(res);
    }

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
}
}
    

