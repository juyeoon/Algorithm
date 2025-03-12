import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 세 변의 길이를 입력 받은 후 오름차순으로 정렬 후 길이 비교
public class B8723_Patyki {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		int num[] = new int[3]; // 세 변의 길이
		for (int i = 0; i < 3; i++) { // input num[]
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num); // 오름차순 정렬
		if (num[0] == num[1] && num[1] == num[2]) { // 정삼각형만
			System.out.println(2);
		} else if (num[0] * num[0] + num[1] * num[1] == num[2] * num[2]) { // 직각삼각형만
			System.out.println(1);
		} else { // 둘 다 못 만듦
			System.out.println(0);
		}
		br.close();
	}
}