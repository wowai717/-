
import java.util.Scanner;

public class arrayTest {
    public static void main(String[] args) {
        //test01();
        //int n = 10;
        //test02(n);
        //System.out.println(n);
        test03();

        /*int[]arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i] = i;
        }

        prinarr(arr);
        System.out.println(" ");
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }*/
    }

    public static void test02(int n){
        n = n+1;
    }

    public static void  test01(){
        /*
         * 1. 크기 10인 정수형 배열 생성
         * 2. 그 배열의 원소로 0부터 9까지 값 할당
         */


         int[] arr = new int[10];

         for (int i = 0; i < 10; i++){
            arr[i] = i;
         }

         for (int i = 0; i <10; i ++){
            System.out.println(arr[i]+ " ");
         }
    }

    public static void prinarr(int[] arr){
        for (int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
            arr[i] = 100;
        }
    }

    public static void test03(){
        // 5명의 프로그래밍기초와 실습 과목 점수를 입력받아 그 평균 출력

        final int ST_NUM = 5;
        int[] scores = new int[ST_NUM];
        Scanner input = new Scanner(System.in);
        int sum = 0; //모든 학생의 점수를 누적 시킬 변수 
        for (int i = 0; i < ST_NUM; i++){
            System.out.println("성적을 입력하시오.");
            scores[i] = input.nextInt();
                sum += scores[i];

            /*for (int i = 0; i < ST_NUM; i ++){
                sum += scores[i];
            }*/


        }
        System.out.println("평균 성적은 :" + sum/ST_NUM + "입니다.");
    }

}
