package chapter1;

public class Bag<Item> {
    private Node first; // first node in list

    public void add(Item item)
    { // same as push() in Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
}