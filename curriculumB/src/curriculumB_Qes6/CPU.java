package curriculumB_Qes6;

// Randomを使うためにインポート
import java.util.Random;

/*-------------------------------------------------------------------------
[概要] CPUの手を生成するクラス
[詳細] ランダムに0〜2の数値を返却し、じゃんけんの手を決定する。
-------------------------------------------------------------------------*/
public class CPU {
    private Random random = new Random();
    public int generateHand() {
    	// nextInt(3)で0以上3未満の整数をランダムに繰り返す
        return random.nextInt(3);
    }

}
