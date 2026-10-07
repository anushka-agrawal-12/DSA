package queues;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeBasics {
   public class newDeque{
     Deque<Integer>deque=new ArrayDeque<>();
    public void test(){
      deque.offerLast(10);
    deque.offerLast(20);
    deque.offerFirst(5);

    }
   }
}
