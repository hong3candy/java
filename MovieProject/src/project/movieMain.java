package project;

import java.util.Scanner;

public class movieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("=======영화프로그램을 실행합니다======");
		System.out.println("===============================");
		System.out.println("1.사용자 페이지 2. 관리자 페이지 3.프로그램 종료");
		
		int pswd = 1234;
		int mainmenu = sc.nextInt();
		
		if(mainmenu==1)
		{
			System.out.println("사용자 페이지로 이동합니다.");
			UserPage up;
			up = new UserPage();
			while(true)
			{
				up.printMenu(sc);
				up.menu();
				if (up.isExit() == true)
				{
					break;
				}
			}
			
		}
		else if(mainmenu==2)
		{
			System.out.println("비밀번호를 입력하세요.");
			int adminmenu = sc.nextInt();
			if(adminmenu==pswd)
			{
				System.out.println("관리자페이지로 이동합니다.");
				AdminPage ap;
				ap = new AdminPage();
				while(true)
				{
					ap.printMenu(sc);
					ap.menu();
					if (ap.isExit() == true)
					{
						break;
					}
				}
			}
			else
			{
				System.out.println("비밀번호 오류입니다.");
			}
		}
	}

}

class AdminPage
{
	private int adminmenu2;
	private boolean exit;
	
	public boolean isExit()
	{
		return exit;
	}
	
	void printMenu(Scanner sc)
	{
		System.out.println("1.영화등록 2.영화목록 3.영화삭제 4.메인메뉴");
		adminmenu2 = sc.nextInt();
	}
	
	void menu()
	{
		switch(adminmenu2)
		{
			case 1:
				MovieReservation mr;
				mr = new MovieReservation();
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
		}
	}
}

class UserPage
{
	private int usermenu;
	private boolean exit;
	
	public boolean isExit()
	{
		return exit;
	}
	
	void printMenu(Scanner sc)
	{
		System.out.println("1.영화예매 2.예매확인 3.예매취소");
		usermenu = sc.nextInt();
	}
	
	void menu()
	{
		switch(usermenu)
		{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
		}
	}
}

