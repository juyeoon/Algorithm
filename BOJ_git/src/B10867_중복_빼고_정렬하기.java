import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Set과 1차원 배열 정렬 사용 //25416sKB 288ms
public class B10867_중복_빼고_정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(s[i]));
		} // input(중복 제거)
		Integer[] arr = set.toArray(new Integer[0]); // set을 array로
		Arrays.sort(arr); // array정렬
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		} // 출력
		System.out.println(sb);
		br.close();
	}
}
