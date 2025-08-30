package curriculumB_Qes6;

/*-------------------------------------------------------------------------
[概要] じゃんけんの手を表す列挙型
[詳細] グー、チョキ、パーを列挙し、数値から手を取得する処理を行う。
-------------------------------------------------------------------------*/
// 列挙型Hand
enum Hand {
	// 列挙定数
    グー, チョキ, パー;
    public static Hand fromInt(int n) {
    	// values()すべての列挙定数を配列で返すメソッド
        return values()[n];
    }
    // System.out.println(Hand.getHandName(2)); // → パー
    public static String getHandName(int n) {
    	//switch 文による分岐処理
        switch (n) {
        	// case だった場合 返り値を返す
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }
}

/*-------------------------------------------------------------------------
[概要] メイン処理クラス
[詳細] プレイヤーとCPUがじゃんけんを行い、勝つまで繰り返す処理を行う。
-------------------------------------------------------------------------*/
public class Qes6 {
	
	public static void main(String[] args) {

		// インスタンス作成
		Player player = new Player();
        CPU cpu = new CPU();
        
        // while文で勝つまで繰り返す
        while (true) {
        	
        	// playerとcpuの手を取得
            int playerHand = player.chooseHand();
            int cpuHand = cpu.generateHand();
            
            //手を文字列でコンソール画面に表示
            System.out.println("あなたの手: " + Hand.getHandName(playerHand));
            System.out.println("CPUの手: " + Hand.getHandName(cpuHand));
            
            // 勝敗判定(数学的に勝敗を判定する方法)
            int result = (playerHand - cpuHand + 3) % 3;
            
            if (result == 0) {
                System.out.println("あいこです！");
            } else if (result == 1) {
                System.out.println("あなたの負け！");
            } else {
                System.out.println("あなたの勝ち！");
                break; // 勝ったら終了
            }
        }
  
	}
}

