package curriculumB_Qes6;

/*-------------------------------------------------------------------------
[概要] プレイヤーの入力を管理するクラス
[詳細] コンソールから0〜2の数値を入力させ、その数値を返却する。
-------------------------------------------------------------------------*/
// Scannerを使うためにインポート
import java.util.Scanner;

public class Player {
	// playerが入力。
	private Scanner scanner = new Scanner(System.in);

    public int chooseHand() {
    	// 割当とじゃんけんの仕方
        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
        // scannerの内容が対応した数字かどうか、判別するwhite文。
        while (true) {
            try {
            	// スキャナーの内容を文字列に、文字列からint型に修正、変数inputに代入。
                int input = Integer.parseInt(scanner.nextLine());
                // 入力された文字が0~2であれば、正しく動作される。
                if (input >= 0 && input <= 2) {
                    return input;
                // もし0~2以外の数字が入力された場合、0~2を入力するようコンソール画面に表示する。
                } else {
                    System.out.print("0〜2の数字を入力してください: ");
                }
            // 入力値が文字の場合、数字を入力してくださいとコンソール画面に表示する。
            } catch (NumberFormatException e) {
                System.out.print("数字を入力してください: ");
            }
        }
    }
	


}
