import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 구성원 전부가 맞춘 문제 총 합을 구한 후 한 문제당 보상을 구하고 
//한 문제당 보상 * 맞춘 문제 개수를 각각 출력
public class B25858_Divide_the_Cash {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 팀 구성원 수
		int D = Integer.parseInt(s[1]); // 총 보상
		int Q = 0; // 구성원 전부가 맞춘 문제 총 합
		int num[] = new int[N]; // 맞춘 문제 수 배열
		for (int i = 0; i < N; i++) { // input num[]
			num[i] = Integer.parseInt(br.readLine());
			Q += num[i];
		}
		D /= Q; // 한 문제당 보상
		for (int i = 0; i < N; i++) {
			sb.append(D * num[i]).append("\n"); // 한 문제당 보상 * 맞춘 문제 개수
		}
		System.out.println(sb); // 출력
		br.close();
	}
}