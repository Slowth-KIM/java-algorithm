package problems.algorithms.BOJ;

import java.util.Arrays;
import java.util.Collections;

import java.util.Arrays;
import java.util.Collections;

class webtoon01 {
    public int solution(int[] prices, int[] discounts) {
        /*내림차순을 사용하기 위해서*/
        Integer[] newPrices = Arrays.stream(prices).boxed().toArray(Integer[] :: new);
        Integer[] newDiscounts = Arrays.stream(discounts).boxed().toArray(Integer[]::new);

        Arrays.sort(newPrices, Collections.reverseOrder());
        Arrays.sort(newDiscounts, Collections.reverseOrder());

        int lenDiscounts = newDiscounts.length;
        int lenPrices = newPrices.length;
        int answer = 0;

        for (int i = 0; i < lenDiscounts; i++) {
            answer += (newPrices[i] - ((newPrices[i] * newDiscounts[i]) / 100));
        }

        //입출력예시 1번같은 경우 discounts가 prices 보다 작으므로 나머지 금액 계산
        if (lenPrices > lenDiscounts){
            for (int i = lenDiscounts; i < lenPrices; i++) {
                answer += newPrices[i];
            }
        }

        return answer;
    }


}