package Programmers.level1;
/*
<평균 구하기
1. 배열 내 정수의 총 합을 구한다.
2. 정수 총 합 / 배열 길이
 */
public class Solution3 {
    public double solution(int[] arr) {
        double sum = 0;

        // 1. 배열 내 정수의 총 합을 구한다.
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double answer = sum / arr.length;
        return answer;
    }
}
