import java.util.ArrayList;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
        //���� �ڵ� ���

		//���а� ����ϱ�
//      Scanner sNum = new Scanner(System.in);
//      int a = sNum.nextInt();
//      int b = sNum.nextInt();
//      System.out.println(a+b);
//      sNum.close();
		
		// ���� 3���� �а�, a+b-c�� ���
//		Scanner sNum = new Scanner(System.in);
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		int c = sNum.nextInt();
//		System.out.println(a+b-c);
//		sNum.close();
		
		//�� �ΰ��� �а�, ���ϱ�/���ϱ�/������
//		Scanner sNum = new Scanner(System.in);
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		System.out.println((a+b)+"\n"+(a*b)+"\n"+(a/b)+"\n");
//		sNum.close();
		
		//���ڿ��� �а� �� �� ���
//		Scanner sLine = new Scanner(System.in);
//		String text = sLine.nextLine();
//		System.out.println(text+"\n"+text+"\n"+text+"\n");
//		sLine.close();
		
		//�ΰ��� ���ڿ��� �а� �ϳ��� ���
//		Scanner sLine = new Scanner(System.in);
//		String a = sLine.nextLine();
//		String b = sLine.nextLine();
//		System.out.println(a+" "+b);
//		sLine.close();
		
		//���ڿ��ϳ�, �����ΰ�
//		Scanner sLine = new Scanner(System.in);
//		Scanner sNum = new Scanner(System.in);
//		String str1 = sLine.nextLine();
//		int a = sNum.nextInt();
//		int b = sNum.nextInt();
//		System.out.println(str1+": "+(a+b));
//		sLine.close();
//		sNum.close();
		
		//������ 2�� ���
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
		
		//0���� 20���� 3�� ��� ���
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

		//���ѷ�,������,��ü�� ���
//		Scanner sNum = new Scanner(System.in);
//	    
//		System.out.println("���� �������� �Է��Ͻÿ�");
//		float r = sNum.nextInt();
//
//		System.out.println("���ѷ�: "+(2*3.14*r));
//		System.out.println("������: "+(3.14*r*r));
//		System.out.println("��ü��: "+(4*3.14*r*r*r/3));
//		
//		sNum.close();
		
		//���ڿ� �ϳ�, ���� �ϳ�
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
//		System.out.println("n="+n++); // ���������� : �켱������ ���� ����
//		System.out.println(n);
//		
//		int m=0;
//		
//		System.out.println("m="+(++m)); // ���������� : �켱������ ���� ����
//		System.out.println(m);
		
//		int n=3;
//		int m=5;
//		
//		System.out.println(m++*2+(++n));
		
        /*
         * 1. ++n => 4
         * 2. ���ϱ� 5*2=>10
         * 3. ���ϱ� 10+4=>14
         * 4. ���   14
         * 5. m++ => 6
         */
         
//		System.out.println(m+","+n);
		
		//100�� ������ Ȯ��
//		int a=s.nextInt();
//		
//		if (a==100) {
//		System.out.println("100�� �Էµƽ��ϴ�.");
//		} else {
//		System.out.println("100�� �ƴ� �����Դϴ�.");
//		}
		
		//if-elseȰ��
//		int a=s.nextInt();
//		
//		if (a>50) {
//			System.out.println("50���� ũ��");
//			System.out.println("a%7");
//		} else {
//			System.out.println("50����");
//			System.out.println("a%5");
//		}
		
		//if-elseȰ��2
//		int a=s.nextInt();
//		int b=s.nextInt();
//		
//		if (a>b) {
//			System.out.println(a);
//			System.out.println(a+"��(��) �� Ů�ϴ�.");
//		} else {
//			System.out.println(b);
//			System.out.println(b+"��(��) �� Ů�ϴ�.");
//		}
		
		//�������
//		int a=s.nextInt();
//		
//		if (a==100) {
//			System.out.println("���:A+");
//		} else if (a>=90) {
//			System.out.println("���:A");
//		} else if (a>=80) {
//			System.out.println("���:B");
//		} else if (a>=70) {
//			System.out.println("���:C");
//		} else if (a>=60) {
//			System.out.println("���:D");
//		} else {
//			System.out.println("���:F");
//		}
		
		//���ڿ� ��
