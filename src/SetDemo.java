import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	Set<String> hashSet = new HashSet<String>();//만능 셋이라 스트링 담음 
	Set<String> treeSet = new TreeSet<String>();//만능 셋이라 스트링 담음 
	
	String [] array = {"박지민","박지민","이지민","홍지민","이지민","한지민"};
	for(String str:array){
		hashSet.add(str);
		treeSet.add(str);
	}
System.out.println(hashSet.size());
System.out.println(hashSet); // 중복은 알아서 거른다. 여러개 넣을 수 있고 자유자재로 변할 수 있지만 
System.out.println(treeSet); // hashSet에다가 오름차순 정렬기능을 더한것 

}
}
