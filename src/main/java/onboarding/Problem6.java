package onboarding;

import java.util.List;

/**
 * 기능 1: 이메일, 이름을 가져와 주는 함수 작성
 * 기능 2: 중복 닉네임을 판단하여 이메일을 담는 함수 작성
 * 기능 3: 담긴 이메일 중에 중복을 제거하고 정렬해주는 함수 작성
 */
public class Problem6 {

    public static String getEmail(List<String> userInfoList) {
        return userInfoList.get(0);
    }

    public static String getName(List<String> userInfoList) {
        return userInfoList.get(1);
    }

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }
}
