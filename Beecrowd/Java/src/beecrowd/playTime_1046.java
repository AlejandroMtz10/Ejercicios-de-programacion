package beecrowd;

import java.util.Scanner;

public class playTime_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int ans;
        if (x < y){
            ans = y - x;
        }
        else{
            ans = (24 - x) + y;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", ans);
        
	}

}
