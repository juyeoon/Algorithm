import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean 3개를 사용하여 경우에 따라서 false로 바꾼 후 true인 조건으로 출력
public class B6764_Sounds_fishy느낌표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pre = Integer.parseInt(br.readLine()); // 직전 값
		boolean rising = true; // 증가
		boolean diving = true; // 감소
		boolean constant = true; // 일정

		for (int i = 0; i < 3; i++) { // 나머지 3개
			int value = Integer.parseInt(br.readLine()); // 현재 값
			if (pre < value) { // 증가 
				diving = false;
				constant = false;
			} else if (pre > value) { // 감소
				rising = false;
				constant = false;
			} else { // 일정
				rising = false;
				diving = false;
			}
			pre = value; // 직전 값 갱신
		}
		if (constant) { // 일정
			System.out.println("Fish At Constant Depth");
		} else if (rising) { // 증가
			System.out.println("Fish Rising");
		} else if (diving) { // 감소
			System.out.println("Fish Diving");
		} else { // 그 외
			System.out.println("No Fish");
		}

		br.close();
	}
}