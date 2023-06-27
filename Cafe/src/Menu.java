import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;
	private Scanner text;
	private Scanner num;
	private String job;
	private String filename;
	
	Menu(){
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.text = new Scanner(System.in);
		this.num = new Scanner(System.in);
		this.load("C:\\Temp\\menu.txt");
	}
	
	public String getName (int n) {
		return this.alMenu.get(n);
	}
	
	public int getPrice (int n) {
		return this.alPrice.get(n);
	}
	
	public int getMenuSize() {
		return this.alMenu.size();
	}
	
	void control() {
		while(true) {
			this.open();
			if (this.job.equals("")) { // enter를 누르면 저장 후 종료
				this.saveAndClose();
				break;
			} else if (this.job.equals("c")) { //메뉴 추가
				this.add();
			} else if (this.job.equals("r")) { //메뉴판 출력
				this.display();
			} else if (this.job.equals("u")) { //메뉴 수정
				this.update();
			} else if (this.job.equals("d")) { //메뉴 삭제
				this.delete();
			} else { // 메뉴에 해당되는 키가 아닌 다를 키를 눌렀을 때
				System.out.println("잘못된 키가 입력되었습니다 !");
				continue;
			}
		}
	}
	
	void load(String fname) {  // 기존 메뉴 불러오기
		this.filename=fname;
		try {
			File file = new File(this.filename);
			if (file.exists()) {
				BufferedReader inFile = new BufferedReader(new FileReader(file));
				String sLine=inFile.readLine();
				while(sLine!=null) {
					String[] ar = sLine.split(",");
					this.alMenu.add(ar[0]);
					this.alPrice.add(Integer.parseInt(ar[1]));
					sLine=inFile.readLine();
				}
				inFile.close();
			} 
			file=null;
			System.out.println("메뉴를 불러왔습니다.");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("메뉴를 불러오지 못했습니다.");
		}
	}
	
	void open() { // 초기 화면
		System.out.println("진행할 작업을 선택해주세요.\n[c:메뉴 추가, r:메뉴판 보기, u:메뉴 수정, d:메뉴 삭제, enter:초기화면]");
		this.job=this.text.nextLine();
	}
		
	void add() { // 메뉴 추가
		while (true) {
			System.out.println("[1: 메뉴 추가 시작, 0: 뒤로 가기]");
			if (!num.hasNextInt()) {
				num.next();
				System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
				continue;
			}
			int a = num.nextInt();
			if (a!=0 && a!=1) {
				System.out.println("올바른 번호를 입력해주세요.");
			}
			if (a==0) break;
			if (a==1) {
				while(true) {
					System.out.println("추가할 메뉴명을 입력해주세요. [enter: 메뉴 추가 종료]");
					String menu = text.nextLine();
					if(menu.equals("")) {
						System.out.println("메뉴 추가를 종료합니다.");
						break;
					}
					System.out.println("해당 메뉴의 가격을 입력해주세요. [enter: 보류 (보류시 0원 처리)]");
					String str = text.nextLine();
					int price = (str.equals(""))?0:Integer.parseInt(str);
					alMenu.add(menu);
					alPrice.add(price);
				System.out.println("메뉴 추가가 완료되었습니다.");
				}
			}
		}
	}
		
	void display() { // 메뉴판 출력
		System.out.println("ㅣ-----------Menu-----------ㅣ");
		for(int ndx=0 ; ndx<alMenu.size() ; ndx++) {
			System.out.printf("%2d %-15s %7d",ndx+1,alMenu.get(ndx),alPrice.get(ndx));
			System.out.println("원");
		}
		System.out.println("");
	}
		
	void update() { // 메뉴 수정
		while(true) {
			this.display();
			int ndx,x;
			System.out.println("수정할 메뉴번호를 입력해주세요. [0:나가기]");
			if (!num.hasNextInt()) {
				num.next();
				System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
				continue;
			}
			ndx=num.nextInt();
			if(ndx==0) break;
			if(ndx!=0) {
				while(true) {
				if (ndx>alMenu.size()) {
					System.out.println(ndx+"번 메뉴는 존재하지 않습니다. 다시 입력해주세요.");
					break;
				}
				System.out.println(ndx+"번 메뉴 수정을 시작합니다.\n"+ndx+"번 메뉴 : "+alMenu.get(ndx-1));
				System.out.println("메뉴 수정을 진행하시겠습니까? [0: 뒤로 가기, 1: 진행]");
				if (!num.hasNextInt()) {
					num.next();
					System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
					continue;
				}
				x=num.nextInt();
				if (x==0) break;
				if (x!=0 && x!=1) {
					System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				if (x==1) {
					System.out.println("현재 메뉴 이름 : "+alMenu.get(ndx-1));
					System.out.println("변경할 메뉴 이름을 입력해주세요.");
					String menu = text.nextLine();
					System.out.println("현재 가격 : "+alPrice.get(ndx-1));
					System.out.println("변경할 메뉴 가격을 입력해주세요.");
					int price = num.nextInt();
					alMenu.set(ndx-1,menu);
					alPrice.set(ndx-1, price);
					System.out.println(ndx+"번 메뉴 수정이 완료되었습니다.");
					System.out.println("수정한 메뉴 번호 : "+ndx+"\n수정 후 메뉴 : "+alMenu.get(ndx-1)+"\n수정 후 가격 : "+alPrice.get(ndx-1));
				}
				break;
				}
			}	
		}
	}
		
	void delete() { //메뉴 삭제
		while(true) {
			this.display();
			int ndx,x;
			System.out.println("삭제할 메뉴 번호를 입력해주세요. [0:나가기]");
			if(!num.hasNextInt()) {
				num.next();
				System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
				continue;
			}
			ndx=num.nextInt();
			if (ndx==0) break;
			if (ndx!=0) {
				while(true) {
				if(ndx>alMenu.size()) {
					System.out.println(ndx+"번 메뉴는 존재하지 않습니다. 다시 입력해주세요.");
					break;
				}
				System.out.println(ndx+"번 메뉴 삭제를 시작합니다. 진행하시겠습니까? [0:뒤로 가기, 1:진행]");
				System.out.println("삭제하려는 메뉴 :"+alMenu.get(ndx-1));
				if(!num.hasNextInt()) {
					num.next();
					System.out.println("잘못된 키가 입력되었습니다! 다시 입력해주세요.");
					continue;
				}
				x=num.nextInt();
				if (x==0) break;
				if (x!=0 && x!=1) {
					System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				if (x==1) {
					System.out.println(ndx+"번 메뉴 삭제가 완료되었습니다.");
					System.out.println("삭제된 메뉴 : "+alMenu.get(ndx-1));
					alMenu.remove(ndx-1);
					alPrice.remove(ndx-1);
				}
					break;
				}
			}
		}
	}
		
	void saveAndClose() { // 변경사항 저장 후 종료
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename));
			for(int i = 0; i<alMenu.size(); i++) {
				String sLine=alMenu.get(i)+","+alPrice.get(i);
				if(i!=alMenu.size()-1)
					sLine+="\n";
					bw.write(sLine);
			}
			bw.flush();
			bw.close();
			System.out.println("저장이 완료되었습니다.");
			System.out.println("메뉴 관리 프로그램을 종료합니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류로 인해 저장에 실패했습니다.");
		}
	}
}	

