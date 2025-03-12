import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//문자가 3개나 4개씩 끊어지는 것에 초점
public class B5622_다이얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); //문자(input)
		int t = 0; // 걸린 시간
		// ABC => 3, DEF => 4, GHI => 5, JKL => 6, MNO => 7, PQRS => 8, TUV => 9, WXYZ => 10
		for (int i = 0; i < c.length; i++) { //걸린 시간 구하기
			if (c[i] < 'S') t += (c[i] - 56) / 3; // PQRS는 4개이므로 S이전까지
			else if (c[i] <= 'Z') t += (c[i] - 57) / 3; // S부터는 나눠지는 값을 다르게
			if (c[i] == 'Z') t--; // 'Z'는 10이어야 하는데 위의 결과가 11이 나오기 때문에 - 1
		}
		System.out.println(t);
		br.close();
	}
}
