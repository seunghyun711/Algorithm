package Programmers.level1;
/*
<약수의 합>
*/

public class Solution1 {

    // 풀이 1
    /*
    입력받은 정수의 약수를 모두 더한 값 리턴
    1. 입력받은 정수 n에 1~n 순서로 나눈다.
    2. 1~n을 나누면서 나머지가 0이되는 정수를 배열에 담는다.
    3. 배열에 있는 정수의 합 계산
     */
    public int solution(int n) {
        int sum = 0; // 약수의 합
        int[] zeroRemainder = new int[n+1]; // n에 1~n을 나눴을 때 나머지가 0인 정수를 담을 배열
        zeroRemainder[0] = 0; // 1부터 나누기 떄문에 0번째 인덱스는 0으로 채운다.
        double result; // 입력받은 정수 n을 1~n으로 나눈 값

        // 1. 입력받은 정수 n에 1~n 순서로 나눈다.
        for(int i = 1; i <= n; i++){
            result = n % i;
            System.out.println("result = " + result + " i = " + i);

            // 2. 1~n을 나누면서 나머지가 0이되는 정수를 배열에 담는다.
            if(result == 0){
                zeroRemainder[i] = i;
            }
        }

        // 3. 배열에 있는 정수의 합 계산
        for(int i = 1; i < zeroRemainder.length; i++){
            sum += zeroRemainder[i];
        }

        return sum;
    }

    // 풀이 2
    /*
    1. 정수 n을 1~n/2 순서대로 나눈다.
    2. 1번 결과의 나머지가 0이면 값을 누적해서 더한다.
    3. 최종 sum값에 정수 n의 값을 더한다.
     */
    public int solution2(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum + n;

    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution2(12));
    }
}
