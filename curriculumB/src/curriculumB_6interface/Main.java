package curriculumB_6interface;

import java.util.ArrayList;
import java.util.List;

/*----------------------------------
[概要] 実行クラス
[詳細] 社員をリストに追加し、全員の勤務時間に基づいて日給を計算・出力する。
----------------------------------*/
public class Main {
    public static void main(String[] args) {
        // 社員リストを作成（Billable型で管理）
        List<Billable> employees = new ArrayList<>();

        // 正社員「佐藤正社員」をリストに追加
        employees.add(new FullTimeEmployee("F001", "佐藤正社員"));
        // 契約社員「田中契約社員」をリストに追加
        employees.add(new ContractEmployee("C001", "田中契約社員"));
        // 正社員「鈴木正社員」をリストに追加
        employees.add(new FullTimeEmployee("F002", "鈴木正社員"));
        // 契約社員「高橋契約社員」をリストに追加
        employees.add(new ContractEmployee("C002", "高橋契約社員"));

        // 勤務時間を9時間に設定
        int hoursWorked = 9;

        // for-eachループで各社員の日給を計算・出力
        for (Billable emp : employees) {
            // costForDayで日給を計算
            int cost = emp.costForDay(hoursWorked);
            // 名前を表示するためにEmployee型へキャスト
            if (emp instanceof Employee) {
                // 社員名と日給をコンソールに出力
                System.out.println(((Employee) emp).getName() + " の日給: " + cost + " 円");
            } else {
                // 名前が取得できない場合の日給出力
                System.out.println("日給: " + cost + " 円");
            }
        }
    }
}
