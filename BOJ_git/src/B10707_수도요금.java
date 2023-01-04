import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// X사의 1달간 수도 요금 = P * A
// Y사의 1달간 수도 요금
// => i) (P <= C) B
// => ii) (P > C) B + (P - C) * D
public class B10707_수도요금 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // X사의 1리터당 요금
		int B = Integer.parseInt(br.readLine()); // Y사의 기본요금
		int C = Integer.parseInt(br.readLine()); // Y사의 요금이 기본요금이 되는 사용량의 상한
		int D = Integer.parseInt(br.readLine()); // Y사의 1리터 당 추가요금
		int P = Integer.parseInt(br.readLine()); // JOI군의 집에서 사용하는 한 달간 수도의 양
		int X = P * A; // X사를 이용했을 때의 요금
		int Y = B + (P <= C ? 0 : (P - C) * D); // Y사를 이용했을 때의 요금
		System.out.println(Math.min(X, Y)); // 최솟값 출력
		br.close();
	}
}