package curriculumB;


// mainクラスを作成
public class Main {
	public static void main(String[] args) {
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		// Employee のインスタンスを生成
		Employee emp = new Employee();
		// フィールドnameに"山田太郎"を代入
		emp.name1 = "山田太郎";
		// work() を呼び出し、コンソール画面に出力
		emp.work();    
		System.out.println();
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		// フィールドemployeeIdに"E001"を代入
		emp.employeeId2 = "E001";
		// フィールドnameに"佐藤太郎"を代入
		emp.name2 = "佐藤太郎";
		// showInfo() を呼び出し、コンソール画面に出力
		emp.showInfo();
		System.out.println();
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		// フィールドnameに"田中花子"を代入
		emp.setName3("田中花子");
		// フィールドemployeeIdに"E002"を代入
		emp.setEmployeeId3("E002");
		// set() を呼び出し、コンソール画面に出力
		emp.set();
		System.out.println();
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		// Employee のインスタンスを生成
		Employee4 fullTime = new FullTimeEmployee("F001", "佐藤正社員");
        Employee4 partTime = new PartTimeEmployee("P001", "田中パート");
		
        int fullTimeWage = fullTime.calculateDailyWage(9); // 8h 通常 + 1h 割増
        int partTimeWage = partTime.calculateDailyWage(9); // 全部通常

        System.out.println("正社員の給与: " + fullTimeWage + " 円");
        System.out.println("パート社員の給与: " + partTimeWage + " 円");
        /*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
//        すでに以下のクラスが定義されています。						
//    	abstract class Employee {					
//    	protected String id;					
//    	protected String name;					
//    	public Employee(String id, String name) {					
//    	this.id = id;					
//    	this.name = name;					
//    	}					
//    	public abstract int calculateDailyWage(int hoursWorked);					
//    	}					
//    						
//    	class FullTimeEmployee extends Employee {					
//    	public FullTimeEmployee(String id, String name) {					
//    	super(id, name);					
//    	}					
//    	@Override					
//    	public int calculateDailyWage(int hoursWorked) {					
//    	int hourlyRate = 1250;					
//    	int overtime = Math.max(0, hoursWorked - 8);					
//    	int regularHours = hoursWorked - overtime;					
//    	return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);					
//    	}					
//    	}					
//    						
//    	class ContractEmployee extends Employee {					
//    	public ContractEmployee(String id, String name) {					
//    	super(id, name);					
//    	}					
//    	@Override					
//    	public int calculateDailyWage(int hoursWorked) {					
//    	int hourlyRate = 1000;					
//    	return hoursWorked * hourlyRate;					
//    	}					
//    	}					
//    						
//    以下を実装してください。						
//    １	社員リスト（List<Employee>）に FullTimeEmployee と ContractEmployee を複数追加する。					
//    ２	for-each ループで calculateDailyWage を呼び出し、各社員の給料を出力する。					
//    ３	サブクラスを明示的に扱わずに、共通の Employee 型で実装する。					
        

	}
}
