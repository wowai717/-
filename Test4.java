import java.util.Scanner;

public class Test4 {
    
    public static void main(String[] args) {
        //calculateTime();
        //int x = expressionTest2();
        //System.out.println("expressionTest2 호출 결과 :" + x);
        //expressionTest3();
        //LeapYear();
        //compareTwoNumbers();
        //typeconversion();
        //operatorPrecedece();
        QuadraticEq();
    }
    public static void VariableNameGame() {
        //잘못된 변수 이름들
        //String 1stName = "John";   // 숫자로 시작
        //String last-name = "Doe";  //하이픈 포함
        //String class = "physics";  //예약어 사용
        //string @ge = "25";          //특수문자 포함
        
        //올바른 변수 이름으로 수정
        //String firstName = "John";
        //String lastName = "Doe";
        //String className = "physics";
        //String age = "25";

    }

    public static void calculateTime() {
        //빛의 초당 이동거리를 나타내는 상수 정의
        //final double light_speed = 30000;
        final double LIGHT_SPEED = 3e5 ;                    //지수표기법
        
        final double DISTANCE_TO_PROXIMA_CENTAURI = 40e12; 

        // 프록시마 센타우리까지의 거리를 빛에 속도로 나누면
        // 그 행성까지 가기 위한 소요되는 초가 계산된다.

        double seconds_elapsed = DISTANCE_TO_PROXIMA_CENTAURI / LIGHT_SPEED;

        // 소요되는 초가 몇년에 해당되는지를 계산하기 위해서는
        // seconds_elapsed / (1년에 해당하는 초)

        double light_year = seconds_elapsed / (60*60*24*365);
        // 10/2*3*2 = 30
        System.out.println(10/2*3*2);
        // 10/(2*3*2) = 10.0/12.0 = 0.82; <-
        System.out.println(10/(2*3*2));
        System.out.println(10.0/(2*3*2));  
        
        System.out.println("센타우리까지는 " + light_year + "광년이 걸립니다.");
    }

    public static void expressionTest(){
        int x = 10;
        System.out.println(x);
        int y = 20;
        System.out.println(x + y);
    }

    public static int expressionTest2(){
        int x = 10, y=40;
        return x+y;
    }

    public static void expressionTest3(){
        // 연산자 (operator) 는 특정한 연산을 나타내는 기호 : + ,- , *, /, % 등
        // 피연산자(operand) 는 연산의 대상
        
        /* int radius = 120;
         * 3.14 * radius ; <-expression
         * -> 연산자 : *
         * -> 피연산자 : 3.14, radius
         */
        
         int x = 5;
         System.out.println("x - 10의 값: " + (x - 10));
         int y = 3;
         int sum;
        
         System.out.println("x+y의 값: " + x+y);
         String str2 = "x+y의 값" + x + y;
         System.out.println("str2: " + str2 );

         int val = x + y;
         System.out.println("val: " + val);
         System.out.println("sum=x+y의 값: " + (sum=x+y));
         System.out.println("12/5:" + (12/5));
         System.out.println("12.0/5:" + (12.0/5));
         System.out.println("12.0/5.0:" + (12.0/5.0));
         //System.out.println("12/0:" (12/0));
         System.out.println("12%5:" + (12%5));
    }

    public static void LeapYear(){
        boolean isLeapyear;
        /*
         * 윤년은 2월이 29일까지 있는 해이다
         * 1. 연도가 4로 나누어떨러지면 윤년이다
         * 2. 단. 그 연도가 100으로 나누어 떨어지면 윤년이 아니다
         * 3. 하지만 그 연도가 400으로 나누어 떨어지면 윤년이다
         * 
         */
        /* 
        if(year가 4로 나누어 떨어지면){
            if(year가 100으로 나누어 떨어지지 않거나 400으로 나누어떨어지면) {
                윤년이다
            }
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("윤년인지 여부를 검사할 연도를 입력하세요.");
        int year = scanner.nextInt();

        // 입력한 년도가 윤년인지 여부를 나타내는 변수
        boolean isLeapYear = false;

        // year % 4 == 0 이면서 (year % 100 != 0 이거나 year % 400 == 0)
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + "년은 윤년입니다");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다");
        }
      }

    

    public static void increaseDecreaseOp(){
        //증감 연산자
        int x = 0;
        System.out.println("x - x+1: " + (x = x + 1));
        System.out.println("x : " + x);
        //여기까지 왔을때 x의 값은 1
        System.out.println("x ++ : " + x++);
        System.out.println("X: " + x);
        // postfix ++ 연산자는 피연산자의 원래 값을 1증가 시키고
        //피연연산자의 원래 값을 반환함
        // 여기까지 왔을 때 x의 값은 2 

        System.out.println("x-- : " + x--);
        System.out.println("x : " + x);
        //postfix -- 연산자는 피연산자의 값을 1감소시킴
        //피연산자의 원래 값을 반환

        //여기까지 왔을때 x의 값은 1
        System.out.println("++x : " + ++x);
        System.out.println("x : " + x);
        //prefix ++ 연산자는 피연산자의 값을 1증가시키고
        //피연산자의 증가된 값을 반환함
        
        //여기까지 왔을때 x의 값은 2
        System.out.println("--x : " + --x);
        System.out.println("x : " + x);

        //prefix -- 연산자는 피연산자의 값을 1감소시키고
        //피연산자의 감소된 값을 반환함
    }

    public static void relativeOp(){
        //관계 연산자
        //같냐, 다르냐, 크냐, 작냐,
        //관계 연산의 결과는? ture 또는 false
    }

    public static void compareTwoNumbers(){
        /*
         * 두 정수를 입력 받는다. num1, num2
         * num1이 num2 보다 큰지 작은지 같은지를 출력해라.
         * 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        /*
         * num1이 num2보다 큰지 작은지 같은지를 출력
         * 
         * num1이 num2보다 크냐? num1 이 num2 보다 크다
         * 그렇지 않고 num1이 num2 보다 작냐? num1이 num2보다 작다
         * 그렇지 않으면 num1과 num2는 같다 
         */
        if (num1 > num2) {
            System.out.println(num1+ "이"+ num2 + "보다 크다");
    }
        else if (num1 < num2) {
            System.out.println(num1+ "이"+ num2 + "보다 작다");
    
    }
        else{
            System.out.println(num1+ "이"+ num2 + "와 같다");
    }
    }
    public static void logicalOp(){
        /*
         * 논리 연산자 : &&, ||, !
         */
        // 1. 키가 180 이상이고 몸무게가 80 이하면 몸좋다
        // 2. 키가 170 이하이거나 몸무게가 80이상이면 좀 아쉽네
        // 3. 키가 160 미만이 아니면 좋겠다.
        // int height, weight;
        // 1. if (height>=180 && weight <= 80) 몸좋다.
        // 2. if (height <= 170 || weight >= 80) 좀 아쉽네
              // 180, 81. 170,70
        // 3. if (height < 160) 좋겠다.
                //if (height >= 160) 좋겠다.
    }
    public static void fromlto100(){
        //정수를 입력받고, 그 수가 1에서 100사이의 값이면
        //1에서 100사이의 값이라고 출력하고
        // 그렇지 않으면 1에서 100사이의 값이 아닙니다.
        // 입력 받은 숫자가 짝수인지 혼자 인지 판별하라
    }


