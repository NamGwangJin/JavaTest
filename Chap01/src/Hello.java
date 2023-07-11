import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
        //과제 코드 기록

		//값읽고 계산하기
//      Scanner sNum = new Scanner(System.in);
//      int a = sNum.nextInt();
//      int b = sNum.nextInt();
//      System.out.println(a+b);
//      sNum.close();
		
		// 값을 3개를 읽고, a+b-c를 출력
//		Scanner sNum = new Scanner(System.in);
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		int c = sNum.nextInt();
//		System.out.println(a+b-c);
//		sNum.close();
		
		//값 두개를 읽고, 더하기/곱하기/나누기
//		Scanner sNum = new Scanner(System.in);
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		System.out.println((a+b)+"\n"+(a*b)+"\n"+(a/b)+"\n");
//		sNum.close();
		
		//문자열을 읽고 세 번 출력
//		Scanner sLine = new Scanner(System.in);
//		String text = sLine.nextLine();
//		System.out.println(text+"\n"+text+"\n"+text+"\n");
//		sLine.close();
		
		//두개의 문자열을 읽고 하나로 출력
//		Scanner sLine = new Scanner(System.in);
//		String a = sLine.nextLine();
//		String b = sLine.nextLine();
//		System.out.println(a+" "+b);
//		sLine.close();
		
		//문자열하나, 정수두개
//		Scanner sLine = new Scanner(System.in);
//		Scanner sNum = new Scanner(System.in);
//		String str1 = sLine.nextLine();
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		System.out.println(str1+": "+(a+b));
//		sLine.close();
//		sNum.close();
		
		//구구단 2단 출력
//		int a=1;
//		int b=2;
//		
//		System.out.println("2\n");
//		
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a));
//		a++;
//		System.out.println(b+"x"+a+"="+(b*a)+"\n");
		
		//0부터 20까지 3의 배수 출력
//		int a=0;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;
//		System.out.println(a);
//		a+=3;

		//원둘레,원면적,구체적 계산
//		Scanner sNum = new Scanner(System.in);
//	    
//		System.out.println("구의 반지름을 입력하시오");
//		float r = sNum.nextInt();
//
//		System.out.println("원둘레: "+(2*3.14*r));
//		System.out.println("원면적: "+(3.14*r*r));
//		System.out.println("구체적: "+(4*3.14*r*r*r/3));
//		
//		sNum.close();
		
		//문자열 하나, 숫자 하나
//		Scanner sLine = new Scanner(System.in);
//		Scanner sNum = new Scanner(System.in);
//		
//		String text = sLine.nextLine();
//		int a = sNum.nextInt();
//		
//		System.out.printf("%12s\n",text);
//		System.out.printf("%4d\n",a);
//		
//		sLine.close();
//		sNum.close();

//		int n=0;
//		
//		System.out.println("n="+n++); // 후위연산자 : 우선순위가 가장 낮음
//		System.out.println(n);
//		
//		int m=0;
//		
//		System.out.println("m="+(++m)); // 전위연산자 : 우선순위가 가장 높음
//		System.out.println(m);
		
//		int n=3;
//		int m=5;
//		
//		System.out.println(m++*2+(++n));
		
        /*
         * 1. ++n => 4
         * 2. 곱하기 5*2=>10
         * 3. 더하기 10+4=>14
         * 4. 출력   14
         * 5. m++ => 6
         */
         
//		System.out.println(m+","+n);
		
		//100과 같은지 확인
//		int a=s.nextInt();
//		
//		if (a==100) {
//		System.out.println("100이 입력됐습니다.");
//		} else {
//		System.out.println("100이 아닌 숫자입니다.");
//		}
		
		//if-else활용
//		int a=s.nextInt();
//		
//		if (a>50) {
//			System.out.println("50보다 크다");
//			System.out.println("a%7");
//		} else {
//			System.out.println("50이하");
//			System.out.println("a%5");
//		}
		
		//if-else활용2
//		int a=s.nextInt();
//		int b=s.nextInt();
//		
//		if (a>b) {
//			System.out.println(a);
//			System.out.println(a+"이(가) 더 큽니다.");
//		} else {
//			System.out.println(b);
//			System.out.println(b+"이(가) 더 큽니다.");
//		}
		
		//학점계산
//		int a=s.nextInt();
//		
//		if (a==100) {
//			System.out.println("등급:A+");
//		} else if (a>=90) {
//			System.out.println("등급:A");
//		} else if (a>=80) {
//			System.out.println("등급:B");
//		} else if (a>=70) {
//			System.out.println("등급:C");
//		} else if (a>=60) {
//			System.out.println("등급:D");
//		} else {
//			System.out.println("등급:F");
//		}
		
		//문자열 비교
