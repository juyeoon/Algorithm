import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

// https://www.acmicpc.net/problem/3512
// 1. 모든 방 면적을 합산하여 전체 면적을 계산
// 2. 침실 면적만 따로 합산
// 3. 유효 면적 × 단가로 총 가격을 계산
// 발코니는 면적의 절반만 유효 면적으로 포함, 그 외 방은 전체 면적을 유효 면적으로 포함
// 불필요한 소수점 0은 BigDecimal을 통해 제거하여 출력
public class B3512_Flat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 방의 수
        int c = Integer.parseInt(st.nextToken()); // 제곱미터당 가격
        int totalArea = 0; // 전체 방 면적 합
        int bedroomArea = 0; // 침실 면적 합
        double reducedArea = 0.0; // 할인 면적
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 현재 방의 면적
            String t = st.nextToken(); // 현재 방의 종류
            totalArea += a; // 전체 면적에 포함
            if (t.equals("bedroom")) {
                bedroomArea += a; // 침실 면적에 포함
                reducedArea += a; // 할인 면적에도 전체 포함
            } else if (t.equals("balcony")) {
                reducedArea += a / 2.0; // 발코니는 절반만 할인 면적에 포함
            } else {
                reducedArea += a; // 그 외 방은 전체 포함
            }
        }
        DecimalFormat df = new DecimalFormat("0.######"); // 불필요한 소수점 제거용
        System.out.println(totalArea); // 전체 면적 출력
        System.out.println(bedroomArea); // 침실 면적 출력
        System.out.printf(df.format(reducedArea * c)); // 가격 출력
    }
}
