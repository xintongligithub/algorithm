package chapter1;

//1.2
public class Stack<Item>
{
    private Node<Item> first; // top of stack (most recently added node)
    private int N = 0;
    // number of items

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
        // first 是堆栈顶部
        // 元素在被实例化之前的赋值只是元素的内存位置。用new 实例化之后赋值则指向统一元素。
        Node oldfirst =first;
        //创建新的链接点，oldfirst 和 first已经指向不同链接点
        first = new Node();
        first.item = item;
        //新链接的下一个链接指向原来的第一个链接
        first.next = oldfirst; 
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
        
    }
    
}