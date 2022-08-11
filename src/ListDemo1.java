import java.util.Vector;

public class ListDemo1 { // 효율적으로 쓰는만큼 계산을 좀 더해서 살짝 느림 더빠른게 arraylist . 
public static void main(String[] args) {
	Vector<String> vector = new Vector<String>(3,4); //3,4대신 비워두면 1,1로 채우고 만듦
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
	vector.add("한지민");
	System.out.print(vector.capacity()+","); System.out.println(vector.size());
}
}
