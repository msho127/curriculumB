package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 実行クラス
[詳細] 正社員と契約社員を作成し、給与を出力する。
----------------------------------*/
public class Main {
    public static void main(String[] args) {
        // 正社員 佐藤（8時間勤務）
        Payable emp1 = new FullTimeEmployee("佐藤", 8);
        // 契約社員 田中（6時間勤務）
        Payable emp2 = new ContractEmployee("田中", 6);

        // レポートクラスを利用して給与を出力
        SalaryReporter reporter = new SalaryReporter();
        reporter.report(emp1);
        reporter.report(emp2);
    }
}
