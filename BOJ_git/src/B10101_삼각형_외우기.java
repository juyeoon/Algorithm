import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 경우에 따라 조건 나누기
public class B10101_삼각형_외우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] angle = new int[3]; // 세 각도
        int sum = 0; // 각도의 합
        for (int i = 0; i < 3; i++){ // input angle[], sum 계산
            angle[i] = Integer.parseInt(br.readLine());
            sum += angle[i];
        }
        if(sum!=180){ // 세 각의 합이 180이 아니면
            System.out.println("Error");
        }else{ // 세 각의 합이 180이면 
            Arrays.sort(angle); // 크기순으로 정렬
            if(angle[0]==angle[2]){ // 제일 작은 각과 제일 큰 각이 같으면 세 각 모두 60
                System.out.println("Equilateral");
            }else if(angle[0]==angle[1]||angle[1]==angle[2]){ // 두 각만 같으면
                System.out.println("Isosceles");
            }else{ // 세 각 모두 다르면
                System.out.println("Scalene");
            }
        }
        br.close();

    }
}
