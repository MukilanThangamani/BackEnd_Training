package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class StudentsGradeSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = in.nextInt();
        Vector<Integer> grade = new Vector<>();
        for(int i=0;i<n;i++){
            int gr = in.nextInt();
            grade.add(gr);
        }
        System.out.println("Enter the index to Removed grade:");
        int ind = in.nextInt();
        grade.remove(ind);
        System.out.println("Grades: "+grade+" ");
        System.out.println("Highest Grade:"+ Collections.max(grade));
         System.out.println("Lowest Grade:"+ Collections.min(grade));
         int sum=0;
        for(int i : grade){
            sum+=i;
        }
        double avg = sum/grade.size();
        System.out.println("Average Grade:"+avg);
    }
}
