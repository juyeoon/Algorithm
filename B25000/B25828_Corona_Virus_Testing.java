import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그룹 테스트 후 양성인 그룹만 개별 테스트 진행 => 그룹 수(g) + 그룹 당 사람 수(p) * 양성 반응인 그룹 수(t)
// 처음부터 개별 테스트 => 그룹 수(g) * 그룹 당 사람 수(p)
public class B25828_Corona_Virus_Testing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int g = Integer.parseInt(s[0]); // 그룹 수
		int p = Integer.parseInt(s[1]); // 그룹 당 사람 수
		int t = Integer.parseInt(s[2]); // 양성 반응인 그룹 수
		if (g + p * t > g * p) { // 그룹테스트 후 개별 테스트 > 개별 테스트
			System.out.println(1);
		} else if (g + p * t < g * p) { // 그룹테스트 후 개별 테스트 < 개별 테스트
			System.out.println(2);
		} else { // 그룹테스트 후 개별 테스트 == 개별 테스트
			System.out.println(0);
		}
		br.close();
	}
}