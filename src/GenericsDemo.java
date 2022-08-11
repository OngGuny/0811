
public class GenericsDemo {
public static void main(String[] args) {
//	Car car = new Car(5); 	//정수만 받을 수 있따. 만능이 되려면 어떻해야하지? type의 약자 T를쓰자 
	Car<Integer> car = new Car(5); 	int result=car.getValue();		//	int result = (Integer)car.getValue();
	Car<Double> car1 = new Car(5.5);double result1=car1.getValue();				// 	double result1=(Double)car1.getValue();
	Car<String> car2 = new Car("hello");	String result2=car2.getValue();//String result2=(String)car2.getValue(); // 이건 뽑을 때 강제 형변환을 시키는거 제너릭 있으니 이렇게 하지말자는거 
	//제너릭 써주면 자동으로 형변환해서 받고 출력한다는것 
	
	
	
	//	int result = car.getValue();
//	System.out.println(result);
}
}
class Car<T>{ // 모든 타입을 받을 수 있는 car 다.  꺽새는 받을 수 있는 타입  여기의 <T> 가 제너릭.    쓰는곳도 한정. 딱 collection 에서 만 사용. 라벨을 붙여주는것
	 	//괄호안에 그냥 대문자 쓰면댄다. 구분하기쉽게 T K E 등등써주는거 
	private T value;
	public Car(T value) {this.value=value;}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}