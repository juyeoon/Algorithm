import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N달러를 M개씩 묶고 묶은 다발을 다시 M개씩 묶는 과정을 더이상 묶을 수 없을 때까지 반복하므로
// N을 M으로 나눈 몫을 다시 M으로 나누는 과정을 몫이 M보다 작아질 때까지 반복. 반복할 때마다 몫을 합하여 합한 값 출력 
public class B17174_전체_계산_횟수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 1달러 개수
		int M = Integer.parseInt(s[1]); // 묶음 개수
		int sum = N; // 몫의 합
		int share = N; // 몫
		while (share >= M) { // 몫이 M보다 작아질 때까지 반복
			share /= M;
			sum += share;
		}
		System.out.println(sum); // 출력
		br.close();
	}
}