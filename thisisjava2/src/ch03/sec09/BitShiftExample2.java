package ch03.sec09;

public class BitShiftExample2 {
	public static void main(String[] args) {
		int value = 772; //[00000000] [00000000] [00000011] [00000100]
		
		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);
		//byte형태로 형변환 시켰기 대문에 끝 1byte만 읽음
		//255는 [11111111]이므로 &(논리곱)을 하면 [00000000]이 된다.
		
		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값: " + int2);
		
		//우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011]
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호 없는 값: " + int3);
		
		//끝 1바이트만 읽음: [00000100]
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 바이트 부호 없는 값: " + int4);
		
		byte b = -128;
		System.out.println(b >> 1);
		// [1000 0000] > [1100 0000] = -64
	}
}
