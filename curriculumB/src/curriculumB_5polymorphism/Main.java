package curriculumB_5polymorphism;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calculateDailyWage(int hoursWorked);

    public String getInfo() {
        return id + " - " + name;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1250;
        int overtime = Math.max(0, hoursWorked - 8);
        int regularHours = hoursWorked - overtime;
        return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
    }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1000;
        return hoursWorked * hourlyRate;
    }
}

/*----------------------------------
[概要] 実行クラス
[詳細] 社員リストを作成し、各社員の日給を計算してコンソールに出力する。
----------------------------------*/
public class Main {
    public static void main(String[] args) {
        // 社員リストを作成
        List<Employee> employees = new ArrayList<>();
        
        // 正社員「山田太郎」をリストに追加
        employees.add(new FullTimeEmployee("FT001", "山田太郎"));
        // 正社員「田中一郎」をリストに追加
        employees.add(new FullTimeEmployee("FT002", "田中一郎"));
        // 契約社員「佐藤花子」をリストに追加
        employees.add(new ContractEmployee("CT001", "佐藤花子"));
        // 契約社員「鈴木次郎」をリストに追加
        employees.add(new ContractEmployee("CT002", "鈴木次郎"));

        // 勤務時間を10時間に設定（全社員共通）
        int hoursWorked = 10;
        
        // for-eachループでリスト内の全社員を処理
        for (Employee e : employees) {
            // 各社員の日給を計算
            int wage = e.calculateDailyWage(hoursWorked);
            // 社員情報と日給をコンソールに出力
            System.out.println(e.getInfo() + " の日給: " + wage + "円");
        }
    }
}

