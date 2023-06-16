package Programmers.level1;
/*
<짝수와 홀수>
num % 2 == 0 이면 Even, !=0이면 Odd를 반환한다.
*/
public class Solution4 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution(10));
    }
}
