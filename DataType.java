public class DataType {
    public static void main(String[] args) {
        //int 자료형의 최소값과 최대값
        System.out.println("int 자료형의 최소값" + Integer.MIN_VALUE);
        System.out.println("int 자료형의 최대값" + Integer.MAX_VALUE);

        //long 자료형의 최소값과 최대값 (long.MIN.VALUE,long.MAX.VALUE )
        System.out.println("long 자료형의 최소값" + Long.MIN_VALUE);
        System.out.println("long 자료형의 최대값" + Long.MAX_VALUE);

        //Short 자료형
        System.out.println("short 자료형의 최소값" + Short.MIN_VALUE);
        System.out.println("short 자료형의 최소값" + Short.MIN_VALUE);

        //Byte 자료형
        System.out.println("long 자료형의 최소값" + Byte.MIN_VALUE);
        System.out.println("long 자료형의 최소값" + Byte.MIN_VALUE);

        //자바는 기초 자료유형 8개에 대응하는 Wrapper class를 정의 하고 있다
        int Age = 10;
        Integer myAge = 20;
        
        /*자바의 기초자료유형(primitive data type)의 유형은 
          4가지 이고 총 8개가 존재한다
          1. 정수형 : byte, short, int, long
          2. 실수형 : float , double
          3. 논리형 : boolean
          4. 문자형 : char
          각 기초 자료유형에 대응되는 Wrapper class는 다음과 같다.
          byte : Byte, short : Short, int : Intger, long : Long
          float : Float, double : Double
          boolean : Boolean
          char : Char
        */

        // 자료유형과 관련해서 중요한 포인트는 
        // 1. 자료유형에 따라 저장할 수 있는 값의 종류가 다르다.
        // 2. 자료유형에 따라 수행할 수 있는 연산의 종류도 다르다.

        int value = 100;
        System.out.println("value : " + value);

        // 리터럴 (literal) 은 값 자체를 의미
        // 예 : 정수 리터럴은 10진수, 2진수(0b), 8진수(0), 16진수(0x)로 나타낼 수 있다
        // 10진수 100을 2진수로 나타내면 0b1100100

        value = 0b1100100;
        System.out.println("value : " + value);

        //10 진수 100을 8진수로 나타내면
        value = 0144;
        System.out.println("value : " + value);

        //10 진수 100을 16진수로 나타내면 16*6 + 4 
        value = 0x64;
        System.out.println("value : " + value);

        long lightSpeed = 300000;
        // 1초 30만 km * 60초 * 60 분 * 24시간 * 365일
        long distance = lightSpeed * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년동안 이동하는 거리: " + distance);
        //int 로 하면 오버플로우 됨 

        //원의 면적을 구하는 식: 파이 * 반지름의 제곱
        //파이는 3.141592
        //자바에 실수 리터럴은 내부적으로 double로 처리한다. float 하면 오류 f붙이면 오류 안남
        //float pi = 3.141592f;
        double pi = 3.141592;
        double raidus = 5.0;
        double area = pi * raidus * raidus;
        System.out.println("원의 면적은 " + area + " 입니다.");
    }
}
