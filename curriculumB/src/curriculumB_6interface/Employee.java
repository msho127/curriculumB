package curriculumB_6interface;

/*----------------------------------
[概要] 従業員抽象クラス
[詳細] 従業員の共通情報を保持し、インターフェースを実装させる。
----------------------------------*/
public abstract class Employee implements Billable {
    // 従業員ID
    protected String id;
    // 従業員名
    protected String name;

    // コンストラクタでIDと名前を初期化
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // IDを取得するメソッド
    public String getId() {
        return id;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // costForDay はここでは実装せず、各サブクラスでオーバーライドする
}


