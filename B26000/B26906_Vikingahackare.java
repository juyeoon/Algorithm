import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/26906
// 길이 4의 이진 문자열과 문자 매핑을 해시맵에 저장
// 주어진 전체 이진 문자열을 4비트씩 자르며 매핑 조회
// 맵에 없으면 "?" 출력
public class B26906_Vikingahackare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 알파벳에 포함된 문자 개수
        Map<String, Character> map = new HashMap<>(); // 4비트 code와 문자 매핑
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0); // 문자
            String code = st.nextToken(); // 4비트 code
            map.put(code, ch); 
        }
        String bin = br.readLine(); // 번역할 이진 문자열
        for (int i = 0; i < bin.length(); i += 4) {
            String chunk = bin.substring(i, i + 4); // 4비트 단위로 잘라낸 부분 문자열
            sb.append(map.getOrDefault(chunk, '?'));
        }
        System.out.println(sb); // 출력
        br.close();
    }
}
