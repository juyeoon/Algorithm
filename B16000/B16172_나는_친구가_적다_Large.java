import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// replaceAll(정규식)으로 숫자를 지운 후 KMP 알고리즘으로 문자열 찾기
public class B16172_나는_친구가_적다_Large {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine().replaceAll("[0-9]", ""); // 숫자를 지운 원문
		String K = br.readLine(); // 찾고자 하는 키워드

		// KMP 테이블 만들기
		int leng = S.length();
		int pi[] = new int[leng]; // 접두사이면서 접미사인 최대 문자열의 길이 저장
		int j = 0; // 확인할 인덱스 1
		for (int i = 1; i < leng; i++) { // 확인할 인덱스 2 (원문을 순차적으로)
			while (j > 0 && S.charAt(i) != S.charAt(j)) { // 같지 않을 때
				j = pi[j - 1];
			}
			if (S.charAt(i) == S.charAt(j)) { // 같을 떄
				pi[i] = ++j;
			}
		}

		// KMP
		int kIdx = 0; // 키워드 인덱스
		boolean search = false; // true: 문자열 존재
		for (int i = 0; i < leng; i++) { // 원문 인덱스
			if (S.charAt(i) == K.charAt(kIdx)) { // 문자가 같으면
				if (kIdx == K.length() - 1) { // 현재 키워드 인덱스가 길이와 같으면 찾기 완료
					search = true;
					break;
				}
				kIdx++; // 키워드 인덱스 ++
			} else if (kIdx != 0) { // 문자가 같지 않음
				kIdx = pi[kIdx - 1] + 1; // 키워드 인덱스 이동(중복 문자 스킵)
			}
		}
		System.out.println(search ? 1 : 0); // 출력
		br.close();
	}
}