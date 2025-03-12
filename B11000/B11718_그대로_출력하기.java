import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 끝을 확인하기 위해서 while문 조건에서 입력(한 줄)을 읽고 null인지 확인
public class B11718_그대로_출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = ""; // 입력문
		while ((s = br.readLine()) != null) { // 입력문이 null이 아니면(읽어올 문장이 있으면) 반복
			sb.append(s).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
