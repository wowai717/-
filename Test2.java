import java.util.Scanner;

public class Test2 {
   public static void main(String[] args) {
       // floatingliteral();
       // priceCalculate();
       // CircleArea();
       //BMICalculator();
       //CurrencyConverter();
       //DiagonalCalculator();
       //charTest();
       caseConverter();
    }
    public static void floatingliteral() {
        // 146.91
        //float v1 = 146.91f;
        double v1 = 146.91; // <-일반표기법
        // 1.4691 곱하기 10의 2승 <-지수표기법
        double v2 = 1.4691E+2;
        double v3 = 1.4691E2;
        double v4 = 1.4691e2;
        double v5 = 0.14691E3;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
    public static void priceCalculate() {
        //여러 물건의 가격을 더해 총 비용을 계산
        double item1 = 19.99;
        double item2 = 5.49;
        double item3 = 3.50;
        double total1 = item1 + item2 + item3;
        System.out.println(total1);        
    }
    public static void CircleArea() {
        double radius = 7.5; //반지름
        //원의 면적 = 파이 * r^2
        double area = Math.PI *radius * radius; 

        System.out.println("Area of the circle " + area);
    }
    public static void BMICalculator() {
        //BMI 계산
        double weight = 65.0; //몸무게(kg)
        double height = 1.75; //키(cm)
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
    public static void CurrencyConverter() {
        //금액을 다른 통화로 변환 
        double usdToKrw = 1330.50;
        double dollars = 100.0;
        double won = dollars * usdToKrw;

        System.out.println("$" + dollars + " is " + won + "KRW.");
        
    }
    public static void DiagonalCalculator() {
        //사각형의 대각선 길이
        double width = 5.0; //가로길이
        double height = 12.0; //세로길이
        double diagonal = Math.sqrt(width * width + height * height); 
        System.out.println("The diagonal length is: " + diagonal);
    }

    public static void charTest() {
        //char ch1 = '가'; //큰따옴표 금지 작은거
        //char ch2 = '\uac00'; // \uac00 하면 문자로 인식
        System.out.println("유니코드값을 나타내기 위해서는"); 
        System.out.println("안녕하세요\\b");
        System.out.println("캐리지리턴\\r" + "입니다.");
        System.out.println("안녕하세요? \n" + "홍길동 입니다.");
        System.out.println("자바에서 문자는 작은 따옴표('')로 감싸줍니다.");
        System.out.println("자바에서 문자열은 큰 따옴표(\"\")로 감싸줍니다");
        //int v = ch2;
        // System.out.println(" v: " + v)
        
    }
    public static void caseConverter() {
        //Uppercase -> Lowercase
        //Lowercase -> Uppercase
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);  // 사용자가 입력한 첫 번째 문자를 받음
        
            if (ch >= 'A' && ch <= 'Z') {  // 대문자인 경우
                ch = (char) (ch + 'a' - 'A');  // 대문자를 소문자로 변환
            } else if (ch >= 'a' && ch <= 'z') {  // 소문자인 경우
                ch = (char) (ch + 'A' - 'a');  // 소문자를 대문자로 변환
            }
        
            System.out.println("Converted character: " + ch);
            scanner.close();  // 스캐너 닫기
        }
    }
        
//c에 저장된 문자가 대문자이면 소문자로
        // 소문자이면 대문자로 변경하고자 한다.
        /*if (c가 대문자이면) {
            소문자로 변환
        } else if (c가 소문자이면){
            대문자로 변환 
        }*/
        //문자는 컴퓨터 내부에 숫자로 저장된다.
        //모드 문자는 유일한 유니코드 갑싱 부여되어 있다.
        //영어 알파벳은 사전 순서로 값이 1씩 증가하는 값으로 부여되어있다.
        // 즉, 'a'는 유니코드 값 0061 'b'는 0062 ...
        //'A' 는 유니코드 값 0041, 'B'는 0042