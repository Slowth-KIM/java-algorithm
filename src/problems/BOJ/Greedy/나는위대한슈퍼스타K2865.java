package problems.BOJ.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 나는위대한슈퍼스타K2865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Pair> pairs = new ArrayList<>();
        double score = 0;
        ArrayList<Integer> finalIdList = new ArrayList<>();


        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                pairs.add(new Pair(sc.nextInt(), sc.nextDouble()));
            }
        }

        Collections.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return Double.compare(o2.ablity, o1.ablity);
            }
        });

        for (Pair pair : pairs) {
            if (finalIdList.size() >= k) break;
            if (!finalIdList.contains(pair.id)){
                score += pair.ablity;
                finalIdList.add(pair.id);
            } else {
                continue;
            }
        }

        System.out.println(String.format("%.1f", score));


    }

    static class Pair{
        int id;
        double ablity;

        public Pair(int id, double ablity) {
            this.id = id;
            this.ablity = ablity;
        }
    }

}
