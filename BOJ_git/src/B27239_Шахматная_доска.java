import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가로 세로 모두 8이기 때문에 n을 8로 나눈 몫과 나머지로 구하는데 마지막 열이 나머지가 0이므로 모든 수에 7을 더하여 처음 열의 나머지가 0이 되게 맞추기 
// row 번호는 숫자로 n을 8로 나눈 몫
// column 번호는 알파벳으로 n을 8로 나눈 나머지에 'a'를 더한 값
public class B27239_Шахматная_доска {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) + 7;
		int row = n / 8; // 세로 번호
		int column = n % 8 + 'a'; // 가로 알파벳
		System.out.println((char) column + "" + row); // 붙여서 출력
		br.close();
	}
}