import java.util.Scanner;

//나누기와 나머지 이용
public class B14652_나는_행복합니다 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int M = sc.nextInt(); // 관중석 세로 길이
		int K = sc.nextInt(); // 잃어버린 관중석 번호
		System.out.println(K / M + " " + (K % M)); // (K / M): 좌표 n, (K % M): 좌표 m => (n,m)
	}
}
