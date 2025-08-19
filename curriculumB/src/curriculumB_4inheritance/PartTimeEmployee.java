package curriculumB_4inheritance;

/*----------------------------------
[概要] パート社員クラス
[詳細] 割増はなく、勤務時間×時給で日給を計算する。
----------------------------------*/
class PartTimeEmployee extends Employee {
	// パート社員の時給（定数）
	private static final int HOURLY_RATE = 1000;
	
	// コンストラクタでIDと名前を初期化
	public PartTimeEmployee(String id, String name) {
        super(id, name);
    }
	
	// 日給計算メソッド（割増なし）
	@Override
	public int calculateDailyWage(int hoursWorked) {
        // 勤務時間×時給を返す
        return hoursWorked * HOURLY_RATE;
    }
}
