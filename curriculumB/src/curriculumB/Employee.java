package curriculumB;

// クラスEmployeeを作成
public class Employee {		
	// 1
	// 文字列型、フィールド名nameを設定
	String name1;
	// メソッドworkを作成
	public void work() {
		// コンソール画面にフィールドname"は働いています。"と表示する。
        System.out.println(name1 + "は働いています。");
    }
	
	// 2
	// 文字列型、フィールド名nameを設定
	String name2;
	// 文字列型、フィールド名employeeIdを設定
	String employeeId2;
	// メソッドshowInfoを作成
	public void showInfo() {
		// コンソール画面に"社員ID:"フィールドemployeeId、"名前:"フィールドnameを表示する。
		System.out.println("社員ID: " + employeeId2 + " , " + "名前: " + name2);
	}
	
	//3
	// プライベートフィールド、文字列型、フィールド名nameを設定
	private String name3;
	// プライベートフィールド、文字列型、フィールド名employeeIdを設定
	private String employeeId3;
	
	public void setName3(String name3){
		this.name3 = name3;
	}
	public String getName3() {
		return this.name3;
	}
	
	public void setEmployeeId3(String employeeId3) {
		this.employeeId3 = employeeId3;
	}
	public String getEmployeeId3(){
		return this.employeeId3;
	}
	public void set() {
		// コンソール画面に"社員ID:"フィールドemployeeId、"名前:"フィールドnameを表示する。
		System.out.println("社員ID: " + employeeId3 + " , " + "名前: " + name3);
	}
}
