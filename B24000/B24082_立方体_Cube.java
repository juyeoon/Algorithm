import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한 번의 길이가 주어졌을 때 정육면체 부피 구하기
public class B24082_立方体_Cube {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()); // 한 변의 길이 
		System.out.println(x * x * x); // 정육면체의 부피
		br.close();
	}
}
