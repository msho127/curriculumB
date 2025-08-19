package curriculumB_6interface;

/*----------------------------------
[概要] 正社員クラス
[詳細] 8時間までは通常時給、8時間超過分は25%割増で日給を計算する。
----------------------------------*/
public class FullTimeEmployee extends Employee {
    // 正社員の時給（定数）
    private static final int HOURLY_RATE = 1250;

    // コンストラクタでIDと名前を初期化
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    // 日給計算メソッド（残業割増あり）
    @Override
    public int costForDay(int hoursWorked) {
        // 8時間以内なら通常時給で計算
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;
        } else {
            // 残業時間を計算
            int overtime = hoursWorked - 8;
            // 通常給与 + 残業給与を返す
            return (8 * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
        }
    }
}