//		System.out.println("�ܾ �Է��ϼ���.");
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
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		} else if (num==2) {
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		} else if (num==3) {
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		} else if (num==4) {
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		} else if (num==5) {
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		} else {
//			System.out.println(num+"���� ���Խ��ϴ�.");
//		}
//		
//		System.out.println("���α׷��� �����մϴ�.");
//		s.close();
	
		//�������� if ����
//		System.out.println("���ڸ� �Է��ϼ���.");
//		Scanner s = new Scanner(System.in);
//		
//		int a = s.nextInt();
//		
//		if (a>50 && a<100) {
//			System.out.println("50�� 100������ �����Դϴ�.");
//		} else {
//			System.out.println("���� ���� �����Դϴ�.");
//		}
//		System.out.println("���α׷��� �����մϴ�.");
//		s.close();
		
		//��������if 2
//		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
//		Scanner s = new Scanner(System.in);
//		
//		int a=s.nextInt();
//		int b=s.nextInt();
//		
//		if (a>10 || b<10) {
//			System.out.println("a�� 10���� ũ�ų� b�� 10���� �۴�.");
//		} else if (a<=10 && b<10) {
//			System.out.println("a�� 10���� ũ�� �ʰ� b�� 10���� �۴�");
//		} else {
//			System.out.println("�ش���� ����");
//		}
//		System.out.println("���α׷��� �����մϴ�.");
//		s.close();
		
		//101���� 130���� ���
//		int a = 101;
//		
//		while (a<131) {
//			System.out.println(a++);
//		}
		
		//1���� 100������ Ȧ���� ���
//		int a = 1;
//		
//		while (a<=100) {
//		    System.out.println(a);
//		    a+=2;
//		}
		
		//1���� 100������ ��
//		int n = 1;
//		int total = 0;
//		
//		while (n<101) {
//			total += n++;
//		}
//		System.out.println(total);
		
		//2�ܿ��� 9�ܱ���
//		int a,b;
//		a = 2;
//		
//		while (a<10) {
//			b=1;
//			System.out.println("---"+a+"��---");
//			while (b<10) {
//				System.out.println(a+"X"+b+"="+a*b);
//				b++;
//			}
//			System.out.println("");
//			a++;
//		}
		
		//�Ƕ�̵�
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
		
		//���Ƕ�̵�
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
		
		//3�� ��� ���
//		int a=1;
//		
//		while (a<100) {
//			if(a%3==0) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//Fibonacci�� ���ϱ�
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
		
		//Ư�������� ���
//		int a=0;
//		
//		while (a<10) {
//			if (a>=4 && a<=8) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//while������ �迭��� ��� ���
//		int[] mscore = {80,96,100,76,36,88,72};
//		int[] escore = {70,90,80,40,20,50,30,60,100};
//		
//		System.out.println("mscore�� ����="+mscore.length);
//		System.out.println("escore�� ����="+escore.length);
		
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
//		System.out.println("���� ������ �Է��ϼ���.");
//		int ndx=0;
//		while(ndx<mscore.length) {
//			mscore[ndx] = s.nextInt();
//			ndx++;
//		}
//		System.out.println("----��������----");
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
//		System.out.println("\n�������� ��� : "+avg+"\n");
//		
//		System.out.println("���� ������ �Է��ϼ���.");
//		ndx=0;
//		while(ndx<escore.length) {
//			escore[ndx] = s.nextInt();
//			ndx++;
//		}
//		System.out.println("----��������----");
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
//		System.out.println("\n�������� ��� : "+avg);
//		s.close();
//		System.out.println("\n���α׷��� �����մϴ�.");
		
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
		
		//�޴����� - ����/��Ϻ���
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
//		System.out.println("��-menu-��"+"��-price-��");
//		System.out.println("---------"+"----------");
//		
//		while(ndx<alMenu.size()) {
//			System.out.printf("%9s",alMenu.get(ndx));
//			System.out.printf("%5d",alPrice.get(ndx));
//			System.out.println("��");
//			ndx++;
//		}
		
		// break ����1
//		int i = 0;
//		while(true) {
//			if(i%2==0) System.out.println(i);
//			if(i>=100) break;
//			i++;
//		}
		
		//������ by using for
//		for (int i = 2 ; i<10 ; i++) {
//			System.out.println(i+"��");
//			for( int j = 1 ; j<10 ; j++) {
//				System.out.println(i+"X"+j+"="+(i*j));
//			}
//			System.out.println("");
//		}
		
//		Fibonacci�� by using for
//		for (int a=0,b=1,c=a+b; c<1000; a=b, b=c, c=a+b) {
//			System.out.println(c);
//		}
		
		//�迭�� FOR������ ���
//		int[] mscore = {20,30,40,50,66,77,88,99,100};
//		
//		for (int i=0 ; i<mscore.length ; i++)
//			System.out.println(mscore[i]);
		
		// 10000 ������ �Ҽ�ã��
//		int i,j;
//		
//		for (i=4 ; i<10000 ; i++) {
//			for (j=2 ; j<=i ; j++) {
//				if(i%j==0) break;
//			}
//		if (i==j) System.out.println(i);
//		}
		
		// �������� ����
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
		
		//���ڿ� ������
//		String str="Hello World";
//		String str1="";
//		
//		for (int ndx=0 ; ndx<str.length() ; ndx++) {
//			str1 = str.substring(ndx,ndx+1) + str1;
//		}
//		System.out.println(str1);
		
    }
}