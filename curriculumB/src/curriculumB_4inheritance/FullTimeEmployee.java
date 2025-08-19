package curriculumB_4inheritance;

/*----------------------------------
[概要] 正社員クラス
[詳細] 8時間を超えた勤務時間には25%の割増賃金を加算して日給を計算する。
----------------------------------*/
class FullTimeEmployee extends Employee {
	// 正社員の時給（定数）
	private static final int HOURLY_RATE = 1200;
	
	// コンストラクタでIDと名前を初期化
	public FullTimeEmployee(String id, String name) {
        super(id, name);
    }
	
	// 日給計算メソッド（残業割増あり）
	@Override
	public int calculateDailyWage(int hoursWorked) {
        // 8時間以内なら通常時給で計算
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;
        } else {
            // 通常勤務時間を8時間に設定
            int regularHours = 8;
            // 残業時間を計算
            int overtimeHours = hoursWorked - 8;
            // 通常給与 + 残業給与を返す
            return (regularHours * HOURLY_RATE) + (int)(overtimeHours * HOURLY_RATE * 1.25);
        }
    }
}
