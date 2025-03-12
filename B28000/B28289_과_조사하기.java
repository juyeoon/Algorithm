import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/28289
// 2학년 이상 1, 2반, 3반, 4반, 1학년 수를 배열에 저장
// 1학년 학생 카운트
// 1학년이 아니면 반에 따라 카운트
// 반복문으로 배열의 값 출력
public class B28289_과_조사하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각 과목과 1학년 학생의 수를 저장할 배열 (0: 소프트웨어개발과, 1: 임베디드소프트웨어개발과, 2: 인공지능소프트웨어개발과, 3: 1학년 학생)
        int[] cnt = new int[4];
        int P = Integer.parseInt(br.readLine()); // 학생 수
        for (int i = 0; i < P; i++) { // P명의 학생 정보를 처리
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken()); // 학년
            int C = Integer.parseInt(st.nextToken()); // 반
            int N = Integer.parseInt(st.nextToken()); // 번호
            if (G == 1) { // 1학년 학생인 경우
                cnt[3]++;
            } else { // 2학년 이상 학생들에 대해 반에 따라 과를 결정
                if (C == 1 || C == 2) { // 1, 2반은 소프트웨어개발과
                    cnt[0]++;
                } else if (C == 3) { // 3반은 임베디드소프트웨어개발과
                    cnt[1]++;
                } else if (C == 4) { // 4반은 인공지능소프트웨어개발과
                    cnt[2]++;
                }
            }
        }
        for (int count : cnt) { // 출력
            System.out.println(count);
        }
    }
}
