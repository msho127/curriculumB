package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 従業員抽象クラス
[詳細] 名前・勤務時間を共通で保持し、給与計算はサブクラスに任せる。
----------------------------------*/
abstract class Employee implements Payable {
    // 社員の名前
    protected String name;
    // 勤務時間
    protected int hours;

    // コンストラクタ（名前と勤務時間を受け取って初期化）
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    // 名前を取得する実装（Payableインターフェースから継承）
    @Override
    public String getName() {
        return name;
    }
}
