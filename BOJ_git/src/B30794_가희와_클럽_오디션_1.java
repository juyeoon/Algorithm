import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case로 판정에 따른 점수 출력
public class B30794_가희와_클럽_오디션_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int lv = Integer.parseInt(s[0]); // 키노트 레벨
		switch (s[1]) { // 판정에 따른 점수 출력
		case "miss":
			System.out.println(0);
			break;
		case "bad":
			System.out.println(200 * lv);
			break;
		case "cool":
			System.out.println(400 * lv);
			break;
		case "great":
			System.out.println(600 * lv);
			break;
		case "perfect":
			System.out.println(1000 * lv);
		}
		br.close();
	}
}