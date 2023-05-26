import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 수를 좌표로 생각하기 위해 -1
// 가로 거리 = (b의 열 위치 - a의 열 위치)의 절댓값 = (b / 4 - a / 4)의 절댓값
// 세로 거리 = (b의 행 위치 - a의 행 위치)의 절댓값 = (b % 4 - a % 4)의 절댓값
public class B1598_꼬리를_무는_숫자_나열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]) - 1; // a 좌표
		int b = Integer.parseInt(s[1]) - 1; // b 좌표
		int dis = Math.abs(b / 4 - a / 4) + Math.abs(b % 4 - a % 4); // 가로 거리 + 세로 거리
		System.out.println(dis);
		br.close();
	}
}