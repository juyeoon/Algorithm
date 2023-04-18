import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조건에 따라 다르게 출력하는 문제
public class B20839_Betygsättning {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // A 기준 점수
		int y = Integer.parseInt(st.nextToken()); // C 기준 점수
		int z = Integer.parseInt(st.nextToken()); // E 기준 점수
		int stu[] = new int[3]; // 학생 점수
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) { // input stu[]
			stu[i] = Integer.parseInt(st.nextToken());
		}
		if (stu[0] >= x && stu[1] >= y && stu[2] >= z) { // A 조건
			System.out.println('A');
		} else if (stu[0] >= (x + 1) / 2 && stu[1] >= y && stu[2] >= z) { // B 조건
			System.out.println('B');
		} else if (stu[1] >= y && stu[2] >= z) { // C 조건
			System.out.println('C');
		} else if (stu[1] >= (y + 1) / 2 && stu[2] >= (z + 1) / 2) { // D 조건
			System.out.println('D');
		} else { // 그 외에는 E
			System.out.println('E');
		}
		br.close();
	}
}