package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }



    public void show() {
        if(head == null){
            System.out.println("Linked list is Empty");
        }
        else{
            Node<T> temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }}
    public void add(T data){
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }



        public void insertAtMid(T data)
    {
        
        if (head == null)
            head = new Node(data);
        else {

            Node newNode = new Node(data);

            Node ptr = head;
            int len = 0;


            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }


            int count = ((len % 2) == 0) ? (len / 2) :
                    (len + 1) / 2;
            ptr = head;


            while (count-- > 1)
                ptr = ptr.next;


            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }
    public void pop() {
        {
            if (this.head != null) {
                Node temp = this.head;
                this.head = this.head.next;
                temp = null;
            }
        }}

    public void popBack() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(head != tail ) {
                Node current = head;

                while(current.next != tail) {
                    current = current.next;
                }

                tail = current;
                tail.next = null;
            }

            else {
                head = tail = null;
            }
        }
    }

    public void search(T data) {
        Node current = head;
        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {

                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }



    public void insertAtPos(int data, int position)
    {  Node node = new Node(data);
        node.data = data;
        node.next= null;

        if (this.head == null) {

            if (position != 0) {
                return;
            } else {
                this.head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;
    }

    public void popAt(int position)
    {if (head == null)
        return;


        Node temp = head;


        if (position == 0) {
            head = temp.next;
            return;
        }


        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;


        if (temp == null || temp.next == null)
            return;


        Node next = temp.next.next;

        temp.next
                = next;
    }


    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;

    }


    public void sort() {
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if ((int)current.data > (int)index.data) {
                        temp = (int) current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}














