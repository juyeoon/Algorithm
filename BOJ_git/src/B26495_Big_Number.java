import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단순 구현
// 2의 "2xxx "라인을 구현할 때(x는 공백) "2xxx \n"이 아닌 "2 \n"으로 표현해야함
public class B26495_Big_Number {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[] = br.readLine().toCharArray(); // 입력 수
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') { // 0
				sb.append("0000 \n0  0 \n0  0 \n0  0 \n0000 \n");
			} else if (c[i] == '1') { // 1
				sb.append("   1 \n   1 \n   1 \n   1 \n   1 \n");
			} else if (c[i] == '2') { // 2
				sb.append("2222 \n   2 \n2222 \n2 \n2222 \n");
			} else if (c[i] == '3') { // 3
				sb.append("3333 \n   3 \n3333 \n   3 \n3333 \n");
			} else if (c[i] == '4') { // 4
				sb.append("4  4 \n4  4 \n4444 \n   4 \n   4 \n");
			} else if (c[i] == '5') { // 5
				sb.append("5555 \n5 \n5555 \n   5 \n5555 \n");
			} else if (c[i] == '6') { // 6
				sb.append("6666 \n6 \n6666 \n6  6 \n6666 \n");
			} else if (c[i] == '7') { // 7
				sb.append("7777 \n   7 \n   7 \n   7 \n   7 \n");
			} else if (c[i] == '8') { // 8
				sb.append("8888 \n8  8 \n8888 \n8  8 \n8888 \n");
			} else { // 9
				sb.append("9999\n9  9\n9999\n   9\n   9\n");
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}