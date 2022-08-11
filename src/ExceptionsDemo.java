import java.util.Scanner;

// 어소션은 안하고 익셉션만한대 
public class ExceptionsDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("First Number : ");
	int first = sc.nextInt();
	System.out.print("Second Number : ");
	int second = sc.nextInt();
	try {
		System.out.printf("%d/%d=%d\n",first,second,first/second);
		
		
		//아래 오류들의 부모 : runtimeExcetpion array 가보면 있다. 
	}catch(NullPointerException ex) {
		System.out.println("Null pointerException"); // 던져진 익셉션과 받는 익셉샨이 같아얄함 
	}catch(ArrayStoreException ex) {
		System.out.println("ArrayIndexOutOfBoundException"); // 던져진 익셉션과 받는 익셉샨이 같아얄함 
	}catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("ArrayIndexOutOfBoundsException"); // 던져진 익셉션과 받는 익셉샨이 같아얄함 
}catch(RuntimeException ex)
	{
		System.out.println("Exception 의 부모"); // 던져진 익셉션과 받는 익셉샨이 같아얄함

	/*Multiple Catch Block : 여러개의 Exception Type을 열거하는 방법;
	 * - 주의할 점 : 위아래 순서가 있다 위 
	 * */	
		
		
	}
}
}
		
		
//	System.out.printf("%d/%d=%d\n",first,second,first/second);
	// 개발자가 짜 놓은 시나리오에서 벗어난 걸 exceptions 라고함. 나누는 숫자로 0을 넣었을떄. 오류 이 상황을 어떻게 처리할것인가.
		// 오류뜨게 두지 않고 어떻게 알려줄것인가
/*
	 * /개발자가 예외처리 해 놓은 걸 exception // 저 예외를 프로그래밍 할 수 있으면 exception(=mild) 이고 //
	 * 프로그래밍으로 못하는걸 error 라고하는것 // main조차 처리하지못한오류라서 이렇게 뜨는8것. 계속 상위 예외처리자로 던져서
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero /at
	 * ExceptionsDemo.main(ExceptionsDemo.java:11) 11번째 라인에서 익셉션이 발생
	 */