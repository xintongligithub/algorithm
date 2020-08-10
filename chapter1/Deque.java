package chapter1;

public class Deque<Item> {
    private DoublyNode<Item> left;
    private DoublyNode<Item> right;
    private int N=0;

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void pushLeft(Item item){
        DoublyNode oldleft=left;
        left=new <Item> DoublyNode();
        left.item=item;
        if(N==0){
            right=left;
        }else{
            left.next=oldleft;
            oldleft.previous=left;
        }

        N++;
    }

    public void pushRight(Item item){
        DoublyNode oldright=right;
        right=new <Item> DoublyNode();
        right.item=item;

            if(N==0){
                left=right;
            }else{
                oldright.next=right;
                right.previous=oldright;
            }
        N++;
    }

    public Item popLeft(){
        Item item=left.item;
        left=left.next;
        left.previous=null;
        N--;
        return item;
    }

    public Item popRight(){
        Item item=right.item;
        right.previous=right;
        right.next=null;
        N--;
        return item;
    }

    public String toString(){
        String str="";
        while(left!=null){
            str=str+" " +left.item;
            left=left.next;
        }
        return str;
    }
    public static void main(String[] args){
        Deque<String> deque=new Deque<String>();
        String str1="1";
        String str2="2";
        String str3="3";
        String str4="4";
        String str5="5";
        deque.pushLeft(str1);
        deque.pushLeft(str2);
        deque.pushRight(str3);
        deque.pushRight(str4);
        deque.pushLeft(str5);

        deque.popLeft();
        deque.popRight();
        System.out.println(deque);
    }
}