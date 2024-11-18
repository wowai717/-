
import java.util.Random;
import java.util.Scanner;

public class Banbok {

    public static void main(String[] args) {
        //dowhileTest01();
        //whileTest01();
        //Gcd();
        //forTest01();
        //divisors();
        //sumRandomNumber();
        //nestedLoopTest01();
        //nestedLoopTest02();
        breakTest01();
    }

    public static void whileTest01() {
        Scanner input = new Scanner(System.in);
        int month = 0;
        System.out.println("올바른 월은 입력하시오 [1 - 12] :");
        month = input.nextInt();

        while (month < 1 || month > 12) {
            System.out.println("올바른 월은 입력하시오 [1 - 12] :");
            month = input.nextInt();
        }

        System.out.println("입력한 월은 : " + month + "입니다.");
        input.close();
    }

    public static void dowhileTest01() {
        Scanner input = new Scanner(System.in);
        int month = 0;
        do {
            System.out.println("올바른 월은 입력하시오 [1 - 12] : ");
            month = input.nextInt();

        } while ((month < 1 || month > 12));   // or 를 사용해서 두 연산자중 하나라도 true라면. 반복

        System.out.println("입력한 월은 : " + month + "입니다.");
    }

    public static void Gcd() {
        /* 두 수 가운데 큰 수르르 x, 작은 수를 y
         * 
         * 
         * 1.y 가 0 이면 최대 공약수는 x 이다.
         * 2. r <- x %y
         * 3. x <- y
         * 4. y < - r
         */
        Scanner input = new Scanner(System.in);
        System.out.println("첫 번째 정수: ");
        int x = input.nextInt();
        System.out.println("두 번째 정수: ");
        int y = input.nextInt();
        int r = 0;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println("최대 공약수는 " + x + "입니다.");
        input.close();
    }

    public static void forTest01() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("프로그램을 종료합니다.");

    }
    public static void divisors(){
        Scanner input = new Scanner(System.in);
        System.out.println("양의 정수를 입력하시오: ");
        int n = input.nextInt();
        /*
         *  i는 1부터 n까지 증가시키면서, n을 i 로 나눴을때 나머지가 0인 i를 출력
         *  카운터 변수 i = 1 로 초기화
         *  반복 조건식 i <= n
         *  증강식 i = i+1; // i++ 
         *  
         */
        for (int i = 1; i < n; i ++) {
            // n 이 i로  나눠지면 그 i를 출력 
            if (n % i == 0)
                System.out.println(i+" ");
        }
        input.close();
    }
    public static void isPrimneNumber(){  // 시험 문제 나올 수 있음 숙제? 함 해봐라
        // 사용자로부터 정수를 입력받아 그 수가 prime number(소수)인지 여부를 판단하는 프로그램
        Scanner input = new Scanner(System.in);

    }

    public static void sumRandomNumber(){
        // 사용자가 입력한 갯수 만캄의 난수를 생성하고, 그들의 합을 구하자
        Random generator = new Random(System.currentTimeMillis());
        // Random generator = new Random();
        //System.out.println(System.currentTimeMillis());
        Scanner input = new Scanner(System.in);
        System.out.print("난수의 개수: ");
        int count = input.nextInt();
        int num = 0;
        int sum = 0;
        for (int i = 0; i < count; i ++) {
            num = generator.nextInt(100);   // 0이상 100 미만의 정수를 랜덤 생성
            System.out.println(num + " ");
            //sum = sum + num;
            sum += num;
        }
        System.out.println("난수의 합: " + sum);
        input.close();

    }
    public static void nestedLoopTest01(){
        /*for (int i = 0; i < 5; i ++){
            System.out.println("***********");
        }
        /*
         * *을 한번밖에 못찍으면?
         */
       /* int n = 5;
        for (int i = 0; i < n; i ++){
            System.out.println();
        }*/

        for(int j = 0; j < 10; j++)
            System.err.print("*");
    }

    public static void nestedLoopTest02(){
        int n = 5; //사용자가 5를 입력했다고 가정
        for (int i = 0; i < n; i ++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //중첩 for문 사영 직각 삼격형 출력
        //n = 5이면
        /*
         * *
         * **
         * ***
         * ****
         * *****
         * n = 3이면
         * *
         * **
         * ***
         */
       
    }
    public static void breakTest01() {
        int totoal = 0;
        int count = 0;
        int grade = 0;

        Scanner input = new Scanner(System.in);
        // 사용자가 0 이상의 값을 입력하는 동안 그 값을듸 합을 구하고
        // 최종적으로 평균을 출력하자
        while(true){// 무한 루프, 인피니티 루프
            // 사용자로부터 정수값을 입력받자 
            System.out.println("정수를 입력하시오 : ");
            grade = input.nextInt();
            
            //0 보다 작은 값이면 break 문을 실행해 loop 를 빠져나가자
            if (grade < 0 ) break;
            // 0 보다 큰 값이면 그 값을 total에 누적시키고 count 를 1 증가 시키자
            totoal += grade;
            count++;
        }  
        int avg = count > 0? totoal/count:0;
        System.out.println("평균" + avg);
        System.out.println("프로그램을 종료합니다~");
        input.close();
    }
}
