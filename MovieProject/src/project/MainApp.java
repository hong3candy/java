package project;

import java.util.*;
import java.io.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("=======��ȭ���α׷��� �����մϴ�======");
		System.out.println("===============================");
		System.out.println("1.����� ������ 2. ������ ������ 3.���α׷� ����");
		
		int pass = 1234;
		int pswd;
		int ma = sc.nextInt();
		UserMenu um;
		AdminMenu am;
		um = new UserMenu();
		am = new AdminMenu();
		
		switch(ma)
		{
		case 1:
			while(true)
			{
				um.printMenu(sc);
				break;
			}
		case 2:
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			pswd = sc.nextInt();
			if(pswd == pass)
			{
				while(true)
				{
					am.printMenu(sc);
					break;
				}
			}
			else
			{
				System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				break;
			}
		case 3:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}

}

interface Menu
{
	
}

abstract class AbstractMenu
{
	
}

class UserMenu
{
	private int user1;
	private int ur;
	private int cr;
	private int cr2;
	
	void printMenu(Scanner sc)
	{
		System.out.println("1.��ȭ���� 2.����Ȯ�� 3.�������");
		user1 = sc.nextInt();
		
		switch(user1)
		{
		case 1:
			System.out.println("������ ��ȭ�� �����ϼ���.");
			Movie m2;
			m2 = new Movie();
			m2.movielist();
			ur = sc.nextInt();
			break;
		case 2:
			System.out.println("���Ź�ȣ�� �Է��ϼ���.");
			cr = sc.nextInt();
			break;
		case 3:
			System.out.println("���Ź�ȣ�� �Է��ϼ���.");
			cr2 = sc.nextInt();
			break;
		}
	}
}

class AdminMenu
{
	private int admin1;
	private int am;
	private int dm;
	
	void printMenu(Scanner sc)
	{
		System.out.println("1.��ȭ��� 2.��ȭ��� 3.��ȭ���� 4.���θ޴�");
		admin1 = sc.nextInt();
		
		switch(admin1)
		{
		case 1:
			System.out.println("����� ��ȭ�� ��ǥ���� �Է��ϼ���.");
			am = sc.nextInt();
			break;
		case 2:
			System.out.println("��ȭ����� ����մϴ�.");
			Movie m;
			m = new Movie();
			m.movielist();
			break;
		case 3:
			System.out.println("������ ��ȭ��ǥ���� �Է��ϼ���");
			dm = sc.nextInt();
			break;
		case 4:
			System.out.println("���θ޴��� �̵��մϴ�.");
			break;
		}
	}
}

class Movie
{
	ArrayList<String> movies = new ArrayList<String>();
	
	public void addmovie(Scanner sc) {
		long Ts = System.currentTimeMillis();
		System.out.println("�߰��� ��ȭ ������ �Է��ϼ���.");
		String mn = sc.next();
		System.out.println("�߰��� ��ȭ�� �帣�� �Է��ϼ���.");
		String g = sc.next();
		
		
	}
	
	public void deletemovie() {
		try {
			
		}catch(Exception e) {
			
		}
	}
	
	public void movielist() {
		try {
			File movieText = new File("C:/Users/student/desktop/Movies.txt");
			FileReader movieReader = new FileReader(movieText);
			BufferedReader br = new BufferedReader(movieReader);
			String aLine = "";
			while((aLine = br.readLine()) != null) {
				movies.add(aLine);
			}
			br.close();
			for(int i=0; i<movies.size(); i++) {
				System.out.println((i+1)+"��° ��ȭ : " + movies.get(i));
			}
		}catch(Exception e) {
			
		}
	}
	
	public void savemovie() {
		try {
			BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream("C:/Users/student/desktop/Movies.txt"));
			
			//bs.write(getBytes(movies));
		}catch(Exception e) {
			
		}
	}
}

class Reservation
{
	
}
class Seats
{
	
}