    public static void typeconversion() {
        int n = 1234556789;  // 정수 리터럴 2진수, 8진수, 10진수, 16진수로 나타낼 수 있음

        float f = n;

        System.out.println("n: " + n);
        System.out.println("f: " + f);

        long longValue = 123456789123456789L; 
        float floatValue = longValue;           // 4바이트로  long보다 float이 표현 범위가 넓다. 
        System.out.println("longValue: " + longValue); 
        System.out.println("floatValue: " + floatValue);

        //floatValue = longValue + 345.6;  // longtype value + double type value = double type value + double type value  형변환됨
                                           // 내부적으로 데이터 타입이 다름
        floatValue = longValue + 345.6f;   //f 붙이면 됨
        // 자동 형변환 예제 끝
        
        // 강제적인 형변환 예제 시작
        double doubleValue = 3.0;

        int intValue = (int) doubleValue;
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValue: " + intValue);
        // 강제적인 형변환 예제 끝
        floatValue = 5/4;
        System.out.println("floatValue = 5/4: " + floatValue);

        doubleValue = (double)5/4;  //5를 더블 타입으로 변경 
        System.out.println("doubleValue = (double)5/4: " + doubleValue);
        
        intValue = (int)(1.3 + 1.8);
        System.out.println("intValue = (int)(1.3 + 1.8): " + intValue);

        intValue = (int)1.3 + (int)1.8;
        System.out.println("intValue = (int)1.3 + (int)1.8: " + intValue);
          // 강제적인 형변환 예제 끝
    }                                  

    public static void operatorPrecedece(){
        //예제 1 + * 연산자 우선순위
        int result1 = 10+3*2; //곱셈이 덧셈보다 우선
        System.out.println("10+3*2: " + result1);    // 10 + 6 -> 16

        //예제 2 괄호 사용 우선순위 변경
        int result2 = (10+3)*2; 
        System.out.println("(10+3)*2: " + result2);  // 13*2 -> 26

        //예제 3 나눗셈과 덧셈 
        int result3 = 10+6/2;
        System.out.println("10+6/2: " + result3);  // 10+3 -> 13

        //4예제 4 증강 연산자
        int val = 5;
        int result4 = ++val * 2;
        System.out.println("++val * 2: " + result4);  // 6*2 -> 12

        val = 5;
        result4 = val++ * 2;
        System.out.println("val++ * 2: " + result4);  // 5*2 -> 10

        //예제 5 논리 연산과 관계(비교) 연산의 우선순위
        boolean result5 = 10>5 && 3<2;  // 관계 연산이 논리 연산보다 우선
        System.out.println("10>5 && 3<2: " + result5); // true && false -> false

    }

    public static void QuadraticEq(){
        /*double b = -3.0;
        double c = 2.0;

        double disc = b * b - 4.0 * c;
        double sqr = Math.sqrt(disc);

        double root1 = (-b + sqr) / 2.0;
        double root2 = (-b - sqr) / 2.0;

        System.out.println("근은 " + root1 + "이고 " + root2 + "입니다.");  */

        Scanner scan = new Scanner(System.in);
        //1.b와 c를 입력받자 데이터 타입은? 정수로 입력받자
        System.out.println("x^2+bx+c 방정식의 b를 입력하시오: ");
        int b = scan.nextInt();
        System.out.println("x^2+bx+c 방정식의 c를 입력하시오: ");
        int c = scan.nextInt();
        
        //2. (-b + sqrt(b^2 - 4ac)) / 2
        double result1 = (-b + Math.sqrt(b*b-4*c))/2; //4. (int + double) / int -> (double + double) / double

        //3. (-b - sqrt(b^2 - 4ac)) / 2
        double result2 = (-b - Math.sqrt(b*b-4*c))/2;

        System.out.println("x^2" + b +"x + " + c + "의 첫번째 근 : " + result1);
        System.out.println("x^2" + b +"x + " + c + "의 두번째 근 : " + result2);
    }
    //x^2 + bc + c 의 근을 구하고자함
    //근의 공식:
    //         (-b + sqrt(b^2 - 4ac)) / 2
    //         (+b - sqrt(b^2 - 4ac)) / 2

}   
