import java.util.Scanner;
import java.util.Random;
 
public class kazuate {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(90) + 10;

        System.out.println("入力してください");
        for(int i=0;i<5;i++){
            int num = scan.nextInt();
            
            if(num == answer){
                System.out.println("当たりです");
                break;
            }
            else if(num < answer){
                System.out.println("答えより小さいです");
            }
            else{
                System.out.println("答えより大きいです");
            }

            if(Math.abs(answer-num)>=20){
                System.out.println("答えと20以上差があります");
            }
            System.out.println("入力してください あと" + (4-i) + "回");
        }
        
        System.out.println("終わりです");
        
        scan.close();
    }
}