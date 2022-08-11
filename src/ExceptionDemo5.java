import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 1.close()는 반드시 파일을 열거나 DB를 열었을 떄 처리해야한다
 * 2.그러기 위해서 finally를 블록에 close()를 사용한다
 * 3. 하지만 ,finally블록이 너무 코드가 길어지기 때문에
 * 4. autocloseable 인터페이스의 자식들은 finally안에 close()를 할 필요가 없기 때문에
 * finally block은 사용하지 안아도된다.
 * 5. 이때 try block 이 모두 끝나면 자동으로 해당 객체의 close()가 일어난다. 
 * 
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		// buffered reader 사용
//		BufferedReader br = null;
//		FileReader fr = null;
		String line=null;
		try(
				BufferedReader br = new BufferedReader(new FileReader("C:/temp/sungjuk_utf81.dat")/* fr */);
				) { //autocloseable 되는애들은 try() 안에 써준다.  이러면 밖으로 리더들 뺼 필요 없다. 
			// fr = new FileReader(/*"C:/temp/sungjuk_utf81.dat"*/);
			while((line=br.readLine())!=null) { //왜 while? 끝이 어디인지 모르니까, 몇번 반복할지 몰라서   이 장의 목표는 클로즈를 언제 해야하는거냐 이거다.  while 해서 null이 뜨면 그때 빠져나가서 클로즈 하는거 
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}// finally { // 열엇으면 반드시 닫아야한다.오픈은 생성자가.
		//	try {
	//	/*이게생략된거. if(br!=null)*/br.close();// 닫는건 close 근데 닫는데왤케김?  lang에 autoclosable 있다. 자동으로 닫아줌. finally 안써도댐 
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		}
	//	}

	}
}
