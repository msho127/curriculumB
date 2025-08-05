package curriculumB_2classObject;

// クラスEmployeeを作成
public class Employee {		
	// 文字列型、フィールド名nameを設定
	String name;
	// 文字列型、フィールド名employeeIdを設定
	String employeeId;
	// メソッドshowInfoを作成
	public void showInfo() {
		// コンソール画面に"社員ID:"フィールドemployeeId、"名前:"フィールドnameを表示する。
		System.out.println("社員ID: " + employeeId + " , " + "名前: " + name);
	}
}
