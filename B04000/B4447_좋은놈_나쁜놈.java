import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열의 문자를 소문자로 변경한 후 문자열을 순회하면서 'g'와 'b'를 카운트한 후 비교하여 출력
public class B4447_좋은놈_나쁜놈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 테스트케이스
        	for (int i = 0; i < N; i++) {
            		String s = br.readLine();
            		sb.append(s).append(" is "); // 출력 형식 맞추기
            		s = s.toLowerCase(); // 문자를 모두 소문자로 변경
            		int gCnt = 0; // 'g'의 개수
            		int bCnt = 0; // 'b'의 개수
            		int leng = s.length(); // 문자열 길이(반복문 종료 조건)
            		for (int j = 0; j < leng; j++) {
                		char c = s.charAt(j); // 문자열의 문자
                		if(c == 'b'){ // 'b' 카운트
                    			bCnt++;
                		}else if(c == 'g'){ // 'g' 카운트
                    			gCnt++;
                		}
            		} 
            		if(bCnt > gCnt){ // 'b'가 더 많으면
                		sb.append("A BADDY");
            		}else if(bCnt < gCnt){ // 'g'가 더 많으면
                		sb.append("GOOD");
            		}else{ // 개수가 같으면
                		sb.append("NEUTRAL");
            		}
            		sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}