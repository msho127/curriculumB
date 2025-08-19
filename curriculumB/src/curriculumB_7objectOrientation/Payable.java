package curriculumB_7objectOrientation;

/*----------------------------------
[概要] 給与計算可能なインターフェース
[詳細] 全社員が共通で持つべきメソッド（給与計算・名前取得）を定義する。
----------------------------------*/
interface Payable {
    // 社員の給与を計算する抽象メソッド
    int calculateSalary();

    // 社員の名前を取得する抽象メソッド
    String getName();
}
