import java.util.ArrayList;
import java.util.Scanner;
public class Order {
	private Scanner s1;
	private Scanner s2;
	private ArrayList<String> alName;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;
	
	Order() {
		this.alName = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
		this.s1 = new Scanner(System.in);
		this.s2 = new Scanner(System.in);
	}

	public int getSize() {
		return this.alName.size();
	}
	
	public String getalName(int n) {
		return this.alName.get(n);
	}
	
	public int getalQty(int n) {
		return this.alQty.get(n);
	}
	
	public int getalSum(int n) {
		return this.alSum.get(n);
	}
	
	void control(Menu oMenu) {
		while(true) {
			System.out.println("진행할 작업 선택 [c:주문 내역 추가, r:주문 내역 출력, d:주문 내역 삭제, b:뒤로 가기, enter:결제하기]");
			String oJob=s1.nextLine();
			if(oJob.equals("")) break;
			else if(oJob.equals("b")) {
				System.out.println("뒤로 가시겠습니까? 현재 저장된 주문내역은 삭제됩니다. [0: 아니오, 1: 예]");
				int ndx = s2.nextInt();
				if (ndx == 0) continue;
				else if (ndx == 1) {
					alName.clear();
					alQty.clear();
					alSum.clear();
					break;
				} else {
					System.out.println("잘못된 키가 입력되었습니다.");
					continue;
				}
			}
			else if(oJob.equals("c")) {
				this.add(oMenu);
			} else if(oJob.equals("r")) {
				this.display();
			} else if(oJob.equals("d")) {
				this.delete();
			} else {
				System.out.println("잘못된 키를 입력하셨습니다!");
				continue;
			}
		}
	}
	
	void add(Menu orderMenu) {
		while(true) {
			orderMenu.display();
			System.out.println("주문하실 메뉴번호를 선택해주세요. [enter : 메뉴 담기 종료]");
			String job = s1.nextLine();
			if(job.equals("")) break;
			int ndx = Integer.parseInt(job);
			if(ndx<0 || ndx>orderMenu.getMenuSize()) {
				System.out.println("존재하지 않는 메뉴입니다.");
				continue;
			}
			System.out.println(job+"번 메뉴 "+orderMenu.getName(Integer.parseInt(job)-1)+"를 선택하셨습니다.");

			String menuName = orderMenu.getName(ndx-1);
			int price = orderMenu.getPrice(ndx-1);
			System.out.println("수량을 입력해주세요.");
			int qty = s2.nextInt();
			if(qty<1) continue;
			this.alName.add(menuName);
			this.alQty.add(qty);
			this.alSum.add(qty*price);
			System.out.println("메뉴 담기가 완료되었습니다.\n메뉴명 : "+menuName+"\n수량 : "+qty+"\n가격 : "+(qty*price));
		}
	}
	
	void display() {
		int ndx;
		System.out.println("--------order list--------\nNo.   Menu    수량  금액");
		for (ndx=0 ; ndx<this.alName.size() ; ndx++) {
			System.out.printf("%2d %10s %2d %5d\n", (ndx+1), this.alName.get(ndx), this.alQty.get(ndx), this.alSum.get(ndx));
		}
		System.out.println("--------------------------");
		int qtySum=0;
		int priceSum=0;
		for (ndx = 0 ; ndx<this.alName.size() ; ndx++) {
			qtySum = this.alQty.get(ndx)+qtySum;
			priceSum = this.alSum.get(ndx)+priceSum;
		}
		System.out.println(" 총 주문 수량 : "+qtySum);
		System.out.println(" 총 주문 금액 : "+priceSum+"원\n");
	}
	
	void delete() {
		while (true) {
			this.display();
			int ndx,x;
			System.out.println("삭제할 주문 번호를 입력해주세요. [-1:전체삭제, 0:나가기]");
			if (!s2.hasNextInt()) {
				s2.next();
				System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
				continue;
			}
			ndx = s2.nextInt();
			if (ndx==0) break;
			if (ndx==-1) {
				System.out.println("주문 내역 전체 삭제를 진행하시겠습니까? [0 : 뒤로 , 1 : 진행]");
				if (!s2.hasNextInt()) {
					s2.next();
					System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
					continue;
				}
				ndx = s2.nextInt();
				if (ndx == 0) continue;
				else if (ndx == 1) {
					alName.clear();
					alQty.clear();
					alSum.clear();
					System.out.println("주문 내역 전체 삭제가 완료되었습니다.");
					continue;
				}
			} else {
				System.out.println("잘못된 키가 입력되었습니다!");
			}
			if (ndx>alName.size()) {
				System.out.println("주문번호 "+ndx+"번은 존재하지 않습니다. 확인 후 다시 입력해주세요.");
				continue;
			}
			if (ndx!=0) {
				System.out.println(ndx+"번 주문 내역 삭제를 진행하시겠습니까? [0 : 뒤로 , 1: 진행]");
				if (!s2.hasNextInt()) {
					s2.next();
					System.out.println("잘못된 키가 입력되었습니다! 주문 내역을 출력합니다.");
					continue;
				}
				System.out.println("-선택한 주문 번호의 주문 내역- ");
				System.out.println("메뉴명 : " + alName.get(ndx-1) + "\n수량 : " + alQty.get(ndx-1) + "\n가격 : " + alSum.get(ndx-1));
				x = s2.nextInt();
				if (x==0) continue;
				if (x==1) {
					alName.remove(ndx-1);
					alQty.remove(ndx-1);
					alSum.remove(ndx-1);
					System.out.println(ndx+"번 주문 내역이 삭제되었습니다.");
				}
			}
		}
	}
	
}