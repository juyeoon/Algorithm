import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29319
// 최소한 외쳐야 하는 이름의 수는 전체 반지 수에서 가장 많은 반지를 가진 그룹의 수를 뺀 값
public class B29319_Начало {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 그룹 수
        int[] rings = new int[n]; // 각 그룹의 반지 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0; // 전체 반지 개수
        int max = 0; // 가장 큰 그룹의 개수
        for (int i = 0; i < n; i++) {
            rings[i] = Integer.parseInt(st.nextToken());
            total += rings[i]; // 전체 반지 개수 갱신
            if (rings[i] > max) { // 가장 큰 그룹 갱신
                max = rings[i];
            }
        }
        System.out.println(total - max); // 출력
    }
}
