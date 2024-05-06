import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 날이 10월 21일의 35일 전인 9월 16일 이전인지 이후인지 판별하는 문제
// 달이 9보다 크면 이후
// 달이 9이고 일이 16보다 크면 이후
// 그 이외는 이전
public class B30319_Advance_to_Taoyuan_Regional {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split("-");
		int month = Integer.parseInt(s[1]); // 달
		int day = Integer.parseInt(s[2]); // 일
		boolean good = true; // 이전인지 이후인지 저장(true: 이전)
		if (month > 9) { // 달이 9보다 크면 이후
			good = false;
		} else if (month == 9 && day > 16) { // 달이 9이고 일이 16보다 크면 이후
			good = false;
		}
		System.out.println(good ? "GOOD" : "TOO LATE"); // 출력
		br.close();
	}
}