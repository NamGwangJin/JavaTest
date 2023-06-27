import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sales {
	private ArrayList<String> alMobile;
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;
	private ArrayList<String> alTime;
	private Scanner s1;
	private Date date = new Date();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	Sales(){
		this.alMobile = new ArrayList<String>();
		this.alMenu = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
		this.alTime = new ArrayList<String>();
		this.s1 = new Scanner(System.in);
	}
	
	void add(Order data) {
		if (data.getSize()<1) {
			System.out.println("메뉴가 선택되지 않았습니다.");
			return;
		} else {
		System.out.println("적립하실 전화번호를 입력해주세요. [enter:적립 건너뛰기]");
		}
		String mobile=s1.nextLine();
		if(mobile.equals("")) {
			System.out.println("적립을 건너뛰셨습니다.\n 결제가 완료되었습니다.");
			mobile="-";
		} else {
			System.out.println(mobile+" 번호로 적립이 완료되었습니다.\n 결제가 완료되었습니다.");
		}
		for (int ndx=0 ; ndx<data.getSize() ; ndx++) {
			this.alMobile.add(mobile);
			this.alMenu.add(data.getalName(ndx));
			this.alQty.add(data.getalQty(ndx));
			this.alSum.add(data.getalSum(ndx));
			this.alTime.add(dateFormat.format(date));
		}
	}
	
	void display() {
		long salesSum=0L;
		System.out.println("-----------------------------매출 내역---------------------------");
		System.out.println("적립번호        메뉴              수량   금액   시간");
		for (int ndx=0; ndx<this.alMenu.size(); ndx++) {
			System.out.printf("%-12s %-15s %2d %8d %-19s\n",this.alMobile.get(ndx)
								,this.alMenu.get(ndx),this.alQty.get(ndx)
								,this.alSum.get(ndx),this.alTime.get(ndx));
			salesSum+=this.alSum.get(ndx);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("매출 총액 : "+salesSum+" 원\n");
	}
}
