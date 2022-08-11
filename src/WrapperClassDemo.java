
public class WrapperClassDemo {
public static void main(String[] args) {
	// 아래는 JDK1.4까지고
//	int age= 26; //stack
//	Integer in = new Integer(age); //boxing, wrapping
//	//stack에있던 26을 wrap에 싸서 Integer로써 heap에 올리고 그걸 stack in 에서 포장 푸는거 
//	int su = in.intValue(); // unboxing unwrapping 
//	System.out.println("su = "+su );

	//여기서부턴 JDK1.5 부터 컴파일러가 자동으로 포장해주고 자동으로 언박싱 해줌 
	Integer in = 26+5; // 얘는 주소 변수인데 26을저장했다. 무슨주소.??  26번지?아니다.    이말과같다 .  || Integer in = new Integer(26+5); ||; autoboxing 이렇게 해준다. 
		// 26+5를 heap에 저장하고 메모리 in 주소에 저장하라는것. 
	int su = in+100; // in.intValue() +100 ; 
	System.out.println("su = "+su);
 	
}
}
