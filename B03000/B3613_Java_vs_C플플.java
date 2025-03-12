import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 예외(Error!)
// 1. 첫 문자가 대문자거나, '_'인 경우
// 2. 마지막 문자가 '_'인 경우 
// 3. '_' 뒤에 소문자가 아닌 경우
// 4. Java 문자열인데 대문자가 나오는 경우
// 5. C++ 문자열인데 _가 나오는 경우

public class B3613_Java_vs_C플플 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char name[] = br.readLine().toCharArray(); // 변수명
		byte type = 0; // 0: 둘 다 맞음(소문자만), 1: java, 2: C++, 3: 둘 다 아님
		if (!(name[0] >= 97 && name[0] <= 122)) { // 1. 첫 문자가 대문자거나, '_'인 경우
			type = 3;
		} else { // 첫 문자가 소문자일 때
			sb.append(name[0]); // 첫 문자 추가
			for (int i = 1; i < name.length; i++) {
				if (name[i] <= 90) { // 대문자(Java) => C++
					if (type == 2) { // 5. C++ 문자열인데 _가 나오는 경우
						type = 3;
						break;
					} else {
						type = 1; // 자바 문자열 체크
						sb.append("_").append((char) (name[i] + 32)); // 대문자 -> _소문자
					}
				} else if (name[i] == '_') { // '_'(C++) => Java
					// 4. Java 문자열인데 대문자가 나오는 경우
					// 3. '_' 뒤에 소문자가 아닌 경우
					if (type == 1 || (i + 1 < name.length && name[i + 1] <= 96)) {
						type = 3;
						break;
					} else {
						type = 2; // C++ 문자열 체크
						if (++i >= name.length) { // 2. 마지막 문자가 '_'인 경우
							type = 3;
							break;
						}
						sb.append((char) (name[i] - 32)); // _소문자 -> 대문자
					}
				} else { // 그 외(소문자)
					sb.append(name[i]);
				}
			}
		}
		System.out.println(type != 3 ? sb : "Error!"); // type이 3이 아니면 변형된 문자열 출력 // 3이면 Error! 출력
		br.close();
	}
}
