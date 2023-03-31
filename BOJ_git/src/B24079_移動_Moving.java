import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 총 이동 시간(X + Y)이 시간 단위로 주어지기 때문에 제한 시간(Z)에 1을 더한 값 보다 작으면 가능, 크면 불가능
public class B24079_移動_Moving {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine().trim()); // A지점에서 B지점까지 이동 시간
		int Y = Integer.parseInt(br.readLine().trim()); // B지점에서 C지점까지 이동 시간
		int Z = Integer.parseInt(br.readLine().trim()); // 제한 시간의 시 부분
		System.out.println((X + Y < Z + 1) ? 1 : 0); // 출력
		br.close();
	}
}