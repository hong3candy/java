package project;

import java.util.*;
import java.io.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("=======영화프로그램을 실행합니다======");
		System.out.println("===============================");
		System.out.println("1.사용자 페이지 2. 관리자 페이지 3.프로그램 종료");
		
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
			System.out.println("비밀번호를 입력하세요.");
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
				System.out.println("잘못된 비밀번호입니다.");
				break;
			}
		case 3:
			System.out.println("프로그램을 종료합니다.");
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
		System.out.println("1.영화예매 2.예매확인 3.예매취소");
		user1 = sc.nextInt();
		
		switch(user1)
		{
		case 1:
			System.out.println("예매할 영화를 선택하세요.");
			Movie m2;
			m2 = new Movie();
			m2.movielist();
			ur = sc.nextInt();
			break;
		case 2:
			System.out.println("예매번호를 입력하세요.");
			cr = sc.nextInt();
			break;
		case 3:
			System.out.println("예매번호를 입력하세요.");
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
		System.out.println("1.영화등록 2.영화목록 3.영화삭제 4.메인메뉴");
		admin1 = sc.nextInt();
		
		switch(admin1)
		{
		case 1:
			System.out.println("등록할 영화의 대표값을 입력하세요.");
			am = sc.nextInt();
			break;
		case 2:
			System.out.println("영화목록을 출력합니다.");
			Movie m;
			m = new Movie();
			m.movielist();
			break;
		case 3:
			System.out.println("삭제할 영화대표값을 입력하세요");
			dm = sc.nextInt();
			break;
		case 4:
			System.out.println("메인메뉴로 이동합니다.");
			break;
		}
	}
}

class Movie
{
	ArrayList<String> movies = new ArrayList<String>();
	
	public void addmovie(Scanner sc) {
		long Ts = System.currentTimeMillis();
		System.out.println("추가할 영화 제목을 입력하세요.");
		String mn = sc.next();
		System.out.println("추가할 영화의 장르를 입력하세요.");
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
				System.out.println((i+1)+"번째 영화 : " + movies.get(i));
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