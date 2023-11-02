import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Max가 본 영상의 총 길이와 Mel이 본 영상의 총 길이를 비교
public class B28927_Киноманы {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Max[] = br.readLine().split(" ");
		String Mel[] = br.readLine().split(" ");
		int MaxSum = Integer.parseInt(Max[0]) * 3 + Integer.parseInt(Max[1]) * 20 + Integer.parseInt(Max[2]) * 120; // Max가 본 영상의 총 길이(분)
		int MelSum = Integer.parseInt(Mel[0]) * 3 + Integer.parseInt(Mel[1]) * 20 + Integer.parseInt(Mel[2]) * 120; // Mel가	본 영상의 총 길이(분)
		if (MaxSum > MelSum) { // Max가 더 많이 본 경우
			System.out.println("Max");
		} else if (MaxSum < MelSum) { // Mel이 더 많이 본 경우
			System.out.println("Mel");
		} else { // 같은 경우
			System.out.println("Draw");
		}
		br.close();
	}
}