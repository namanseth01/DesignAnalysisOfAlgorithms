package GreedyApproach.ActivitySelectionProblem;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;


public class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Activity[] activities = new Activity[n];
        for(int i = 0; i< n ; i++){
            int at = sc.nextInt();
            int ft = sc.nextInt();
            activities[i] = new Activity(at, ft);
        }
        Arrays.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.finishTime.compareTo(o2.finishTime);
            }
        });

        int i = 0;
        int count = 1;

        for (int j = 1; j < n; j++)
        {

            if (activities[j].arrivalTime >= activities[i].finishTime)
            {
                count += 1;
                i = j;
            }
        }

        System.out.println(count);

    }

}

class Activity{
    Integer arrivalTime;
    Integer finishTime;

    public Activity(int arrivalTime, int finishTime){
        this.arrivalTime = arrivalTime;
        this.finishTime = finishTime;
    }
}
