package Programmers.level1;

/*
<문자열 내 p와 y의 개수>
문자열 내 p와 y개수가 같으면 true 아니면 false 리턴
1. 문자열 s를 문자 배열로 변환
2. 문자 배열을 순회하면서 p의 개수와 y의 개수 파악
3. p의 개수와 y의 개수가 같으면 true, 다르면 false 리턴
 */
public class Solution6 {
    boolean solution(String s) {
        int pNum = 0; // p의 개수를 저장할 변수
        int yNum = 0; // y의 개수를 저장할 변수

        char[] arr = new char[s.length()]; // 문자열을 담을 문자 배열

        // 1. 문자열 s를 문자 배열로 변환
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }

        // 2. 문자 배열을 순회하면서 p의 개수와 y의 개수 파악
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'p' || arr[i] == 'P'){
                pNum += 1;
            }
            else if(arr[i] == 'y' || arr[i] == 'Y'){
                yNum += 1;
            }
        }

        // 3. p의 개수와 y의 개수가 같으면 true, 다르면 false 리턴
        boolean answer;

        if(pNum == yNum){
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }
}
