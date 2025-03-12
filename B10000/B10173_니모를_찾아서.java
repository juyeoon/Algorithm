import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 확인하면서 대소문자 구분 없이 'nemo'가 있는지 확인
public class B10173_니모를_찾아서 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("EOI")) { // EOI
			boolean nemo = false; // 니모 존재 여부
			for (int i = 0; i < s.length(); i++) { // 문자열 길이만큼 반복
				if ((s.charAt(i) == 'n' || s.charAt(i) == 'N') 
						&& (s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'E')
						&& (s.charAt(i + 2) == 'm' || s.charAt(i + 2) == 'M')
						&& (s.charAt(i + 3) == 'o' || s.charAt(i + 3) == 'O')) { // 니모가 있으면
					nemo = true;
					break; // 반복문 탈출
				}
			}
			sb.append(nemo ? "Found\n" : "Missing\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}