import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsDemo1 {
public static void main(String[] args) throws FileNotFoundException{ // 예외처리 2번째 방법. 더 끼워넣을곳이 괄호다음 중괄호 전 사이밖에없다.  권장하는건 trycatch  왜? 오류메세지를 지정할수없다 
//	File file = new File("C:/temp/sungjuk_utf81.dat");
//	Scanner sc = new Scanner(file,"utf-8");
	System.out.println("숫자형 글자를 입력하세요");
	Scanner sc = new Scanner(System.in);
	String num = sc.nextLine();
	int su = Integer.parseInt(num);
	System.out.printf("su = %d\n",su);
}
} 
/*Scanner
public Scanner​(File source)
        throws FileNotFoundException  // 오류뜨면 이렇게 던진다는것 
Constructs a new Scanner that produces values scanned from the specified file. Bytes from the file are converted into characters using the underlying platform's default charset.
Parameters:
source - A file to be scanned
Throws:
FileNotFoundException - if source is not found
 * 
 * parseInt
public static int parseInt​(String s) throws NumberFormatException
									//1) 이젠 여기도 봐야한다. 2) 이건 checked 인지 unchecked 인지 
 * Class NumberFormatException   parseint 쓸 때 try catch 안쓴 이유가 부모클래스중에 runtime exception 이 있었기ㄸ문에
java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException ------------------------------
java.lang.IllegalArgumentException
java.lang.NumberFormatException
 */

//	// 예외처리 하기 가장쉬운게 트라이 캐치
//	// 캐치는 여러개 쓸수 있고 위에께 자식 아래로 갈수록 부모예외를 입력해줘야함 
//	try {
//		Scanner sc = new Scanner(file,"utf-8");
//	}catch (FileNotFoundException e) {
//		System.out.println("File Not Found");
//}