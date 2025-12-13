// https://www.acmicpc.net/problem/16972
// 가능한 범위(정사각형)를 최대한의 크기로 주어진 개수의 좌표가 다 들어갈 수 있게 나눔
// 좌표는 정수이므로 범위 안의 좌표 간격과 좌표 사이의 거리를 정수로 구함
// 첫번째 좌표를 x나 y좌표를 1만큼 이동(가장 가까운 두 점을 하나만 만들기 위해)
// 그 다음 좌표들은 일정한 거리를 유지하게 설정
public class B16972_814_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int minCoo = -8140; // 좌표 최솟값
		int maxCoo = 8140; // 좌표 최댓값
		int n = 814; // 출력값 개수
		int sections = (int) Math.sqrt(n); // 범위 안의 좌표 간격
		int distance = (int) (maxCoo - minCoo) / sections; // 좌표 사이의 거리
		int cnt = 1; // 현재 출력 개수
		Loop: for (int x = minCoo; x <= maxCoo; x += distance) { // x좌표
			for (int y = minCoo; y <= maxCoo; y += distance) { // y좌표
				if (cnt > 1) { // 첫번째 좌표만 거리가 1 더 작게 출력
					sb.append(x).append(" ").append(y).append("\n");
				} else { // 첫번째 좌표만 거리가 1 더 작게 출력 (가장 작은 두 점이 여러 개면 안됨)
					sb.append(x).append(" ").append(y + 1).append("\n");
				}
				if (cnt++ >= n) { // 출력 개수에 도달하면 break
					break Loop;
				}
			}
		}
		System.out.println(sb); // 출력
	}

}
