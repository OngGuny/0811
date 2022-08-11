import java.util.Stack;

//Interface List<E> 검색용api
// 옛날에는 자식클래스 중에 vector많이썻는데 요즘은 arraylist 쓴다.  stack이 vector의 자식이니까 둘중하나만 배우면된다  그리고 arraylist와 차이점 배우기 
/* Stack : LIFO  후입선출법
 * 
 * 
 */

public class ListDemo {
	//얘는 중복허용
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//리스트 입장 : 여러명일수도있지~ 
		String [] array = {"박지민","박지민","이지민","홍지민","이지민","한지민"};
		//add 말고 push 하고 뺄때 pop 
		for(String str : array) {
			stack.push(str); // 쌓는다는 표현답게 긴 통에 하나씩 넣고 맨 위에서부터 빼낸다. 왼쪽에서 먼저넣고 오른쪽이 가장마지막. pop으로 뺴내면 가장 마지막에 들어간애를 뽑는다. 이는 포인터가 가리키는애가 가장 마지막에있기 때문이다. 정확히는 포인터가 가르키는자료를 뽑아오는것. 
		}
		System.out.println(stack.search("박지민"));// 오른쪽, 윗쪽에서부터 찾음 
		System.out.println(stack.search("김지민")); // 없는값
		
		
		System.out.println(stack.size());
		System.out.println(stack.pop()); //pop은 포인터가 움직이지 않는다. 
		System.out.println(stack.size());
		System.out.println(stack.pop()); //pop은 포인터가 움직이지 않는다. 
		System.out.println(stack.size());
		System.out.println(stack.pop()); //pop은 포인터가 움직이지 않는다. 
		// 하나씩 뺴서 수가 줄어들면서 데이터도 변함 
		//전부다 뺴면 null이 대신 받음  이거 알려주기위해 boolean empty 있다.
		
		// peek도 있다.  
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		// 얘는 포인터 안변하고 빼지도 않는다. 현재 누구인가 알아내는것.  다
		
		
		 // vector 메모리를 효율적으로 사용함 
		// Vector​(int initialCapacity, int capacityIncrement)얘를 가장 많이씀
					// 처음 방 갯수 		방이상으로 자료 들어올때 증가시키는 방 갯수  1,1 하면 가장 효율적으로 사용함 
//					5,3 은 6개쨰들어올때 3개늘려서 방 8개됨 
	}	
	
	
}
