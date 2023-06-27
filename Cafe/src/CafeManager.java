import java.util.Scanner;

public class CafeManager {
	public static void main(String[] args) {
		
		Menu myMenu = new Menu();
		Sales sales = new Sales();
		Order order = new Order();
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
			System.out.println("작업을 선택해주세요. [m:메뉴관리, o:주문, s:매출액보기, enter:프로그램 종료]");
			String job = s1.nextLine();
			if(job.equals("")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(job.equals("m")) {
				myMenu.control();
			}else if(job.equals("o")) {
				order.control(myMenu);
				sales.add(order);
			}else if(job.equals("s")) {
				sales.display();
			}else {
				System.out.println("잘못된 키를 입력하셨습니다!");
				continue;
			}
		}
		s1.close();
		System.out.println("카페 관리 프로그램을 종료합니다.");
	}
}
