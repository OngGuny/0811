
public class AnonymousClassDemo {
public static void main(String[] args) {
// 상속받고싶지는 않은데, 저 display를 재정의하고싶어. anonymous 출격
//Demo라는 클래스를 
	Demo d = new Demo() { //익명객체
		@Override
		public void display() {
			System.out.println("I'm overrided Method");
		}
		public void print() {
			System.out.println("I'm new method");
		}
		
	}; // 세미콜론 주의. anonymous는 명령어..? 
	 d.display();
	 d.print(); //없다. 오리진이 정의되어 있어야 재정의가 가능하다. 재정의하는 클래스의 멤버가 아닌메소드이기때문에 
}
}
class Demo{
	public void display() {
		System.out.println("I'm origin Method");
	}
}