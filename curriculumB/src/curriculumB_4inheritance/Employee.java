package curriculumB_4inheritance;

/*----------------------------------
[概要]従業員抽象クラス
[詳細] 従業員の共通情報を保持し、日給計算メソッドを定義する。
----------------------------------*/
public abstract class Employee {
	// 従業員IDを保持するフィールド
	String employeeId;
	// 従業員名を保持するフィールド
	String name;
	
	// コンストラクタでIDと名前を初期化
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	// employeeIdを取得するメソッド
	public String getEmployeeId() {
		return employeeId;
	}
	
	// nameを取得するメソッド
	public String getName() {
		return name;
	}
	
	// 勤務時間を受け取り日給を計算する抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);
}
