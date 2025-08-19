package curriculumB_6interface;

/*----------------------------------
[概要] 契約社員クラス
[詳細] 割増賃金はなく、勤務時間×時給で日給を計算する。
----------------------------------*/
public class ContractEmployee extends Employee {
    // 契約社員の時給（定数）
    private static final int HOURLY_RATE = 1000;

    // コンストラクタでIDと名前を初期化
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    // 日給計算メソッド（割増なし）
    @Override
    public int costForDay(int hoursWorked) {
        // 勤務時間×時給を返す
        return hoursWorked * HOURLY_RATE;
    }
}
