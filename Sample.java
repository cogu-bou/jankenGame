package Sample;

import java.util.Random;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数の初期化
		String result="";
		String result1="";
		String result2="";
		
		String janken1="";
		String janken2="";
		String janken3="";
		String s="";
		String k="";
		
		//データの入力
	Random rand=new Random();
	int value =rand.nextInt(3);
	
	Scanner in =new Scanner(System.in);
	System.out.print("じゃんけんしましょう！");
	String janken = in.next();
	
	
	//データの処理
	//ユーザーハンドのこと
if(janken.intern()=="グー") {
	janken1=janken;
	s=janken1;
}else if(janken.intern()=="チョキ") {
	janken2=janken;
	s=janken2;
}else if(janken.intern()=="パー") {
	janken3=janken;
	s=janken3;
}
//System .out.println(s);

//	Randomで出たハンド
	switch(value) {
	case 0:
		result="グー";
		break;
	case 1:
		result1="チョキ";
		break;
	case 2:
		result2="パー";
		break;
	}
	
	if(result.intern()==janken1.intern()) {
		k="あいこです";
	}else if(result.intern()==janken2.intern()) {
		k="あなたの負けです";
	}else if(result.intern()==janken3.intern()) {
		k="あなたの勝ちです";
	}
	
	if(result1.intern()==janken1.intern()) {
		k="あいこです";
	}else if(result1.intern()==janken2.intern()) {
		k="あなたの負けです";
	}else if(result1.intern()==janken3.intern()) {
		k="あなたの勝ちです";
	}
	
	if(result2.intern()==janken1.intern()) {
		k="あいこです";
	}else if(result2.intern()==janken2.intern()) {
		k="あなたの負けです";
	}else if(result2.intern()==janken3.intern()) {
		k="あなたの勝ちです";
	}
	System.out.println(k);
		
	

	}

}
