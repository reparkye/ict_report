package kbg;

import java.util.ArrayList;
import java.util.List;

public class KbgExam20180726 {
//	1. λ¬Έμ?΄ 2κ°λ?? ?? ₯λ°μ ? ?λ‘? λ³????¬ ??? ?©? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±?΄μ£ΌμΈ?.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("???€ ?«? aλ₯? ?? ₯??Έ?");
//		int a = Integer.parseInt(scan.nextLine());
//		System.out.println("???€ ?«? bλ₯? ?? ₯??Έ?");
//		int b = Integer.parseInt(scan.nextLine());
//		System.out.println(a+b);
//	}

//	2. ?€? λΉμΉΈ? ?€?΄κ°? μ½λλ₯? ? ?Ό?Έ?.
//
//	public class Test {
//
//		public static void main(String[] args) {
//			int num = 63;
//			
//			if(   num<100     ) {
//				System.out.println("num?΄ 100 λ―Έλ§???€.");
//			} else if(     num>100     ){
//				System.out.println("num?΄ 100 μ΄κ³Ό???€. ");
//			} else {
//				System.out.println("num?΄ 100???€.");
//			}
//			
//		}
//	}

//	3. ? ?? λ°°μ΄? λ§λ€κ³? 5κ°μ ??€κ°?(0~ 9)? μ§μ΄?£?΄ μΆλ ₯?? ?λ‘κ·Έ?¨? ??±?΄μ£ΌμΈ?. 
//	  - (List ?¬?©κ°??₯)
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

//	4. ? ?? ?°?΄?°??? 2κ°λ?? ??Όλ―Έν°λ‘? λ°μ ?©? λ¦¬ν΄?? λ©μ?λ₯? ??±?΄μ£ΌμΈ?.
//	
//	public int test(int a,int b) {
//		
//		return a+b;
//	}

//
//	5. 1λΆ??° 50κΉμ? μ€μ? 3? λ°°μ?΄κ³? 7?λ°°μ?Έ ?«?λ₯? μΆλ ₯?΄μ£ΌμΈ?. 
//	public static void main(String[] args) {
//		for(int i = 1;i<50;i++) {
//			if(i%3==0&&i%7==0) {
//				System.out.println(i);
//				
//			}
//		}
//	}
	

//	6. ??Όλ―Έν°λ‘? ??? κ°μ΄ ?€?΄?? ? ?? λ°°μ΄? λ°μ μ΅λ?κ°μ λ¦¬ν΄?΄μ£Όλ λ©μ?λ₯? ??±?΄μ£ΌμΈ?. 
//	  - (?¬?΄μ¦? 3 ~ 10)      
//	  - (List ?¬?©κ°??₯)
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
//	7. ??Όλ―Έν°λ‘? String λ°°μ΄ κ³? λ¬Έμ?΄? λ°μ ?΄?Ή λ°°μ΄? λͺλ²μ§? λ°©μ ?΄?Ή λ¬Έμ?΄?΄ ??μ§? λ¦¬ν΄?? λ©μ?λ₯? ??±?΄μ£ΌμΈ?.
//	  - (List ?¬?©κ°??₯)
//	public int test(String[] a,String b) {
//		for(int i = 0;i<a.length;i++) {
//			if(a[i].equals(b)){
//				return i;
//			}
//		}
//		return 0;
//		
//		
//	}
//
//	8. ?€? ?λ‘κ·Έ?¨? ?€? κ²°κ³Όλ₯? ?°?Έ?.
//
//	class Father{
//		
//		public void run() {
//			System.out.println("?λΉ κ? ?¬λ¦½λ?€.");
//		}
//	}
//
//	public class Test extends Father{
//
//		@Override
//		public void run() {
//			System.out.println("?΄κ°? ?¬λ¦½λ?€.");
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
//	?΄κ°? ?¬λ¦½λ?€.
//	?λΉ κ? ?¬λ¦½λ?€.


//	9. user_info ?Ό? ?΄λ¦?, ??΄, μ£Όμλ₯? ???₯?  ? ?? table? λ§λ? λͺλ Ή?΄λ₯? ?°?Έ? 
//	  - (?΄λ¦?, ??΄? nullκ°μ΄ ??κ²? ?€? )
//	  - (?°?΄?° ???, ?¬?΄μ¦λ ? ?Ή?)
//	  - (oracle, mariadb ?μ€μ ?λ¬΄κ±°?)
//	create table user_info(
//	uiName varchar(200) not null,
//	uiAge int not null,
//	uiAddress varchar(1000) not null);
//
//	10. λ°©κΈλ§λ  user_info ??΄λΈμ ?΄?©? λͺ¨λ λ³΄κ³  ?Ά??? ?¬?©?? λͺλ Ή?΄λ₯? ?°?Έ?.
//	select * from user_info;
}
