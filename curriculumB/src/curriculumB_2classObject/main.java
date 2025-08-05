package curriculumB_2classObject;

public class main {
	public static void main(String[] args) {
		/*----------------------------------
		 [概要] 従業員情報の表示処理
		 [詳細] Employeeクラスを用いて、従業員IDと名前を設定し、情報をコンソールに出力する。
		----------------------------------*/
		// Employee のインスタンスを生成
		Employee emp = new Employee();
		// フィールドemployeeIdに"E001"を代入
		emp.employeeId = "E001";
		// フィールドnameに"佐藤太郎"を代入
		emp.name = "佐藤太郎";
		// showInfo() を呼び出し、コンソール画面に出力
		emp.showInfo();
		System.out.println();
	}

}
