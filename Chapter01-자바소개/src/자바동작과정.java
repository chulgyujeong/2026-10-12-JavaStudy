//실행방법

// 4,5,29,30page 1장
// 설치\
/*   주의점 1. 모든 프로그램은 main()을 필요로 한다
        시작과 끝을 알려줌
        클래스 명과 파일명이 동일, 명령이 끝나면 반드시 ;
        가급적이면 한글사용x
        원시소스(개발자만 알아본다)
                     컴퓨터가 인식
                     바이트 코드
        A.java ===== A.class ===== 실행
               javac         java
             기계어로 변경      한줄씩 읽어서 출력
             컴파일            인터프리터
       1)재사용
       2)가독성 - 주석
       3)확장성 -> 리팩토링
         데이터 저장 : name
       --------------유지보수성
       
//        */
//<>        
   
//
//

public class 자바동작과정 {
	
	public static void main(String [] args) {
		System.out.println("Hello java");
	}
}
//		
//	}
//}
//class a
//{
//	A(){
//		System.out.println("메모리 저장"); //생성자
//	}
//
//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		System.out.println("메모리 해제"); // 소멸자
//	}
//	}
//public class 자바동작과정 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////        A a=new A();
////        a=null;
////        System.gc();
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//			    System.out.println("동작");	
//			}
//		};
//		new Thread(r).start();
//		
//		Runnable rr=()->{
//			System.out.println("동작 2");
//	    new Thread(rr).start();
//		}
//	
//	}
//
//}
