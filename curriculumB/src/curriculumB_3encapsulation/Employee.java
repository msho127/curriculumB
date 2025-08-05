package curriculumB_3encapsulation;

// クラスEmployeeを作成
public class Employee {		
	// プライベートフィールド、文字列型、フィールド名nameを設定
	private String name;
	// プライベートフィールド、文字列型、フィールド名employeeIdを設定
	private String employeeId;
	
	
	// 引数で受け取った名前をnameフィールドに代入する。
	public void setName(String name){
		// 引数で受け取ったnameをフィールドに設定
		this.name = name;
	}
	
	// フィールドnameの値を返す。
	public String getName() {
		// nameの値を返す
		return this.name;
	}
	
	// 引数で受け取った社員IDをemployeeIdフィールドに代入する。
	public void setEmployeeId(String employeeId) {
		// 引数で受け取ったemployeeIdをフィールドに設定
		this.employeeId = employeeId;
	}
	
	// フィールドemployeeIdの値を返す。
	public String getEmployeeId(){
		// employeeIdの値を返す
		return this.employeeId;
	}
	
	// 社員IDと名前を連結し、"社員ID:〇〇 , 名前:〇〇"の形式で出力する。
	public void set() {
		// コンソール画面に"社員ID:"フィールドemployeeId、"名前:"フィールドnameを表示する。
		System.out.println("社員ID: " + employeeId + " , " + "名前: " + name);
	}
}
