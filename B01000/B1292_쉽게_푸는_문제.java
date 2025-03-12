import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A부터 B까지의 합 = 1부터 B까지의 합 - 1부터 A-1까지의 합
// 1부터 N까지의 합 = N의 항의 값(cntN)을 구한 후 1부터 cntN-1의 제곱 합(1+2^2+3^2+...+(cntN-1^2))을 구한 후 (cntN * cntN의 횟수)를 더함
// cntN의 횟수 = cntN - (1부터 cntN의 제곱의 합(sumN) - N)
public class B1292_쉽게_푸는_문제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]) - 1; // 빠질 앞 부분의 마지막 항 (A-1)
		int B = Integer.parseInt(s[1]); // B
		int cntA = 0; // A항의 값
		int sumA = 0; // 1부터 cntA의 제곱의 합
		int ansA = 0; // 1부터 A까지의 합
		// cntA, sumA 구하기
		do {
			cntA++;
			sumA += cntA;
		} while (sumA <= A);
		// ansA 구하기
		ansA += (--cntA) * (cntA + 1) * (2 * cntA + 1) / 6; // 1부터 cntA-1의 제곱 합
		ansA += (++cntA - sumA + A) * cntA; // cntA * cntA의 횟수
		// A와 구하는 방법이 같음
		int cntB = 0;
		int sumB = 0;
		int ansB = 0;
		do {
			cntB++;
			sumB += cntB;
		} while (sumB <= B);
		ansB += (--cntB) * (cntB + 1) * (2 * cntB + 1) / 6;
		ansB += (++cntB - sumB + B) * cntB;
		System.out.println(ansB - ansA); // 1부터 B까지의 합 - 1부터 A-1까지의 합 출력
		br.close();
	}
}