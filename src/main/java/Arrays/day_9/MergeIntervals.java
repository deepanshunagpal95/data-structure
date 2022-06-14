package Arrays.day_9;

import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals {


    public static void main(String[] args) {
        Intervals[] intervals = new Intervals[4];
        intervals[0]=new Intervals(6,8);
        intervals[1]=new Intervals(1,9);
        intervals[2]=new Intervals(2,4);
        intervals[3]=new Intervals(4,7);
        merge(intervals);

    }

    public static void merge(Intervals[] intervals) {
        Stack<Intervals> s = new Stack<>();
        s.add(intervals[0]);

        Arrays.sort(intervals, new Comparator<Intervals>() {
            @Override
            public int compare(Intervals o1, Intervals o2) {
                return o1.start - o2.start;
            }
        });
        for(int i =0;i<intervals.length;i++){
            Intervals peek = s.peek();
            if(peek.end<intervals[i].start){
                s.push(intervals[i]);
            }
            else if(peek.end<intervals[i].end){
                peek.end = intervals[i].end;
                 s.pop();
                 s.push(peek);
            }


        }

        System.out.print("The Merged Intervals are: ");
        while (!s.isEmpty())
        {
            Intervals t = s.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }

    static class Intervals {
        int start;
        int end;

        Intervals(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
