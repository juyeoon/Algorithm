import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 빨랫줄의 높이와 길이가 주어지고 직사각형의 망토를 접어서 빨랫줄에 널 때, 망토가 끌리지 않게 널 수 있는지 판별하는 문제
// i) 망토의 긴 부분을 접어서 너는 경우 => 빨랫줄의 높이보다 망토의 긴 길이/2가 작아야 함 && 빨랫줄의 길이보다 망토의 짧은 길이가 짧아야 함
// ii) 망토의 짧은 부분을 접어서 너는 경우 => 빨랫줄의 높이보다 망토의 짧은 길이/2가 작아야 함 && 빨랫줄의 길이보다 망토의 긴 길이가 짧아야 함
// 둘 중에 한 경우라도 가능하면 "YES" 아니면 "NO" 출력
public class B28960_Плащ_левитации {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int h = Integer.parseInt(s[0]); // 빨랫줄의 높이
		int l = Integer.parseInt(s[1]); // 빨랫줄의 길이
		double a = Double.parseDouble(s[2]); // 망토의 한 길이
		double b = Double.parseDouble(s[3]); // 망토의 다른 한 길이
		boolean yes = false; // 널 수 있는지 여부(true: 가능함)
		if (h >= Math.max(a, b) / 2 && l >= Math.min(a, b)) { // i) 망토의 긴 부분을 접어서 너는 경우
			yes = true;
		} else if (h >= Math.min(a, b) / 2 && l >= Math.max(a, b)) { // ii) 망토의 짧은 부분을 접어서 너는 경우
			yes = true;
		}
		System.out.println(yes ? "YES" : "NO"); // 출력
		br.close();
	}
}