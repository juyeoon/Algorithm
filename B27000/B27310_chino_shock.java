import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 길이는 String.length()로 계산
// 콜론의 개수는 2개로 고정
// 문자열을 for 반복문으로 순회하면서 '_' 개수 찾기
public class B27310_chino_shock {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      int difficulty = s.length() + 2; // 문자열 길이 + 콜론 개수
      int underbar = 0; // 언더바 개수
      for (int i = 0; i < s.length(); i++) { // 문자열 순회
         if (s.charAt(i) == '_') { // 언더바가 있으면
            underbar++; // 개수 갱신
         }
      }
      System.out.println(difficulty + underbar * 5); // 출력
      br.close();
   }
}
