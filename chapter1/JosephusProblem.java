package chapter1;

public class JosephusProblem {
    public static void main(String []args){
        int n=Integer.parseInt(args[0]);
        int m=Integer.parseInt(args[1]);
        Queue<Integer> q =new Queue<Integer>();
        int i;
        for(i=0;i<n;i++){
            q.enqueue(i);
        }
        for(i=1;i<=n;i++){
            for(int j=0;j<m-1;j++){
                q.enqueue(q.dequeue());
            }
            System.out.print(q.dequeue()+" ");
        }
    }
}