// BGW-Stack/Main.java
 
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
