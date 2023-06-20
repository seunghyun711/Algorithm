package Programmers.level1;

/*
<X만큼 간격이 있는 n개 숫자>
1. x부터 x+n까지 반복하면서 x+n을 배열에 삽입
 */
public class Solution5 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        // 0번째 인덱스는 x
        answer[0] = x;

        // 1. x부터 x+n까지 반복하면서 x+n을 배열에 삽입
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }
}
