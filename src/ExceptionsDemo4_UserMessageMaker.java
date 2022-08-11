import java.util.Scanner;

public class ExceptionsDemo4_UserMessageMaker {
	public static void main(String[] args) {
		// 어디서 오류떳는지 다 알려주지말고, 그냥 잘못입력했다고 메세지만 보여주면된다.
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 :");
		int kor = sc.nextInt();
		System.out.println("수학 점수 :");
		int mat = sc.nextInt();
		
		try {
			Student chul = new Student(kor, mat);
			System.out.println(chul);
		} catch (Korean_ExceotionDemo4_MessageModify e) {
			System.out.println(e.getMessage());
		} catch (MethException e) {
			System.out.println(e.getMessage());

		}
//멀티 캐치 만들수있다. 
		
		
//	try {
//		Student chul = new Student(kor,mat);
//		System.out.println(chul);
//	}catch(Korean_ExceotionDemo4_MessageModify ex) {
//		System.out.println(ex.getMessage());
//	}
	}
}

class Student {
	private int kor, math;

	public Student(int kor, int mat) throws Korean_ExceotionDemo4_MessageModify,MethException{
		if (kor >= 0 && kor <= 100)
			this.kor = kor;
		else
			throw new Korean_ExceotionDemo4_MessageModify("국어 점수는 0부터 100점이지좀");
		if (mat >= 0 && mat <= 100)
			this.math = mat;
		else
			throw new MethException("수학 점수는 0부터 100점이지좀");
		this.kor=kor;
		this.math=mat;

	}

// 에러 메세지 변경하는것 
//	public Student(int kor)throws Korean_ExceotionDemo4_MessageModify { //exception 을 내가 던지려면 throw 쓰는거  보통 메소드는 줄여져있다. 그걸 알려주기위해 throws 붙여주는것 
//		if(kor>=0 && kor<=100)this.kor=kor;
//		else throw new Korean_ExceotionDemo4_MessageModify("국어 점수는 0부터 100점이지좀");
//	}
//	
	@Override
	public String toString() {
		return String.format("Student [kor=%s, math=%s]", kor, math);
	}

}