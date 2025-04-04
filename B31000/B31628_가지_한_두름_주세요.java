import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31628
// 입력 받은 문자열을 10x10 배열에 저장 후 각 행을 확인 + 각 열을 확인
// 한 줄이라도 모두 같은 문자열을 가지는 줄이 있으면 1 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] eggplant = new String[10][10]; // 가지 색 문자열
        for (int i = 0; i < 10; i++) { // eggplant[][] 채우기
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                eggplant[i][j] = st.nextToken();
            }
        }
        boolean yes = false; // 한 두름 가능 여부(true: 가능)
        // 행 확인
        outerRow:
        for (int i = 0; i < 10; i++) {
            String first = eggplant[i][0]; // 해당 행의 첫 문자열
            for (int j = 1; j < 10; j++) {
                if (!first.equals(eggplant[i][j])) {
                    break;
                }
                if (j == 9) { // 모두 같으면
                    yes = true;
                    break outerRow;
                }
            }
        }
        // 열 확인
        outerCol:
        for (int j = 0; j < 10; j++) {
            String first = eggplant[0][j]; // 해당 열의 첫 문자열
            for (int i = 1; i < 10; i++) {
                if (!first.equals(eggplant[i][j])) {
                    break;
                }
                if (i == 9) { // 모두 같으면
                    yes = true;
                    break outerCol;
                }
            }
        }
        System.out.println(yes ? 1 : 0); // 출력
        br.close();
    }
}
