import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

// https://www.acmicpc.net/problem/15449
// 막대 길이 5개가 주어졌을 때 삼각형을 만들 수 있는 서로 다른 삼각형의 개수
// 삼각형 성립 조건 : 가장 긴 변 < 짧은 두 변의 합
// 서로 다른 삼각형의 개수이므로 중복이 없는 조합을 구함
public class B15449_Art {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N = 5;
        int l[] = new int[N]; // 막대의 길이
        for (int i = 0; i < N; i++) { // l[] 채우기
            l[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(l); // 길이 순으로 정렬 (길이 비교 조건문을 쉽게 작성하기 위해)
        int cnt = 0; // 서로 다른 삼각형의 개수
        for (int i = 0; i < N; i++) { // 가장 짧은 변
            for (int j = i + 1; j < N; j++) { // 두 번째로 짧은 변
                for (int k = j + 1; k < N; k++) { // 가장 긴 변
                    if(l[k] < l[i] + l[j]){ // 삼각형을 만들 수 있으면
                        cnt++; // 카운트
                    }
                }
            }
        }
        System.out.print(cnt); // 출력
        br.close();
    }
}
