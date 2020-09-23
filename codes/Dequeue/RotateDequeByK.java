public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
    for(int i=0;i<k;i++){
        deque.addLast(deque.getFirst());
        deque.removeFirst();
    }
    
}

public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
        for(int i=0;i<k;i++){
        deque.addFirst(deque.getLast());
    deque.removeLast();
            
        }
