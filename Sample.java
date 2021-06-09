package Sample;

import java.util.Random;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数の初期化
		String result="";
//		String result1="";
//		String result2="";
		
		String s="";
		String k="";
		
		//データの入力
	Random rand=new Random();
	int value =rand.nextInt(3);
	
	Scanner in =new Scanner(System.in);
	System.out.print("じゃんけんしましょう！");
	System.out.println("出したいハンドを入力してね！");
	System.out.println( "例）グー、チョキ、パー");
	String janken = in.next();
	
	
	//データの処理
	//ユーザーハンドのこと
	//if
if(janken.intern()=="グー") {
	s=janken;
	
}else if(janken.intern()=="チョキ") {
	s=janken;
	
}else if(janken.intern()=="パー") {
	s=janken;
}else {
	System.out.println("カタカナで入力してね！");
}

//System .out.println(s);

//	Randomで出たハンド
	switch(value) {
	case 0:
		result="グー";
		break;
	case 1:
		result="チョキ";
		break;
	case 2:
		result="パー";
		break;
	}
	System .out.println("ジャンケンマスターのハンドは:"+result+"だよ");
	
	
	if(result.intern()=="グー"&&s.intern()=="グー") {
		k="あいこです";
	}else if(result.intern()=="グー"&&s.intern()=="チョキ") {
		k="あなたの負けです";
	}else if(result.intern()=="グー"&&s.intern()=="パー") {
		k="あなたの勝ちです";
	}
	
	if(result.intern()=="チョキ"&&s.intern()=="チョキ") {
		k="あいこです";
	}else if(result.intern()=="チョキ"&&s.intern()=="パー") {
		k="あなたの負けです";
	}else if(result.intern()=="チョキ"&&s.intern()=="グー") {
		k="あなたの勝ちです";
	}
	
	if(result.intern()=="パー"&&s.intern()=="パー") {
		k="あいこです";
	}else if(result.intern()=="パー"&&s.intern()=="グー") {
		k="あなたの負けです";
	}else if(result.intern()=="パー"&&s.intern()=="チョキ") {
		k="あなたの勝ちです";
	}
	System.out.println(k);
		
	

	}

}
