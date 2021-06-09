package Sample;

import java.util.Random;
import java.util.Scanner;

public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String mash="";
		String mh="";
		String k="";
		
		Random rand=new Random();
		int masterHand=rand.nextInt(3);
		
		
		Scanner in =new Scanner(System.in);
		System.out.println("じゃんけんしましょう！０〜２で好きな数字を選んでね！");
		System.out.print("（グー：０　チョキ：１　パー：２）");
		int myHand=in.nextInt();
		switch(myHand) {
		case 0:
			mh="グー";
			break;
		case 1:
			mh="チョキ";
			break;
		case 2:
			mh="パー";
			break;
		}
		System.out.println("あなたのハンド:"+mh);
		
		
		
		switch(masterHand) {
		case 0:
			mash="グー";
			break;
		case 1:
			mash="チョキ";
			break;
		case 2:
			mash="パー";
			break;
		}
		System .out.println("ジャンケンマスターのハンドは:"+mash+"だよ");
		
		if(masterHand==0 && myHand==0) {
			k="あいこです";
		}else if(masterHand==0&&myHand==1) {
			k="あなたの負けです";
		}else if(masterHand==0&&myHand==2) {
			k="あなたの勝ちです";
		}
		
		if(masterHand==1 && myHand==1) {
			k="あいこです";
		}else if(masterHand==1&&myHand==2) {
			k="あなたの負けです";
		}else if(masterHand==1&&myHand==0) {
			k="あなたの勝ちです";
		}
		
		if(masterHand==2 && myHand==2) {
			k="あいこです";
		}else if(masterHand==2&&myHand==0) {
			k="あなたの負けです";
		}else if(masterHand==2&&myHand==1) {
			k="あなたの勝ちです";
		}


		
		System.out.println(k);
		
		
		

	}

}
