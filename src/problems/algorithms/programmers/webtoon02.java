package problems.algorithms.programmers;

public class webtoon02 {

    public int solution(String s, String t) {
        int result = 0;
        int length = t.length();
        int sLength = s.length();


        //s 안에 t가 없으면 루프를 빠져나오도록 한다.
        while (s.contains(t)) {
            int start = s.indexOf(t);
            int end = start + length - 1;
            sLength = s.length();

            //start와 end를 기준으로 앞 뒤로 잘라서 다시 s를 정의함
            s = s.substring(0, start) + s.substring(end + 1, sLength);
            result += 1;
        }

        return result;
    }


    public static void main(String[] args) {
        webtoon02 webtoon02 = new webtoon02();
        System.out.println(webtoon02.solution("aabcbcd"	, "abc"));
        System.out.println(webtoon02.solution("aaaaabbbbb", "ab"));
    }
}
