package _29_Wrapper;

public class Practice {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        // 1. Integer 배열로 변환
        // Integer.valueOf(int 값) -> 박싱
        // scores를 for문을 돌면서 박싱을 해조야겟다!!
        // 어디에 담짛?? -> Integer 배열을 하나 만들어야겟닿
        Integer[] integerScores = new Integer[scores.length];
        int intValue =  // 대입
        for (int i = 0; i < scores.length; i++) {
            int intValue = scores[i]; // int 값 추출
            Integer integerValue = Integer.valueOf(intValue); // 박싱

        }

        // 2. 최고점, 최저점을 적절한 Integer 메서드를 사용해 구하기
        // max() : 두 개 비교해 큰 값 리턴, min() : 두 개 비교해 작은 값 리턴
        Integer maxScore = 0;
        Integer minScore = 0;
    }
}