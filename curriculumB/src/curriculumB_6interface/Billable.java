package curriculumB_6interface;

/*----------------------------------
[概要] 請求可能インターフェース
[詳細] 勤務時間を受け取り、その日のコスト（日給）を計算する処理を定義する。
----------------------------------*/
public interface Billable {
	
	// 勤務時間を受け取り日給を計算する
	int costForDay(int hoursWorked);

}
