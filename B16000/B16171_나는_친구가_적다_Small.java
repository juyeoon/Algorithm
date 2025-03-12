import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// replaceAll로 숫자를 업애고 indexOf로 포함여부 확인
public class B16171_나는_친구가_적다_Small {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().replaceAll("[0-9]", ""); // 숫자 지우기
		String k = br.readLine(); // 찾을 키워드
		System.out.println(s.indexOf(k) == -1 ? 0 : 1); // 키워드가 없으면 0, 있으면 1 출력
		br.close();
	}
}