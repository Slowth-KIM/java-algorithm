//https://www.acmicpc.net/problem/1715

package problems.algorithms.BOJ;

import java.util.PriorityQueue;
import java.util.Scanner;

public class boj1715 {

    public static int n, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        PriorityQueue<Integer> cards = new PriorityQueue<>();
        //offer, poll

        for (int i = 0; i < n; i++) {
            cards.offer(sc.nextInt());
        }

        while (cards.size() != 1){
            int card1 = cards.poll();
            int card2 = cards.poll();

            int summaryCards = card1 + card2;

            result += summaryCards;

            cards.offer(summaryCards);
        }

        System.out.println(result);
    }
}
