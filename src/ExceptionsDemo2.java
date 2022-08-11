
public class ExceptionsDemo2 {
	public static void main(String[] args) {
		a();
	}

	static void a() {
		try {
			b();
		} catch (ArithmeticException ex) {
			System.out.println("자꾸 0 으로 나누지마라");
		}
	}

	static void b() {
		c();
	}

	static void c() {
		d();
	}

	static void d() {
		System.out.println(5 / 0);
	}

}
/*
 * 오류를 던지면 어디로 가는지 뜨는 오류들은 스택 에서 일어난다. 이렇게 표시된걸 스택 트레이스 라고함 main도 못하면 virtual
 * 머신에게 보낸다 오류 안뜨게하려면 virtual 머신에게만 안보내면된다
 * 올라가는건 막을 수 있다 .
 */
