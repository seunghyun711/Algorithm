package Programmers.level1;
/*
<나머지가 1이 되는 수 찾기>
자연수 n이 매개변수로 주어졌을 때 n을 x로 나눈 나머지가 1이 되도록 하는 가장 자연수 x를 리턴한다.

1. 자연수 n을 1부터 나머지가 1이 될때까지 나눔
2. n을 나눴을 때 첫 번째로 나머지가 1이되게 하는 정수 x를 리턴
 */

public class Solution7 {
    public int solution(int n) {

        // 1. 자연수 n을 1부터 나머지가 1이 될때까지 나눔
        for(int i = 2; i < n; i++){
            if(n % i == 1){ // 2. n을 나눴을 때 첫 번째로 나머지가 1이되게 하는 정수 x를 리턴
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(10));
    }
}
