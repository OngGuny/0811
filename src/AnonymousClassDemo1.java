//이제는 interface로 anonymous class 사용해보자 
public class AnonymousClassDemo1 {
public static void main(String[] args) {
	AnonymousClassDemo1 acd = new AnonymousClassDemo1();
//	acd.exec(acd.new MyPlus());
//	acd.exec(acd.new MyMultiple());
	acd.exec(new MyInterface() { //paramether에 acd. 안붙여도된다. 외부에있는 클래스니까. 다른객체니까 
		@Override
		public int calculate(int front, int back) { return front+back;}
	});
	acd.exec(new MyInterface() { //익명개체 ...new Interface(){ @Override }  존나긴데? 
		@Override
		public int calculate(int front, int back) { return front*back;}
	});
	acd.exec(new MyInterface() { 
		@Override
		public int calculate(int front, int back) { return front-back;}
	});
	acd.exec(new MyInterface() { 
		@Override
		public int calculate(int front, int back) { return back/front;}
	});
}
void exec(MyInterface mi) {//member method 	//myinterface를 받네? 자식을 만들어서 보내야지 
//받았다치고
	int result = mi.calculate(5, 9);
	System.out.println("Result = "+result);
}

//class MyMultiple implements MyInterface{ //자식 만들었다 ㅎ
//	@Override
//	public int calculate(int front, int back) { // member class
//		return front*back;
//	}
//
//		}
}
//무슨연산자? 시험에나온댔는데 

//메소드가 하나밖에  없는 인터페이스를   
@FunctionalInterface  //라고한다. 람다에서 쓸수도있는 인터페이스라는것.  
interface MyInterface{
	int calculate(int front, int back); 
	}
