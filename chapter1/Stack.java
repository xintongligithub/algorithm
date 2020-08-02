import java.util.Iterator;
//1.2
public class Stack<Item>
{
    private Node first; // top of stack (most recently added node)
    private int N = 0;
    // number of items

    private class Node
    { // nested class to define nodes
        Item item;
        Node next;
    }

    public boolean isEmpty() 
    {
        return first == null; 
    }

    public int size()
    {
        return N; 
    }
    // Or: N == 0.

    public void push(Item item)
    { 
        // Add item to top of stack.
        // first 是堆栈顶部，最后一个元素。出栈入栈都是最后一个元素。
        // 元素在被实例化之前的赋值只是元素的内存位置。用new 实例化之后赋值则指向统一元素。
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    { // Remove item from top of stack.
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}