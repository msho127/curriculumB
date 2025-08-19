package curriculumB_1basicConcept;

public class Main {
	public static void main(String[] args) {
		/*----------------------------------
		 [概要] 従業員は働いているを出力する処理
		 [詳細] Employeeクラスを用いて、従業員名を設定し、コンソールに出力する。
		----------------------------------*/
		// Employee のインスタンスを生成
		Employee emp = new Employee();
		// フィールドnameに"山田太郎"を代入
		emp.name = "山田太郎";
		// work() を呼び出し、コンソール画面に出力
		emp.work();    
		System.out.println();
	}
}
