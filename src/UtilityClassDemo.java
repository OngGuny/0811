import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// 교재 11-2 ,  Java에서  날짜, 시간, 랜덤 3개 배운다  날짜시간처리하는 6가지 방법 배움 
/*
 * 1. java.util.Date Class
 * 2. java.util.Calendar Class 
 * 3. java.text.DateFormat Class(java.text)
 * 4. java.text.SimpleDateFormat Class
 * 5. printf(); + %t  java.util.formatter
 * 
 * 
 */

public class UtilityClassDemo {
	//DATE만이 가지는 아주 독특한 특징이 있다. 
	public static void main(String[] args) {
	Date now = new Date(); // now 가 지금의 시간정보를 가지고 있따. 
	
		System.out.println(now);
		
		// 첫번째 
		//	System.out.println(now.getTime()); // 기준년도 월 일 시 분초 부터 지금까지 흐른 밀리세컨드를 표시하는것 \1660200004792
	//다른거랑 비교해보자 
		File file = new File("C:/temp/sungjuk_utf81.dat");
		System.out.println(file.lastModified()); // 마지막 수정시간 
		// date 클래스는 저 무지막지한 초를 계산하는 기능을 갖고있다  date epoch
		Date createTime = new Date(file.lastModified());
		System.out.println(createTime);
		
		Date before = new Date(1660200004792L);
		System.out.println(before);

		
		 // 2번쨰 
		// 캘린더는 자식으로 만들거나. getnow로 가져오거나 
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DAY_OF_MONTH); // 월의 일
		System.out.println(year + "년"+month+"월"+day+"일");
		
		//3 번째  //date format 은 추상클래스라서 new 안된다. 
		// 나라별로 찍을 수 있따. 날짜를.  근데 몇개없다. 한국포함 ;public final class Localeextends Object implements Cloneable, Serializable
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRENCH); // 단순 연원일 에다가 나라별로도 찍을수있는기능 있음 
		System.out.println(df.format(new Date()));
		
		//4번째 dateformat의 자식 사용 
		String pattern = "오늘은 yyyy년 MM월 dd일입니다."; // 이 포멧은 다못외우니 표 보면 된다. public class SimpleDateFormat extends DateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
	
		//5번째  api formatter 가서 찾아보면 printf 의 % 용법 다 나와있다. 
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다\n", new Date()); // 변수 하나만 쓰니까 $기호로 지정해준다. 
		System.out.printf("오늘은 %tD이다 \n", new Date()); // %tD는 세트다 
		
		
	}
	
	

}