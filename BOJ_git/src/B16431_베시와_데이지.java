import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bessie가 걸린 시간 => x좌표와 y좌표의 차 중 큰 값(작은 값 => 대각선으로 이동값, 작은 값과 큰 값의 차 => 남은 사방 이동 횟수)
// Daisy가 걸린 시간 => x좌표와 y좌표의 합
public class B16431_베시와_데이지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int Br = Integer.parseInt(st.nextToken()); // Bessie x좌표
		int Bc = Integer.parseInt(st.nextToken()); // Bessie y좌표
		st = new StringTokenizer(br.readLine());
		int Dr = Integer.parseInt(st.nextToken()); // Daisy x좌표
		int Dc = Integer.parseInt(st.nextToken()); // Daisy y좌표
		st = new StringTokenizer(br.readLine());
		int Jr = Integer.parseInt(st.nextToken()); // John x좌표
		int Jc = Integer.parseInt(st.nextToken()); // John y좌표
		int Bcnt = Math.max(Math.abs(Br - Jr), Math.abs(Bc - Jc)); // Bessie가 걸린 시간
		int Dcnt = Math.abs(Dr - Jr) + Math.abs(Dc - Jc); // Daisy가 걸린 시간
		if (Bcnt > Dcnt) { // Daisy가 더 적게 걸린 경우
			System.out.println("daisy");
		} else if (Bcnt < Dcnt) { // Bessie가 더 적게 걸린 경우
			System.out.println("bessie");
		} else { // 동일하게 걸린 경우
			System.out.println("tie");
		}
		br.readLine();
	}
}