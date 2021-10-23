package datastructures.linkedlist;

public class SingleLinkedList {
  Node head;
  Node tail;

  public void add(int value) {
    Node nextNode = new Node(value);

    if (head == null) {
      head = nextNode;
      tail = head;
    } else {
      tail.next = nextNode;
      tail = nextNode;
    }
  }

  public void reverse() {
    Node curr = head, temp, newHead = null;
    while (curr != null) {
      temp = curr.next;
      curr.next = newHead;
      newHead = curr;
      curr = temp;
    }
    this.head = newHead;
  }


  public static void main(String[] args) {
    // create
    SingleLinkedList list = new SingleLinkedList();
    // add 1,2,3,4,5
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    // print
    list.print();

    list.reverse();
    list.print();

    // print
  }

  public void print() {
    Node node = head;
    while (node != null) {
      System.out.printf("%d ", node.value);
      node = node.next;
    }
    System.out.println("\n");
  }

  private static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }
}
