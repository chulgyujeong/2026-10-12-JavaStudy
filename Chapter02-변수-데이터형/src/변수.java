/*
 * 36page
 * 변수 한개의 데이터를 저장하는 메모리 공간
 *     --------------------------
 *     => 모든 프로그램언어는 메모리 => RAM에 저장(휘발성) / ROM(영구성)
 *                              ------------프로그램 종류시 해제
 *     |
 *     파일
 *     |
 *     오라클 : 영구적인 저장 장치 / MySQL / PostgreSQL
 *     -------------------------------------------
 *     
 *     저장되는 과정 
 *     
 *     ------------- 0 주소
 *         사용중
 *     ------------- 4
 *         사용중
 *     ------------- 8
 *          10 ------> 이름을 부여 -> 변수 a(중복이 없어야) -> 메모리 위치를 확인 만드는 별칭
 *     ------------- 12
 *     
 *     ------------- 16
 *     
 *     ------------- 20
 *     메모리 크기 -> 데이터형(자료형)
 *     
 *     기본형 / 참조형 (사용자 정의)
 *             => 배열 / 클래스
 *       | 자바에서 제공하는 데이터형
 *          -------------------
 *          정수
 *             byte   (1byte => 8bit)  0,1 => 8개까지 저장이 가능
 *                    ----------
 *                     11111111 (음수)
 *                     01111111 (양수)
 *                      64 32 16 8 4 2 1 => 127
 *                      => 네트워크 전송 / 파일 업로드
 *                    ----------
 *             short  (2byte => 16bit)
 *                    -------------
 *                    01111111111111(15개)
 *             ****int    (4byte => 32bit)
 *                    011111111(31개) 2147483647
                       컴퓨터는 무조건 숫자는 int인식
 *             ****long   (8byte => 64bit)
 *          실수
 *             float (4byte , 소수점 : 6자리)
 *                   VectorDB (AI) , 
 *             ****double (8byte , 소수점 : 15자리)
 *             Default => 컴퓨터가 인식
 *          논리
 *             boolean : true/false (1byte)
 *          문자
               char : 문자 1개
               => 2byte (0~65535) => 유니코드(UTF-8)
                      값 => 'A', '헝'
                      여러개 = "ABC"
            학점 String a+
            존재여부 : true/false
            -------------------
            1 2 4 8 byte
            -------------------
              byte short int(default) long
            -------------------
                   char
            -------------------
                         float double(default)
            -------------------
             boolean
            -------------------
            변수없는 프로그램은 존재하지 않는다
            
            변수설정
            
            데이터형 변수명 = 값(초기값) 변수 (변하는 수) / 상수
            
            변수명칭법 1. 알파벳, 한글로 시작한다
                       ---대소문자 구분 a, A는 다르다
                    2. 숫자사용이 가능
                       앞에 사용할 수 없다
                       a1 a2 a3 .... a1b
                    3. 특수문자사용이 가능
                       _ ,$=> _사용이 많다
                       1) 임시변수
                       2) 단어가 2개이상인 경우
                          file_name
                    4. 공백은 사용할 수 없다
                    5. 키워드는 사용이 불가능 
                    - ------------------
                    약속사항
                      |변수는 소문자로 시작한다
                      |상수는 대문자
                     캐멀방식 (헝가리언식)
                     단어두개이상
                     firstName : first_name
                     secondName : second_name
                      => 3~10사이 알아보기 쉽게
                      eng_score =engScore
    1) 변수 = 저장공간(값)
       정수 
          = 10, 20 ... 10진법
          = 007
             - 8진법
          = 0xFF
             - 16진법
          = 0b0101
             - 2진법
        long => 반드시 10L / 10l
        ------------------
        byte / short => 범위 벗어나지 않게
                -32768 ~ 32767
         -128 ~ 127
        실수
          f = 10.5f
          double d =10.5 (10.5d/10.5D)
        논리
          boolean => true / false
          boolean b=true
        문자
         char => '' 오류 / 값이 없는 상태 char => ' ' 오류x

        ---------------------------------------------
        변수 선언 방법
        데이터형 변수명=값;
        예)
          국어점수 
            int korea=80;
          영어점수
            int eng=78;
          수학점수
            int math=90;
          총점
            int total=90;
          평균
            double avg=89.0;
          이름
            char c1='홍';
            char c2='길';
            char c3='동';
            String name="홍길동";
            
            byte char int long float double
           
            작은 데이터형에는 큰 값을 저장할 수 없다
            int a = 10L; 
            큰 데이터형에는 작은 값을 저장 할 수 있다
            long l = 10;
            
            
*/public class 변수 {
	public static void main(String[] args) {
        int x,y,z;
        x=10; y=10; z=10;
        System.out.println("x="+(y+z));
        float f = 300000000000L;
        byte b=(byte)340;
        int i=300;
        byte c=(byte)i;

        int 사과=10;
        int 먹은사과=5;
        byte byteValue=127;
        int intValue=10;
        long longValue=10L;
        float floatValue=10.5F;
        double doubleValue=10.5D;
        boolean booleanValue=true;
        char charValue='A';
        
        System.out.println("byteValue="+byteValue);
        System.out.println("intValue="+intValue);
        System.out.println("longValue="+longValue);
        System.out.println("남은사과:"+(사과-먹은사과));

        System.out.println(b);
        System.out.println(c);
       

        double k=100;
        System.out.println("k="+k);
        x = 1; y = 2; z=3;
//		long a = 10;
//        final double PI=3.14;
        System.out.println(f);
		// TODO Auto-generated method stub
        
        int a = 65;
        System.out.println((char)a);
        char t='0';
        System.out.println((int)'대'+'파');
        
// 예외 : boolean은 적용이 안된다 => 숫자(char는 정수)
		/*
		 * 정수 : int
		 * 실수 : double
		 * 존재 : boolean
		 -------
		 long : AI, 데이터가 많은 경우
		 전송(네트워크) => byte
		 
		 형전환 => 데이터형을 변경
		 자동 형변환
		 작은 데이터를 큰데이터에 저장
		 long a=10
		 double d=10L
		 강제 형변환

		*/
		 double h= (float) 10.4f;
		 System.out.println(h);  
       byte d=(byte)129;
       byte d2=(byte)128; 
       byte d3=(byte)(d+d2);
       System.out.println(d3);
	}

}
