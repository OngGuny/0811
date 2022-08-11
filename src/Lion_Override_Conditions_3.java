/*/
 * Override 조건 3가지 
 * 
 * 1. 이름, 리턴타입, 괄호가 같아야 한다); //자식들에게 강제로 재정의 하게 하기위해서 
 * 2. 메소드의 접근 제한자는 부모 와 같거나 보다 더 넓어야 한다.
 * 3. 자식의 Exception 은 부모의 exception 보다 더 적어야 ,좁아야 한다. 
 * 
 *   
 *   
 */
 
public class Lion_Override_Conditions_3 extends Mammal {

	@Override
	public void saySometing() throws RuntimeException/*throws Exception*/{ // 부모가 안던지는데 자식이 던지면 에러, 반대의 경우는 아님 던진다면 부모와 같거나 더 좁은 범위의 예외만 던질 수 있따.  
		// TODO Auto-generated method stub

	}

}
