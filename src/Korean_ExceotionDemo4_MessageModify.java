// exception 떳을때 메세지 어떻게 줄껀지도 만들어보자 
// 부모클래스도 중요 
//별로 안중요한 정보는 runtimeException 으로.  trycatch안하는거 

/* 사용자 정의형 Exception
 * 1. 누구의 자식인가? Runtime? or else?  
 * 2. message는 생성자를 통해서 만들어야함 
 * 
 * 
 * Korean 
 * 
 * 
 * 얘는 트캐 안쓰니까 언체크드 
 */

public class Korean_ExceotionDemo4_MessageModify extends RuntimeException{
	 public Korean_ExceotionDemo4_MessageModify(String msg) {
	super(msg);
	 }
}
