import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 디스크에 넣을 파일 크기(n) = 압축 파일을 uuencode한 크기
// = (압축 파일 크기) * 1.5
// = (파일 크기 / 2) * 1.5 (반올림 필요)
// 필요한 디스크의 수(cnt) = 디스크의 넣을 파일 크기 / 플로피 디스크의 용량 + (나머지가 있으면 + 1)
// = n / 1860000 + (나머지가 있으면 + 1)
public class B6436_Floppies {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int T = 1; // 테스트케이스
		while (!(s = br.readLine().trim()).equals("0")) { // EOI
			int n = (int) Math.round(Integer.parseInt(s) / 2.0 * 1.5); // 디스크에 넣을 파일 크기
			int cnt = n / 1860000 + (n % 1860000 == 0 ? 0 : 1); // 필요한 디스크의 수
			sb.append("File #").append(T++).append("\n");
			sb.append("John needs ").append(cnt).append(" floppies.\n\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}