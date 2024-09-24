import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        //morningTest1(args);
        basicDataTypes();
    }
    public static void morningTest1(String[] args) {
        System.out.println("아침에 일어나는 것이 쉽습니까? (예/아니요)");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.next();  
        //자바에서 문자열 비교 == 를 사용하지 않는다
        // 3 == 4
        // answer1 == "예" ; => NOKㅏ
        // 문자열 객체의 equal() 메서드 또는
        // equalsIgnoreCase() 메서드를 사용해야 한다
        boolean isEasyToWakeUp = answer1.equals("예");

        //질문 2 아침 식사를 매일 하십니까?
        System.out.println("아침식사를 매일 하십니까?(예/아니요)");
        String answer2 = scanner.next();
        boolean hasBreakfastDaily = answer2.equals("예");

        //질문 3 주말에도 일찍 일어납니까?
        System.out.println("주말에도 일찍 일어나십니까?(예/아니요)");
        String answer3 = scanner.next();
        boolean wakUpEarlyOnWeekends = answer3.equals("예");

        // int a = 3, b=4, c=10;
        // int sum = a + b + c;
        // && :논리곱 연산자(logical-and operator)
        //                => 피연산자 값이 모두 ture 이면 ture를 반환
        // 3 + 4 => 연산자 '+'. 피연산자는 3, 4

        boolean isMorningPerson = isEasyToWakeUp && hasBreakfastDaily && wakUpEarlyOnWeekends;
        
        //결과 출력
        if (isMorningPerson == true) {
            System.out.println("당신은 아침형 인간입니다.");
        } else {
            System.out.println("당신은 아침형 인간이 아닙니다.");
        }
        
    }

    public static void basicDataTypes() {
        //정수형 자료형
        byte byteValue = 127; 
        byteValue = 0x7f;     // -128 ~ 127   (-2의 7승)
        short shortValue = 32767;    // -32768 ~ 32767  (-2의 15승)
        int intValue = 2147483647;       // -2,147,483,648 ~ 2,147,483,647  (-2의 31승)
        long longValue = 9223372036854775807L;    // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (-2의 63승)
        
        //실수형 자료형
        float floatValue = 3.14f;    // 3.4e-038 ~ 3.4e+038 
        floatValue = 0.314e1f;
        double doubleValue = 3.14159265358979323846;    // 1.7e-308 ~ 1.7e+308
        doubleValue = 314.159265358979323846e-2;

        // 문자형 자료형
        char charValue = 'A';   // 0 ~ 65535
        //System.out.println(charValue);
        charValue = '\u0041';   // 유니코드 값으로 문자를 표현
        //System.out.println(charValue);

        // 논리형 자료형
        boolean booleanValue = true;    // true, false 1비트 크기

        //각 변수의 값을 출력
        System.out.println("byte 자료형 : " + byteValue);
        System.out.println("short 자료형 : " + shortValue);
        System.out.println("int 자료형 : " + intValue);
        System.out.println("long 자료형 : " + longValue);
        System.out.println("float 자료형 : " + floatValue);
        System.out.println("double 자료형 : " + doubleValue);
        System.out.println("char 자료형 : " + charValue);
        System.out.println("boolean 자료형 : " + booleanValue);
        
    }

    
}