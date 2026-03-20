import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 33845 - PNUPC에 한 번도 빠지지 않고 출연한 산지니가 새삼 대단하다고 느껴지네
// https://www.acmicpc.net/problem/33845
public class B33845_PNUPC에_한_번도_빠지지_않고_출연한_산지니가_새삼_대단하다고_느껴지네 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		String ans = br.readLine();
		for (char d : c) {
			ans = ans.replaceAll(String.valueOf(d), "");
		}
		System.out.println(ans);
		br.close();
	}
}
