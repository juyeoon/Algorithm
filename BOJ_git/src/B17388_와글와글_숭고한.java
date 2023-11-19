import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if-else문을 이용하여 가장 낮은 참여도를 가진 학교에 따라 출력
public class B17388_와글와글_숭고한 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int S = Integer.parseInt(s[0]); // 숭실대학교의 참여도
		int K = Integer.parseInt(s[1]); // 고려대학교의 참여도
		int H = Integer.parseInt(s[2]); // 한양대학교의 참여도
		if (S + K + H >= 100) { // 합이 100 이상일 때
			System.out.println("OK");
		} else {
			if (K > S && H > S) {// 숭실대의 참여도가 가장 낮을 때
				System.out.println("Soongsil");
			} else if (S > K && H > K) {// 고려대의 참여도가 가장 낮을 때
				System.out.println("Korea");
			} else {// 한양대의 참여도가 가장 낮을 때
				System.out.println("Hanyang");
			}
		}
		br.close();
	}
}