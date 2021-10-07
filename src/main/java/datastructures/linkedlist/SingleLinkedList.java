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


  public static void main(String[] args) {
    // create
    SingleLinkedList list = new SingleLinkedList();
    // add 1,2,3,4,5
    list.add(1);
    list.add(2);
    list.add(3);

    // print
    // reverse
    // print
  }
}

class Node {
  int value;
  Node next;

  Node(int value) {
    this.value = value;
  }
}
