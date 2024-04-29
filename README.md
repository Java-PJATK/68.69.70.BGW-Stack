# 68.69.70.BGW-Stack

## 12.2 Stacks  

A stack is a very simple but extremely useful data structure. It provides three operations  

* push — adding new element;  
* pop — removing one element (and getting its value);  
* empty — checking if the stack is empty.  

However, adding (pushing) and removing (popping) elements must be organized in
such the way that what we pop is always what we pushed most recently. For example,
if we push first A, then B and then C, three consecutive “pops” will give us first C,
then B and lastly A. A structure organized in this way is called LIFO (last in, first
out).
A stack may be easily implemented as a singly linked list: we always add (push)
an element at the front (so it becomes the new head) and pop elements also from the
front. Note that traversing the list will never be necessary! 

Let us consider an example. Wrapping class Node looks the same as before  

## Listing 68 BGW-Stack/Node.java  

```java
  // could be private static inner class of MyStack
public class Node {
    private int data;
    private Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this(data,null);
    }
    int  getData() { return data; }
    Node getNext() { return next; }
}

```
and the implementation is very simple  

## Listing 69 BGW-Stack/MyStack.java

```java
public class MyStack {
    private Node head = null;
    public void push(int data) {
        head = new Node(data,head);
    }
    public int pop() {
        int d = head.getData();
        head = head.getNext();
        return d;
    }
    public boolean empty() {
        return head == null;
    }
}
```

In Main, we test our stack:  

## Listing 70 BGW-Stack/Main.java

```java
public class Main {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(8);
        st.push(0);
        while (!st.empty())
            System.out.println("popping " + st.pop());
    }
}

```

The program prints  

```
popping 6
popping 5
popping 4
```

The output shows that, indeed, what we have pushed last (value 6) has been popped first.  
