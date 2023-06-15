package Programmers.level1;

/*
<서울에서 김서방 찾기>
배열 내에 "Kim" 찾기
1. 입력받은 배열을 순회하면서 "Kim"이 있는지 확인
*/
public class Solution2 {
    public String solution(String[] seoul) {
        String answer = "";

        // 1. 입력받은 배열을 순회하면서 "Kim"이 있는지 확인
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){ // 배열에 Kim이 존재하는 경우
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new String[]{"jane", "paul", "Kim", "Andy"}));
    }
}
