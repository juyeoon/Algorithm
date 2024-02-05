import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 슬라이딩 윈도우로 처음으로 만들 수 있는 부분문자열(0부터 P-1까지 문자)의 A,C,G,T의 개수를 구한 후 비밀번호로 가능하면 카운트(출력값)에 추가
// 그 이후 부분문자열은 이전 부분문자열의 맨 앞의 문자(나갈 값)를 제외하고 이전 부분문자열의 마지막 값 다음 값(들어올 값)을 추가
// 나갈 값에 해당하는 문자의 개수를 하나 빼고 들어올 값에 해당하는 문자의 개수를 하나 더하여 다시 비밀번호로 가능한지 확인 => 현재 문자열의 마지막 값이 입력 문자열의 마지막값이 되면 반복 끝
// 카운트 값 출력
public class B12891_DNA_비밀번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
		int P = Integer.parseInt(st.nextToken()); // 비밀번호로 사용할 부분문자열의 길이
		String DNA = br.readLine(); // DNA 문자열
		st = new StringTokenizer(br.readLine());
		int minNum[] = new int[4]; // 부분문자열에 포함되어야 할 {‘A’,‘C’,‘G’,‘T’} 의 최소 개수
		for (int i = 0; i < 4; i++) { // minNum[] 채우기
			minNum[i] = Integer.parseInt(st.nextToken());
		}
		int nowNum[] = new int[4]; // 현재 부분문자열에 포함되어 있는  ACGT의 수
		for (int i = 0; i < P; i++) { // 0부터 P-1까지 문자에 ACGT의 개수(맨 앞 부분문자열)
			if (DNA.charAt(i) == 'A') {
				nowNum[0]++;
			} else if (DNA.charAt(i) == 'C') {
				nowNum[1]++;
			} else if (DNA.charAt(i) == 'G') {
				nowNum[2]++;
			} else {
				nowNum[3]++;
			}
		}
		int cnt = 0; // 민호가 만들 수 있는 비민번호의 종류의 수
		if (nowNum[0] >= minNum[0] && nowNum[1] >= minNum[1] && nowNum[2] >= minNum[2] && nowNum[3] >= minNum[3]) {
			cnt++; // 처음 부분문자열에 대한 가능 여부 확인 
		}
		for (int i = P; i < S; i++) { // 맨 앞 부분문자열을 제외한 가능한 부분문자열에 대한 확인 (슬라이딩 윈도우)
			char out = DNA.charAt(i - P); // 뺄 값(맨 앞의 값, 나가는 값)
			if (out == 'A') {
				nowNum[0]--;
			} else if (out == 'C') {
				nowNum[1]--;
			} else if (out == 'G') {
				nowNum[2]--;
			} else {
				nowNum[3]--;
			}
			char in = DNA.charAt(i); // 추가할 값(맨 뒤의 값, 들어오는 값)
			if (in == 'A') {
				nowNum[0]++;
			} else if (in == 'C') {
				nowNum[1]++;
			} else if (in == 'G') {
				nowNum[2]++;
			} else {
				nowNum[3]++;
			}
			if (nowNum[0] >= minNum[0] && nowNum[1] >= minNum[1] && nowNum[2] >= minNum[2] && nowNum[3] >= minNum[3]) {
				cnt++; // 새로 생성된 부분문자열에 대한 가능 여부 확인 
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}