import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 입력 숫자에 맞게 정답 문자열 출력
public class B32154_SUAPC_2024_Winter {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (Integer.parseInt(br.readLine())) { // 등수에 따른 출력
		case 1:
			System.out.println(11 + "\nA B C D E F G H J L M");
			break;
		case 2:
		case 3:
			System.out.println(9 + "\nA C E F G H I L M");
			break;
		case 4:
			System.out.println(9 + "\nA B C E F G H L M");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println(8 + "\nA C E F G H L M");
			break;
		case 10:
			System.out.println(8 + "\nA B C F G H L M");
			break;
		}
		br.close();
	}
}