//		System.out.println("단어를 입력하세요.");
//		String text = s.nextLine();
//		
//		if (text.equals("Hello")) {
//			System.out.println(text+" World");
//		} else if (text.equals("Good")) {
//			System.out.println(text+" Morning Vietnam");
//		} else if (text.equals("Bye")) {
//			System.out.println("Good "+text+" Las Vegas");
//		} else if (text.equals("Star")) {
//			System.out.println(text+" Wars");
//		} else {
//			System.out.println("I don`t know");
//		}
//		switch(text) {
//		case "Hello":
//			System.out.println(text+" World");
//			break;
//		case "Good":
//			System.out.println(text+" Morning Vietnam");
//			break;
//		case "Bye":
//			System.out.println("Good "+text+" Las Vegas");
//			break;
//		case "Star":
//			System.out.println(text+" Wars");
//			break;
//		default:
//			System.out.println("I don`t know");
//		}
		
//		int num=(int)(Math.random()*6)+1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("first"); break;
//		case 2:
//			System.out.println("second"); break;
//		case 3:
//			System.out.println("third"); break;
//		case 4:
//			System.out.println("fourth"); break;
//		case 5:
//			System.out.println("fifth"); break;
//		default:
//			System.out.println("sixth");
//		}
//		
//		if (num==1) {
//			System.out.println(num+"번이 나왔습니다.");
//		} else if (num==2) {
//			System.out.println(num+"번이 나왔습니다.");
//		} else if (num==3) {
//			System.out.println(num+"번이 나왔습니다.");
//		} else if (num==4) {
//			System.out.println(num+"번이 나왔습니다.");
//		} else if (num==5) {
//			System.out.println(num+"번이 나왔습니다.");
//		} else {
//			System.out.println(num+"번이 나왔습니다.");
//		}
//		
//		System.out.println("프로그램을 종료합니다.");
//		s.close();
	
		//복합조건 if 과제
//		System.out.println("숫자를 입력하세요.");
//		Scanner s = new Scanner(System.in);
//		
//		int a = s.nextInt();
//		
//		if (a>50 && a<100) {
//			System.out.println("50과 100사이의 숫자입니다.");
//		} else {
//			System.out.println("범위 밖의 숫자입니다.");
//		}
//		System.out.println("프로그램을 종료합니다.");
//		s.close();
		
		//복합조건if 2
//		System.out.println("두 개의 숫자를 입력하세요.");
//		Scanner s = new Scanner(System.in);
//		
//		int a=s.nextInt();
//		int b=s.nextInt();
//		
//		if (a>10 || b<10) {
//			System.out.println("a가 10보다 크거나 b가 10보다 작다.");
//		} else if (a<=10 && b<10) {
//			System.out.println("a가 10보다 크지 않고 b가 10보다 작다");
//		} else {
//			System.out.println("해당사항 없음");
//		}
//		System.out.println("프로그램을 종료합니다.");
//		s.close();
		
		//101부터 130까지 출력
//		int a = 101;
//		
//		while (a<131) {
//			System.out.println(a++);
//		}
		
		//1부터 100이하의 홀수만 출력
//		int a = 1;
//		
//		while (a<=100) {
//		    System.out.println(a);
//		    a+=2;
//		}
		
		//1부터 100까지의 합
//		int n = 1;
//		int total = 0;
//		
//		while (n<101) {
//			total += n++;
//		}
//		System.out.println(total);
		
		//2단에서 9단까지
//		int a,b;
//		a = 2;
//		
//		while (a<10) {
//			b=1;
//			System.out.println("---"+a+"단---");
//			while (b<10) {
//				System.out.println(a+"X"+b+"="+a*b);
//				b++;
//			}
//			System.out.println("");
//			a++;
//		}
		
		//피라미드
//		int a,b;
//		a= 1;
//		
//		while (a<11) {
//			b = 0;
//			while (a>b) {
//				System.out.print("*");
//				b++;
//			}
//			a++;
//			System.out.println("");
//		}
		
		//역피라미드
//		int a,b;
//		a= 1;
//		
//		while (a<=10) {
//			b = 10;
//			while (a<=b) {
//				System.out.print("*");
//				b--;
//			}
//			a++;
//			System.out.println("");
//		}
		
		//3의 배수 출력
//		int a=1;
//		
//		while (a<100) {
//			if(a%3==0) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//Fibonacci수 구하기
//		int a=0;
//		int b=1;
//		int c=a+b;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		while (c<=1000) {
//			System.out.println(c);
//			a=b;
//			b=c;
//			c=a+b;
//		}
		
		//특정범위만 출력
//		int a=0;
//		
//		while (a<10) {
//			if (a>=4 && a<=8) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//while문으로 배열요소 모두 출력
//		int[] mscore = {80,96,100,76,36,88,72};
//		int[] escore = {70,90,80,40,20,50,30,60,100};
//		
//		System.out.println("mscore의 길이="+mscore.length);
//		System.out.println("escore의 길이="+escore.length);
		
//		int ndx = 0;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
//		System.out.println(mscore[ndx]);
//		ndx++;
		
//		int ndx=0;
//		while(ndx<mscore.length) {
//			System.out.println(mscore[ndx]);
//			ndx++;
//		}
		
//		int ndx=0;
//		while(ndx<escore.length) {
//			System.out.println(escore[ndx]);
//			ndx++;
//		}
		
