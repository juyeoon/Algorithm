import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쥐가 색깔별로 각각 a,b,c,d마리가 있고 하나씩 꺼내서 확인할 때 최악의 경우 최소 몇 번을 꺼내야 모든 색의 쥐가 있다는 것을 확인할 수 있는지 횟수를 물어보는 문제
// 최악의 경우는 a,b,c,d 중 최소값(min)을 가지는 색상의 쥐가 마지막까지 한마리도 뽑히지 않은 경우
// => 총 쥐의 마리 수 - 최솟값을 가지는 색상의 쥐의 수(min) + 1
// (여기서 +1을 하는 이유는 세 가지 색의 쥐를 모두 꺼낸 후 나머지 색의 쥐를 한마리를 꺼내야 모든 색을 확인할 수 있기 때문)
public class B31280_ФАКИР {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int sum = 0; // 총 쥐의 수
		int min = Integer.MAX_VALUE; // 최솟값을 가지는 색상의 쥐의 수
		for (int i = 0; i < s.length; i++) { // 합과 최솟값 구하기
			int num = Integer.parseInt(s[i]);
			min = Math.min(min, num); // 최솟값 구하기
			sum += num; // 합 구하기
		}
		System.out.println(sum - min + 1); // 출력
		br.close();
	}
}