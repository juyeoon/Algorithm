import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// k로 만든 눈덩이가 가장 큰 부위, 중간 부위, 가장 작은 부위인 경우를 나누어서 최댓값을 출력
// 단위가 밀리미터이므로 양변에 1000 곱하기
public class B8718_Bałwanek {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s[] = br.readLine().split(" ");
      int x = Integer.parseInt(s[0]); // 전체 양
      int k = Integer.parseInt(s[1]); // 만든 눈덩이 양
      int max = 0; // 최댓값. 아래의 조건을 모두 만족 못했을 때는 0 출력 필요
      if (7000 * k <= 1000 * x) { // 가장 큰 부위일 때
         max = Math.max(max, 7000 * k); 
      }
      if (3500 * k <= 1000 * x) { // 중간 부위일 때
         max = Math.max(max, 3500 * k);
      }
      if (1750 * k <= 1000 * x) { // 가장 작은 부위일 때
         max = Math.max(max, 1750 * k);
      }
      System.out.println(max); // 출력
      br.close();
   }
}
