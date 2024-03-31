import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사과가 X개, 귤이 Y개, 바나나가 3개 있을 때 총 몇 개인지 구하는 문제
public class B31606_果物_Fruit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 사과 개수
		int Y = Integer.parseInt(br.readLine()); // 귤 개수
		System.out.println(X + Y + 3); // 출력
		br.close();
	}
}