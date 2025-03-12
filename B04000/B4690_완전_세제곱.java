// 브루트포스 알고리즘을 사용
// b<=c<=d<=이므로 c와 d의 반복은 상위의 반복 변수부터 시작
public class B4690_완전_세제곱 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int a = 2; a <= 100; a++) { // a
			for (int b = 2; b <= 100; b++) { // b
				for (int c = b; c <= 100; c++) { // c
					for (int d = c; d <= 100; d++) { // d
						if (a * a * a == b * b * b + c * c * c + d * d * d) { // 조건을 만족하면
							sb.append("Cube = ").append(a).append(", Triple = (").append(b).append(",").append(c)
									.append(",").append(d).append(")\n");
						}
					}
				}
			}
		}
		System.out.println(sb); // 출력
	}
}
