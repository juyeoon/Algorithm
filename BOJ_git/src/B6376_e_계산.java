// 반복문으로 factorial 값 과 합(e)값 계산
public class B6376_e_계산 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("n e\n").append("- -----------\n"); // 출력 형식 맞추기
		int fac = 1; // 팩토리얼 값
		double sum = 1; // e 값
		sb.append(0).append(" ").append((int) sum).append("\n"); // n==0일 때 값 저장(factorial 계산 때문에)
		for (int n = 1; n < 10; n++) { // n==1부터 n==9까지
			sb.append(n).append(" "); // 출력 형식 맞추기
			fac *= n; // 팩토리얼 값 갱신
			sum += 1.0 / fac; // e 값 갱신(이전 값에 1/n! 더하기)
			if (n > 2) { // n==3부터 소숫점 9자리까지 출력
				sb.append(String.format("%.9f", sum)).append("\n");
			} else if (n == 1) { // n==1일 때 정수 출력
				sb.append((int) sum).append("\n");
			} else if (n == 2) { // n==2일 때 소숫점 1자리까지 출력
				sb.append(String.format("%.1f", sum)).append("\n");
			}
		}
		System.out.println(sb); // 출력
	}
}
