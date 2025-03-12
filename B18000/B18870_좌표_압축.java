import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// 오름차순으로 정렬하여 중복을 제거하고 랭크(rank)를 매기는 문제
public class B18870_좌표_압축 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 좌표 개수
		String s[] = br.readLine().split(" ");

		int oriNum[] = new int[N]; // 원본 좌표
		int sortNum[] = new int[N]; // 정렬 좌표
		for (int i = 0; i < N; i++) { // input oriNum[], sortNum[]
			oriNum[i] = Integer.parseInt(s[i]);
			sortNum[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(sortNum); // 오름차순으로 정렬
		HashMap<Integer, Integer> map = new HashMap<>(); // 좌표와 랭크를 저장
		int rank = 0; // 랭크
		for (int snum : sortNum) {
			if (!map.containsKey(snum)) { // 좌표 중복 제거
				map.put(snum, rank); // 좌표와 랭크를 저장
				rank++;
			}
		}
		for (int onum : oriNum) { // 원본 좌표 순서대로 확인
			sb.append(map.get(onum)).append(" "); // sb에 좌표에 맞는 랭크를 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}