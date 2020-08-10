package chapter1;

public class Queue<Item> {
    private Node<Item> first; // link to least recently added node. first是队列的底部
    private Node<Item> last; // link to most recently added node. last是队列的顶部
    private int N; // number of items on the queue

    public boolean isEmpty() 
    {
        return first == null;
    }

    public int size()
    {
        return N; 
    }

    public void enqueue(Item item)
    { // Add item to the end of the list.
        Node<Item> oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else
        oldlast.next = last;
        N++;
    }

    public Item dequeue()
    { // Remove item from the beginning of the list.
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

}