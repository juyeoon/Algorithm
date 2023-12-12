import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if-else문으로 입력값의 범위에 따른 문자열 출력
public class B30676_이_별은_무슨_색일까 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lambda = Integer.parseInt(br.readLine()); // 별빛의 파장
		if (620 <= lambda && lambda <= 780) { // 빨간색
			System.out.println("Red");
		}else if(590 <= lambda && lambda < 620) { // 주황색
			System.out.println("Orange");
		}else if(570 <= lambda && lambda < 590) { // 노란색
			System.out.println("Yellow");
		}else if(495 <= lambda && lambda < 570) { // 초록색
			System.out.println("Green");
		}else if(450 <= lambda && lambda < 495) { // 파란색
			System.out.println("Blue");
		}else if(425 <= lambda && lambda < 450) { // 남색
			System.out.println("Indigo");
		}else if(380 <= lambda && lambda < 425) { // 보라색
			System.out.println("Violet");
		}
		br.close();
	}
}