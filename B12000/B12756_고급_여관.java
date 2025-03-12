import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// B가 죽을 때까지의 A의 공격 횟수와 A가 죽을 때까지의 B의 공격 횟수를 비교하여 더 적은 공격 횟수를 가진 플레이어가 승리
// X가 죽을 때까지의 Y의 공격 횟수 => (X의 생명력 / Y의 공격력) + (X의 생명력 % Y의 공격력가 0이 아니면 1)
public class B12756_고급_여관 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A[] = br.readLine().split(" ");
		int Aatk = Integer.parseInt(A[0]); // A 공격력
		int Ahp = Integer.parseInt(A[1]); // A 생명력
		String B[] = br.readLine().split(" ");
		int Batk = Integer.parseInt(B[0]); // B 공격력
		int Bhp = Integer.parseInt(B[1]); // B 생명력
		int Acnt = Bhp / Aatk + (Bhp % Aatk == 0 ? 0 : 1); // B가 죽을 때까지의 A의 공격 횟수
		int Bcnt = Ahp / Batk + (Ahp % Batk == 0 ? 0 : 1); // A가 죽을 때까지의 B의 공격 횟수
		if (Acnt > Bcnt) { // A의 공격 횟수가 더 많으면 A가 먼저 죽음 
			System.out.println("PLAYER B");
		} else if (Acnt < Bcnt) { // A의 공격 횟수가 더 적으면 B가 먼저 죽음 
			System.out.println("PLAYER A");
		} else { // 횟수가 똑같으면
			System.out.println("DRAW");
		}
		br.close();
	}
}