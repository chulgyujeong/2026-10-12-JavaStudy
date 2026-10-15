/*
 *  = 일반 대입
 *  int a=10;
 *  a=20; ==> 10 => 20 => 변수의 초기값 : 연산자 결과값
 *        ==> 우선순위가 낮다
 *        ==> 오른쪽 ==> 왼쪽
 *        
 *        +=
 *           복합 대입연산자 => 문자열 결합 , 누적
 *           int a=10;
 *           a+=1; ===> a=a+1 => a=11 => a++ ++a
 *                      증가되는 수가 많으면 사용
 *  -=
 *  -------------------
 *  *=
 *  /=
 *  %=
 *  
 *  
 *
 *
 *
 *
 *
 *
*/public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        a++;
        a++;
        a++;
        a++;
        a++;
        	System.out.println(a);
        a=10;
        a+=5;
        System.out.println(a);
        
        System.out.println("==== 문자열 결합 ====");
        String s1="ABC";
        String s2="DEF";
        String s3="";
        s3+=s1;
        s3+=s2;
        System.out.println(s3);
        
        System.out.println("==== -= =====");
        int b=10;
        b-=5; //b=b-5
        System.out.println(b);
        
        System.out.println("==== *= ====");
        int c=10;
        c*=100; // c=c*=100
        System.out.println(c);
        
        System.out.println("==== /= ====");
        int d=10;
        d/=3.0;
        System.out.println(d); // 복합대입연산자는 형변환을 내부적으로 자연스럽게 처리
        
        System.out.println("==== %= ====");
        int e=10;
        e%=3.0; // e=e%3 => 1
        System.out.println(e);
        
	}

}
