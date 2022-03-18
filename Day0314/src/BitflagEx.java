
public class BitflagEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag1 = 0b00000001;
		byte flag2 = 0b00000010;
		byte flag3 = 0b00000100;
		byte flag4 = 0b00001000;
		
		byte result = 0b00000000;
		
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
		
		result=(byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
		
		result=(byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));
		
		result=(byte)(result & ~flag1);
		System.out.println(Integer.toBinaryString(result));
	}

}
