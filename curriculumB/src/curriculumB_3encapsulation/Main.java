package curriculumB_3encapsulation;

public class Main {
	public static void main(String[] args) {
		/*----------------------------------
		 [概要] 従業員情報をセッターで設定し出力する処理
		 [詳細] Employeeクラスのセッターメソッドを使って名前と社員IDを設定し、setメソッドで情報を出力する。
		----------------------------------*/
		// Employee のインスタンスを生成
		Employee emp = new Employee();
		// フィールドnameに"田中花子"を代入
		emp.setName("田中花子");
		// フィールドemployeeIdに"E002"を代入
		emp.setEmployeeId("E002");
		// set() を呼び出し、コンソール画面に出力
		emp.set();
		System.out.println();
	}
}
