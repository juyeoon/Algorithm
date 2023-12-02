import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력값의 앞 두 수를 곱한 값(마샤 방 크기)과 뒤 두 수를 곱한 값(페타 방 크기)을 비교
public class B27267_Сравнение_комнат {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int M = Integer.parseInt(s[0]) * Integer.parseInt(s[1]); // 마샤 방 크기
		int P = Integer.parseInt(s[2]) * Integer.parseInt(s[3]); // 페타 방 크기
		System.out.println(M == P ? "E" : (M > P ? "M" : "P")); // 출력
		br.close();
	}
}