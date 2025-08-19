package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 正社員クラス
[詳細] 時給1200円で給与を計算する。残業処理などは考慮しない。
----------------------------------*/
class FullTimeEmployee extends Employee {
    // コンストラクタ
    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    // 給与計算メソッド（時給1200円 × 勤務時間）
    @Override
    public int calculateSalary() {
        int hourlyRate = 1200;
        return hours * hourlyRate;
    }
}
