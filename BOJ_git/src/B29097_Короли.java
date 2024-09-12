import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// "Joffrey", "Robb", "Stannis"의 대대 수와 각 대대의 전사 수가 주어졌을 때 어떤 사람의 총 전사 수가 많은지를 구하는 문제
// 인덱스에 해당하는 사람의 이름을 저장하는 배열
// 각 사람의 총 전사 수를 저장하는 배열(두 배열의 인덱스를 같이 사용)을 사용
// 총 전사수의 최댓값을 구한 후
// 배열을 돌면서 최댓값과 같은 값을 가지는 인덱스에 해당하는 사람의 이름을 출력
public class B29097_Короли {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		String name[] = { "Joffrey", "Robb", "Stannis" }; // 각 대대를 지휘하는 사람의 이름
		int force[] = new int[3]; // 각 지휘관의 총 전사 수를 저장하는 배열
		int max = 0; // 총 전사의 수의 최댓값
		for (int i = 0; i < 3; i++) {
			force[i] = Integer.parseInt(s[i]) * Integer.parseInt(s[i + 3]); // 총 전사의 수 구하기
			max = Math.max(force[i], max); // 최댓값 구하기
		}
		for (int i = 0; i < 3; i++) { // 총 전사의 수 배열을 순회
			if (force[i] == max) { // 최댓값과 같으면
				sb.append(name[i]).append(" "); // 해당하는 지휘관의 이름 출력
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}