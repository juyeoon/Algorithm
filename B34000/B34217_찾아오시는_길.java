import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34217
// 출발지 -> 한양대역 -> ITBT관 = A + C
// 출발지 -> 용답역 -> ITBT관 = B + D
public class B34217_찾아오시는_길 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()); // 출발지에서 한양대역까지 걸리는 시간
		int B = Integer.parseInt(st.nextToken()); // 출발지에서 용답역까지 걸리는 시간
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // 한양대역에서 ITBT관까지 걸리는 시간
		int D = Integer.parseInt(st.nextToken()); // 용답역에서 ITBT관까지 걸리는 시간
		int h = A + C; // 한양대역을 거칠 때 걸리는 시간
		int y = B + D; // 용답역을 거칠 때 걸리는 시간
		if (h < y) { // 한양대역이 더 빠름
			System.out.println("Hanyang Univ.");
		} else if (h > y) { // 용답역이 더 빠름
			System.out.println("Yongdap");
		} else { // 같음
			System.out.println("Either");
		}
		br.close();
	}
}
