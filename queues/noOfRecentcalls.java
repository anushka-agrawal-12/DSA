package queues;
import java.util.*;
public class noOfRecentcalls {
    public class RecentCounter{
        Queue<Integer>queue;
        RecentCounter(){
            queue = new LinkedList<>();
        }
        public int ping(int t){
            queue.offer(t);
            while(queue.peek()<t-3000){
                queue.poll();
            }
            return queue.size();
        }
    }
}
