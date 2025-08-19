package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 契約社員クラス
[詳細] 時給1000円で給与を計算する。割増や残業は考慮しない。
----------------------------------*/
class ContractEmployee extends Employee {
    // コンストラクタ
    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }

    // 給与計算メソッド（時給1000円 × 勤務時間）
    @Override
    public int calculateSalary() {
        int hourlyRate = 1000;
        return hours * hourlyRate;
    }
}
