// throwable  에러와 예외의 부모 
public class ExceptionsDemo3_Throwable {
public static void main(String[] args) {
	Test t = new Test(); t.display();
	t = null; // 관계를 끊어서 주소를 끊어버림 
	//t.display(); //주소가 없어져서 못찾아가는것  java.lang.NullPointerException 오류는 자주만날것 
	try {
		t.display();
	}catch(NullPointerException ex) {// 여기서 ex는 안쪽에서 던져진 예외의 주소 
		System.out.println(ex.getMessage()); // throwable 클래스가 가진 메세지를 좀 보자. 어떤메세지를 갖고가니 
		System.out.println(ex); //ex.toString 생략되있음 그래서 이걸한건 어떤 타입이니? 물으려고한거 
		ex.printStackTrace(); // 몇라인에서 발생한거니? 
	}
}
}
class Test {
	public void display() {
		System.out.println("Hello, World");
	}
}


/*Module java.base
	Package java.lang

Class Throwable
java.lang.Object
java.lang.Throwable

All Implemented Interfaces:
Serializable

Direct Known Subclasses:
Error, Exception
 * 
 */
