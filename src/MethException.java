/*
 * // 체크드지만 에러의 자식은 되면 안된다 .

 *
 *
 *Checked Exception 
 *1)반드시 try~catch
 *2)메소드 선언부에 throws MathException 
 * 
 */
public class MethException extends Exception {
public MethException (String msg) {
	super(msg);
}
}
