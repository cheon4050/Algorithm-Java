import java.util.*;
class Solution{
    public static int solution(int[] priorities, int location) {
        Queue<Tuple> q = new LinkedList<>();
        for (int i = 0; i < priorities.length;i++){
            Tuple tuple = new Tuple(i, priorities[i]);
            q.add(tuple);
        }
        int cnt = 0;
        while (true){
            Tuple tuple = q.poll();
            loop: {
                for (Tuple item: q) {
                    if (item.priority > tuple.priority) {
                        q.add(tuple);
                        break loop;
                    }
                }
                cnt +=1;
                if (tuple.idx == location){
                    return cnt;
                }
            }
        }
    }

    private static class Tuple{
        public int idx;
        public int priority;

        public Tuple(int idx,int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
