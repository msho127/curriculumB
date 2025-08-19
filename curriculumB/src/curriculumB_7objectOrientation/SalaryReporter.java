package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 給与レポートクラス
[詳細] 任意の社員の給与を取得し、標準出力に表示する。
----------------------------------*/
class SalaryReporter {
    // reportメソッド：社員の名前と給与を出力
    public void report(Payable employee) {
        System.out.println(employee.getName() + " の給与: " + employee.calculateSalary() + "円");
    }
}
