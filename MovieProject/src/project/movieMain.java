package project;

import java.util.Scanner;

public class movieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("=======��ȭ���α׷��� �����մϴ�======");
		System.out.println("===============================");
		System.out.println("1.����� ������ 2. ������ ������ 3.���α׷� ����");
		
		int pswd = 1234;
		int mainmenu = sc.nextInt();
		
		if(mainmenu==1)
		{
			System.out.println("����� �������� �̵��մϴ�.");
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
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			int adminmenu = sc.nextInt();
			if(adminmenu==pswd)
			{
				System.out.println("�������������� �̵��մϴ�.");
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
				System.out.println("��й�ȣ �����Դϴ�.");
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
		System.out.println("1.��ȭ��� 2.��ȭ��� 3.��ȭ���� 4.���θ޴�");
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
		System.out.println("1.��ȭ���� 2.����Ȯ�� 3.�������");
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

