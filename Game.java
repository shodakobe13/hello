import java.util.Scanner;
import java.util.Random;
 
public class Game {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(90) + 10;

        System.out.println("入力してください");
        for(int i=0;i<5;i++){
            int num = scan.nextInt();
            
            if(num == answer){
                System.out.println("当たり");
                break;
            }
            else if(num < answer){
                System.out.println("答えより小さいよ");
            }
            else{
                System.out.println("答えより大きいよ");
            }

            if(Math.abs(answer-num)>=20){
                System.out.println("答えと20以上差があるよ");
            }
        }
        
        System.out.println("終わり");
        
        scan.close();
    }
}