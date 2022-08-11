import java.util.Random;

public class RandomDemo {
public static void main(String[] args) {
	//1 ~6 의 랜덤넘버 뽑기 
	//구식
	int rad = (int)(Math.random()*6+1);
	//다른 방식
	Random r = new Random();
	int rand = r.nextInt(6)+1
			;  // seed를 주면 컴퓨터는 범위안의 값들이 정해져있는것  거기서 무작위로 뽑아내는것 
	System.out.println(rand + ","+rad);
}
}
