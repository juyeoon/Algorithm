import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이전 값을 저장하고 현재 값과 같으면 중복(연타), 아니면 중복이 아님(연타 아님)
// 중복이 아닐 때 이전 값을 현재 값으로 갱신하고 현재 값 출력
public class B4592_중복을_없애자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        	StringTokenizer st = null;
        	String s = "";
        	while(!(s = br.readLine()).equals("0")){ //  EOI
            		st = new StringTokenizer(s);
            		int N = Integer.parseInt(st.nextToken()); // 입력 개수
            		int num = Integer.parseInt(st.nextToken()); // 중복 검사할 수
            		sb.append(num).append(" "); // 첫 번째 수 출력 저장
            		for (int i = 1; i < N; i++) {
                		int now = Integer.parseInt(st.nextToken()); // 현재 수
                		if(now != num){ // 연속된 중복 수가 아니면
                    			num = now;  // 중복 검사할 수를 갱신
                    			sb.append(num).append(" "); // 출력 저장
                		}
            		}
            		sb.append("$\n"); // 출력 형식 맞추기
        	}
		System.out.println(sb); // 출력
		br.close(); 
	}
}