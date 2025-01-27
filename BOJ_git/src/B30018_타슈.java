import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/30018
// 각 입력 문자열을 배열에 저장한 후 같은 위치(인덱스)의 값의 차를 모두 합한 후 나누기 2
// 한 자전거를 옮기면 두 위치의 값이 한 번에 변하기 때문에 나누기 2로 구함
public class B30018_타슈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 대여소의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[N]; // 만들려고 하는 개수
        for (int i = 0; i < N; i++) { // a[] 채우기
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] b = new int[N]; // 현재 개수
        for (int i = 0; i < N; i++) { // b[] 채우기
            b[i] = Integer.parseInt(st.nextToken());
        }
        int changeCnt = 0; // 각 인덱스의 값의 차의 합
        for (int i = 0; i < N; i++) { // changeCnt 구하기
            changeCnt += Math.abs(a[i] - b[i]);
        }
        System.out.println(changeCnt / 2); // 출력
        br.close();
    }
}
