import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정규식을 사용하여 제거
// [abc] => a 또는 b 또는 c
public class B2789_유학_금지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().replaceAll("[CAMBRIDGE]", "")); // 제거한 문자열 출력
		br.close();
	}
}