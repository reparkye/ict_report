package kbg;

import java.util.ArrayList;
import java.util.List;

public class KbgExam20180726 {
//	1. 문자열 2개를 입력받아 정수로 변환하여 두수의 합을 출력하는 프로그램을 작성해주세요.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("더하실 숫자 a를 입력하세요");
//		int a = Integer.parseInt(scan.nextLine());
//		System.out.println("더하실 숫자 b를 입력하세요");
//		int b = Integer.parseInt(scan.nextLine());
//		System.out.println(a+b);
//	}

//	2. 다음 빈칸에 들어갈 코드를 적으세요.
//
//	public class Test {
//
//		public static void main(String[] args) {
//			int num = 63;
//			
//			if(   num<100     ) {
//				System.out.println("num이 100 미만입니다.");
//			} else if(     num>100     ){
//				System.out.println("num이 100 초과입니다. ");
//			} else {
//				System.out.println("num이 100입니다.");
//			}
//			
//		}
//	}

//	3. 정수형 배열을 만들고 5개의 랜덤값(0~ 9)을 집어넣어 출력하는 프로그램을 작성해주세요. 
//	  - (List 사용가능)
//	public static void main(String[] args) {
//		List<Integer> a = new ArrayList<Integer>();
//		for(int i =0; i<5;i++) {
//			int b =(int)(Math.random()*10);
//			a.add(b);
//		}
//		for(int n:a) {
//			System.out.println(n);
//		}
//	}

//	4. 정수형 데이터타입 2개를 파라미터로 받아 합을 리턴하는 메소드를 작성해주세요.
//	
//	public int test(int a,int b) {
//		
//		return a+b;
//	}

//
//	5. 1부터 50까지 중에서 3의 배수이고 7의배수인 숫자를 출력해주세요. 
//	public static void main(String[] args) {
//		for(int i = 1;i<50;i++) {
//			if(i%3==0&&i%7==0) {
//				System.out.println(i);
//				
//			}
//		}
//	}
	

//	6. 파라미터로 임의의 값이 들어있는 정수형 배열을 받아 최대값을 리턴해주는 메소드를 작성해주세요. 
//	  - (사이즈 3 ~ 10)      
//	  - (List 사용가능)
//	public int test(int[] a) {
//		int max = 0;
//		for(int i=0;i<a.length;i++) {
//			if(i==0) {
//				max=a[0];
//				
//			}else{
//				if(max<a[i]){
//					max=a[i];
//					
//				}
//				
//			}
//			
//		}
//		return max;
//	}
//
//	7. 파라미터로 String 배열 과 문자열을 받아 해당 배열에 몇번째 방에 해당 문자열이 있는지 리턴하는 메소드를 작성해주세요.
//	  - (List 사용가능)
//	public int test(String[] a,String b) {
//		for(int i = 0;i<a.length;i++) {
//			if(a[i].equals(b)){
//				return i;
//			}
//		}
//		return -1;
//		
//		
//	}
//
//	8. 다음 프로그램에 실행 결과를 쓰세요.
//
//	class Father{
//		
//		public void run() {
//			System.out.println("아빠가 달립니다.");
//		}
//	}
//
//	public class Test extends Father{
//
//		@Override
//		public void run() {
//			System.out.println("내가 달립니다.");
//		}
//
//		public static void main(String[] args) {
//			Father f = new Test();
//			f.run();
//	 
//			Father f2 = new Father();
//			f2.run();
//		}
//
//	} 
//	내가 달립니다.
//	아빠가 달립니다.


//	9. user_info 라는 이름, 나이, 주소를 저장할 수 있는 table을 만드는 명령어를 쓰세요 
//	  - (이름, 나이는 null값이 안되게 설정)
//	  - (데이터 타입, 사이즈는 적당히)
//	  - (oracle, mariadb 둘중에 아무거나)
//	create table user_info(
//	uiName varchar(20) not null,
//	uiAge int not null,
//	uiAddress varchar(1000) not null);
//
//	10. 방금만든 user_info 테이블의 내용을 모두 보고 싶을때에 사용하는 명령어를 쓰세요.
//	select * from user_info;
}