//		Scanner s = new Scanner(System.in);
//		
//		int[] mscore = new int[5];
//		int[] escore = new int[5];
//		
//		System.out.println("수학 점수를 입력하세요.");
//		int ndx=0;
//		while(ndx<mscore.length) {
//			mscore[ndx] = s.nextInt();
//			ndx++;
//		}
//		System.out.println("----수학점수----");
//		ndx=0;
//		while(ndx<mscore.length) {
//			System.out.println(mscore[ndx]);
//			ndx++;
//		}
//		
//		ndx=0;
//		int sum=0;
//		while (ndx<mscore.length) {
//			sum+=mscore[ndx];
//			ndx++;
//		}
//		int avg=sum/5;
//		System.out.println("\n수학점수 평균 : "+avg+"\n");
//		
//		System.out.println("영어 점수를 입력하세요.");
//		ndx=0;
//		while(ndx<escore.length) {
//			escore[ndx] = s.nextInt();
//			ndx++;
//		}
//		System.out.println("----영어점수----");
//		ndx=0;
//		while(ndx<escore.length) {
//			System.out.println(escore[ndx]);
//			ndx++;
//		}
//		
//		ndx=0;
//		sum=0;
//		
//		while (ndx<escore.length) {
//			sum+=escore[ndx];
//			ndx++;
//		}
//		avg=sum/5;
//		System.out.println("\n영어점수 평균 : "+avg);
//		s.close();
//		System.out.println("\n프로그램을 종료합니다.");
		
		// ArrayList
//		Scanner s = new Scanner(System.in);
		
//		ArrayList<Integer> alMath = new ArrayList<Integer>();
//		int score=s.nextInt();
//		while(score>-1) {
//			alMath.add(score);
//			score=s.nextInt();
//		}
//		
//		System.out.println("--------------");
//		int ndx=0;
//
//		while(ndx<alMath.size()) {
//			System.out.println(alMath.get(ndx));
//			ndx++;
//		}
		
		//메뉴관리 - 생성/목록보기
//		Scanner text = new Scanner(System.in);
//		Scanner num = new Scanner(System.in);
//		
//		ArrayList<String> alMenu = new ArrayList<String>();
//		ArrayList<Integer> alPrice = new ArrayList<Integer>();
//
//		while(true) {
//			String menu = text.nextLine();
//			if (menu.equals("")) break;
//			String str = text.nextLine();
//			int price = (str.equals(""))?0:Integer.parseInt(str);
//			alMenu.add(menu);
//			alPrice.add(price);
//			}
//		
//		int ndx = 0;
//		
//		System.out.println("---------"+"----------");
//		System.out.println("ㅣ-menu-ㅣ"+"ㅣ-price-ㅣ");
//		System.out.println("---------"+"----------");
//		
//		while(ndx<alMenu.size()) {
//			System.out.printf("%9s",alMenu.get(ndx));
//			System.out.printf("%5d",alPrice.get(ndx));
//			System.out.println("원");
//			ndx++;
//		}
		
		// break 연습1
//		int i = 0;
//		while(true) {
//			if(i%2==0) System.out.println(i);
//			if(i>=100) break;
//			i++;
//		}
		
		//구구단 by using for
//		for (int i = 2 ; i<10 ; i++) {
//			System.out.println(i+"단");
//			for( int j = 1 ; j<10 ; j++) {
//				System.out.println(i+"X"+j+"="+(i*j));
//			}
//			System.out.println("");
//		}
		
//		Fibonacci수 by using for
//		for (int a=0,b=1,c=a+b; c<1000; a=b, b=c, c=a+b) {
//			System.out.println(c);
//		}
		
		//배열값 FOR문으로 출력
//		int[] mscore = {20,30,40,50,66,77,88,99,100};
//		
//		for (int i=0 ; i<mscore.length ; i++)
//			System.out.println(mscore[i]);
		
		// 10000 이하의 소수찾기
//		int i,j;
//		
//		for (i=4 ; i<10000 ; i++) {
//			for (j=2 ; j<=i ; j++) {
//				if(i%j==0) break;
//			}
//		if (i==j) System.out.println(i);
//		}
		
		// 오름차순 정렬
//		int[] ar = {10, 5, 55, 63, 25, 13, 7, 2, 4, 6, 0, 1};
//		
//		int temp,x,ndx;
//        
//		for (ndx=0; ndx<ar.length; ndx++) {
//			for (x=ndx+1; x<ar.length; x++) {
//				if(ar[ndx] > ar[x]) {
//					temp=ar[ndx];
//					ar[ndx]=ar[x];
//					ar[x]=temp;
//				}
//			}
//			System.out.print(ar[ndx]+" ");
//		}
		
		//문자열 뒤집기
//		String str="Hello World";
//		String str1="";
//		
//		for (int ndx=0 ; ndx<str.length() ; ndx++) {
//			str1 = str.substring(ndx,ndx+1) + str1;
//		}
//		System.out.println(str1);
		
    }
}