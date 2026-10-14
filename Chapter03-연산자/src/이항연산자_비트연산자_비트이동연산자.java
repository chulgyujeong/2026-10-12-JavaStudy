/*
 * 비트연산자
 * & | ^
 * * + 다른비트찾기
 * 
 * ^
 * 0 0 = 0
 * 1 0 = 1
 * 0 1 = 1
 * 1 1 = 0
 * 
 *      35&20
 *      28&10
 *      
 *      비트이동연산자
 *        << , >>
 *        
 *        10<<2 ==> 40
 *      1010000
 *      
 *        x<<y => x*2^y
 *        x>>y => x/2^y
 *        10>>2
 *        1010 => 10 => 2
 *        
 *        이진법 Integer.toBinaryString(정수)  
 *       1) 연산자
 *         1. 증감연산자
 *         2. 형변환연산자
 *         3. 산술연산자
 *         4. 비교연산자
 *         5. 논리연산자
 *         6. 대입연산자
 *       
*/public class 이항연산자_비트연산자_비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(Integer.toBinaryString(28));
    System.out.println(Integer.toOctalString(100));
    System.out.println(Integer.toHexString(100));
    System.out.println(10>>2);
    System.out.println(0b1010);
	}

}
