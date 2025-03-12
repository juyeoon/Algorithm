import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1-3 Sum : 13자리 수를 한 자리씩 1과 3을 번갈아 곱하여 모두 더하는 것
// 앞 10자리를 9780921418로 고정, 뒤에 3자리를 입력
// 9780921418의 1-3-sum은 91
// 91 + 첫번째*1 + 두번째*3 + 세번째*1 
public class B6810_ISBN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("The 1-3-sum is ");
		// 계산
		sb.append(91 + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) * 3
				+ Integer.parseInt(br.readLine()));
		System.out.println(sb); // 출력
		br.close();
	}
}