import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		
		if (score>=60)
		{
			System.out.println("�հ�");
		}
			if (score>=90)
			{
				System.out.println("��");
			}
			else if (score>=80)
			{
				System.out.println("��");
			}
			else if (score >=70)
			{
				System.out.println("��");
			}
			else if (score >=60)
			{
				System.out.println("��");
			}
		else
		{
			System.out.println("���հ�");
		}
	}
}