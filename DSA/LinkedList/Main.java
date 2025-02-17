package LinkedList;

public class Main {
    
    // Node class representing each element in the linked list
    public static class Node {
        int data; //data stored in the node
        Node next; //reference to the next node

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class to manage the list
    public static class LinkedList {
        Node head; //head of the list
        Node tail; //tail of the list
        int size; //size of the list

        void addLast(int value){
            if(size == 0){
                Node temp = new Node(value);
                temp.next = null;
                head = tail = temp;
                size++;
            } else {
                Node temp = new Node(value);
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++; 
            }
        }
    }

    public void display(){
        Node temp = head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("LinkedList:"+);
    }
}
