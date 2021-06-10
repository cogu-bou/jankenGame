package Chap3;

import java.util.Random;
import java.util.Scanner;

public class JankenMasterRoad {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数の初期化
		String masterHand = "";
		//		String result1="";
		//		String result2="";

		String userHand = "";
		String battleResult = "";

		//データの入力
		Random rand = new Random();
		int value = rand.nextInt(3);

		//３連勝するまでじゃんけんを繰り返す→for文

		//最初の挨拶
		Scanner in = new Scanner(System.in);
		System.out.print("じゃんけんしましょう！");
		System.out.println("出したいハンドを入力してね！");
		System.out.println("例）グー、チョキ、パー");
		String janken = in.next();

		//データの処理
		//ユーザーハンドのこと
		if (janken.intern() == "グー") {
			userHand = janken;

		} else if (janken.intern() == "チョキ") {
			userHand = janken;

		} else if (janken.intern() == "パー") {
			userHand = janken;
		} else {
			System.out.println("STOP！カタカナで入力してね！");
		}

		//ユーザーハンドが適切な数値ならマスターハンド実施
		if (janken.intern() == "グー" || janken.intern() == "チョキ" || janken.intern() == "パー") {
			//	Randomで出たハンド
			switch (value) {
			case 0:
				masterHand = "グー";
				break;
			case 1:
				masterHand = "チョキ";
				break;
			case 2:
				masterHand = "パー";
				break;
			}
			System.out.println("ジャンケンマスターのハンドは:" + masterHand + "だよ");
		} else {
			System.out.println("入力しなおしてね！！");
		}

		//ジャンケンの勝敗結果の処理と出力
		if (masterHand.intern() == "グー" && userHand.intern() == "グー") {
			battleResult = "あいこです";
		} else if (masterHand.intern() == "グー" && userHand.intern() == "チョキ") {
			battleResult = "あなたの負けです";
		} else if (masterHand.intern() == "グー" && userHand.intern() == "パー") {
			battleResult = "あなたの勝ちです";
		}

		if (masterHand.intern() == "チョキ" && userHand.intern() == "チョキ") {
			battleResult = "あいこです";
		} else if (masterHand.intern() == "チョキ" && userHand.intern() == "パー") {
			battleResult = "あなたの負けです";
		} else if (masterHand.intern() == "チョキ" && userHand.intern() == "グー") {
			battleResult = "あなたの勝ちです";
		}

		if (masterHand.intern() == "パー" && userHand.intern() == "パー") {
			battleResult = "あいこです";
		} else if (masterHand.intern() == "パー" && userHand.intern() == "グー") {
			battleResult = "あなたの負けです";
		} else if (masterHand.intern() == "パー" && userHand.intern() == "チョキ") {
			battleResult = "あなたの勝ちです";
		}
		System.out.println(battleResult);
		System.out.println("---------------------------------");
		//*****************************１回目の処理***********************************

		//あいこだった場合やり直し
		if (battleResult == "あいこです") {
			System.out.println("あいこなのでもう１回！");
			System.out.println("それでは、じゃんけんポン！！");
			System.out.println("出したいハンドを入力してね！");
			System.out.println("例）グー、チョキ、パー");
			String jankenAiko = in.next();
		}

