package day11;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class OnlineVotingSystem {
    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    private static void castVote(String str) {
        map.merge(str, 1, Integer::sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String candidate = in.next();
            new Thread(()->castVote(candidate)).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){}

        // Display final vote counts
        System.out.println("Final Vote Counts:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
