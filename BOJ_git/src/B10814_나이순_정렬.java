import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 사용자 정의 class에 compareTo()를 override하고 Arrays.sort() 사용
public class B10814_나이순_정렬 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 사람 수
		Member m[] = new Member[N]; // Member 배열
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			m[i] = new Member(Integer.parseInt(s[0]), s[1]);
		} // input
		Arrays.sort(m); // 정렬
		// 출력
		for (Member mem : m) {
			sb.append(mem.age).append(" ").append(mem.name).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

class Member implements Comparable {
	int age; // 나이
	String name; // 이름

	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) { // 비교
		Member m = (Member) o;
		if (this.age > m.age) {
			return 1;
		} else if (this.age == m.age) { // 들어온 순서로 정렬됨
			return 0;
		} else {
			return -1;
		}
	}
}