		//もし結果が勝利なら２回戦目突入
		if (battleResult == "あなたの勝ちです") {
			System.out.println("おめでとうございます。まずは１勝");
			System.out.println("それでは２回目");
			System.out.print("じゃんけんしましょう！");
			System.out.println("出したいハンドを入力してね！");
			System.out.println("例）グー、チョキ、パー");
			String janken2 = in.next();

			//２回目のユーザーハンド
			if (janken2.intern() == "グー") {
				userHand = janken2;

			} else if (janken2.intern() == "チョキ") {
				userHand = janken2;

			} else if (janken2.intern() == "パー") {
				userHand = janken2;
			} else {
				System.out.println("STOP！カタカナで入力してね！");
			}

			//ユーザーハンドが適切な数値なら２回目マスターハンド実施
			if (janken2.intern() == "グー" || janken2.intern() == "チョキ" || janken2.intern() == "パー") {
				//	Randomで出たハンド
				switch (value) {
				case 0:
					masterHand = "グー";
					break;
				case 1:
					masterHand = "チョキ";
					break;
				case 2:
					masterHand = "パー";
					break;
				}
				System.out.println("ジャンケンマスターのハンドは:" + masterHand + "だよ");
			} else {
				System.out.println("入力しなおしてね！！");
			}

			//２回目のジャンケンの勝敗結果の処理と出力
			if (masterHand.intern() == "グー" && userHand.intern() == "グー") {
				battleResult = "あいこです";
			} else if (masterHand.intern() == "グー" && userHand.intern() == "チョキ") {
				battleResult = "あなたの負けです";
			} else if (masterHand.intern() == "グー" && userHand.intern() == "パー") {
				battleResult = "あなたの勝ちです";
			}

			if (masterHand.intern() == "チョキ" && userHand.intern() == "チョキ") {
				battleResult = "あいこです";
			} else if (masterHand.intern() == "チョキ" && userHand.intern() == "パー") {
				battleResult = "あなたの負けです";
			} else if (masterHand.intern() == "チョキ" && userHand.intern() == "グー") {
				battleResult = "あなたの勝ちです";
			}

			if (masterHand.intern() == "パー" && userHand.intern() == "パー") {
				battleResult = "あいこです";
			} else if (masterHand.intern() == "パー" && userHand.intern() == "グー") {
				battleResult = "あなたの負けです";
			} else if (masterHand.intern() == "パー" && userHand.intern() == "チョキ") {
				battleResult = "あなたの勝ちです";
			}
			System.out.println(battleResult);

			//もし結果が勝利なら3回戦目突入
			if (battleResult == "あなたの勝ちです") {
				System.out.println("おめでとうございます。これで２連勝");
				System.out.println("それでは3回目");
				System.out.print("じゃんけんしましょう！");
				System.out.println("出したいハンドを入力してね！");
				System.out.println("例）グー、チョキ、パー");
				String janken3 = in.next();

				//３回目のユーザーハンド
				if (janken3.intern() == "グー") {
					userHand = janken3;

				} else if (janken3.intern() == "チョキ") {
					userHand = janken3;

				} else if (janken3.intern() == "パー") {
					userHand = janken3;
				} else {
					System.out.println("STOP！カタカナで入力してね！");
				}

				//ユーザーハンドが適切な数値なら３回目マスターハンド実施
				if (janken3.intern() == "グー" || janken3.intern() == "チョキ" || janken3.intern() == "パー") {
					//	Randomで出たハンド
					switch (value) {
					case 0:
						masterHand = "グー";
						break;
					case 1:
						masterHand = "チョキ";
						break;
					case 2:
						masterHand = "パー";
						break;
					}
					System.out.println("ジャンケンマスターのハンドは:" + masterHand + "だよ");
				} else {
					System.out.println("入力しなおしてね！！");
				}

				//３回目のジャンケンの勝敗結果の処理と出力
				if (masterHand.intern() == "グー" && userHand.intern() == "グー") {
					battleResult = "あいこです";
				} else if (masterHand.intern() == "グー" && userHand.intern() == "チョキ") {
					battleResult = "あなたの負けです";
				} else if (masterHand.intern() == "グー" && userHand.intern() == "パー") {
					battleResult = "あなたの勝ちです";
				}

				if (masterHand.intern() == "チョキ" && userHand.intern() == "チョキ") {
					battleResult = "あいこです";
				} else if (masterHand.intern() == "チョキ" && userHand.intern() == "パー") {
					battleResult = "あなたの負けです";
				} else if (masterHand.intern() == "チョキ" && userHand.intern() == "グー") {
					battleResult = "あなたの勝ちです";
				}

				if (masterHand.intern() == "パー" && userHand.intern() == "パー") {
					battleResult = "あいこです";
				} else if (masterHand.intern() == "パー" && userHand.intern() == "グー") {
					battleResult = "あなたの負けです";
				} else if (masterHand.intern() == "パー" && userHand.intern() == "チョキ") {
					battleResult = "あなたの勝ちです";
				}
				System.out.println(battleResult);

			} else {
				System.out.println("残念です。１から出直してください。");
			}

		}

	}
}