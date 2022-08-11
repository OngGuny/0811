/**
 * <h1>Final 용법 3가지</h1>
 * 
 * <ul>
	<li><b>Final Variable</b>:자바의 상수</li>
	<li><b>Final Method</b>:Override 금지</li>
	<li><b>Final Class</b>:상속의 금지</li>

 * </ul>
 * 
 * @author User
 * @version 1.1
 * @since 2022-08-11
 * 
 */
public class FinalDemo extends Parent {//<3>부모가 추상클래스가 되면서 강제 재정의 해야함
	private final double PI=Math.PI; //member variable
	private static final boolean FLAG = true; // static constant
	
	
	
	
	public static void main(String[] args) {
	final String NAME ="박지 민"; // Local Constant
//	NAME = "한 지민"; 오류 
	
}


//	public final void display() { //부모 클래스에서 메소드 재정의 못하게 final 박아서 오류뜸 
//		System.out.println("I'm Son method");/
//	}
	
	// <4>부모 클래스가 추상메소드가되면서 강제 override 해야함 
	@Override
	public void print() {
		System.out.println("I'm Son method");
	}
}
final class Parent {//class에 final 걸어버리면 안에껀 전부 final method, field됨 
	public void display() {System.out.println("I'm parent Method.");}
}



// 
//abstract class Super{//<2> 추상 메소드때문에 추상클래스가됨
//	public final void display() {System.out.println("I'm parent Method.");}
//	public abstract void print() ;//{System.out.println("I'm parents Method");} <1>추상메소드로 만들어버림 
//}