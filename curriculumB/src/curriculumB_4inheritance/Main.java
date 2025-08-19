package curriculumB_4inheritance;

/*----------------------------------
[概要] 実行クラス
[詳細] 正社員とパート社員を生成し、勤務時間を基に給与を計算・出力する。
----------------------------------*/
public class Main {
	public static void main(String[] args) {
		// FullTimeEmployee（正社員）のインスタンスを生成
		Employee fullTime = new FullTimeEmployee("F001", "佐藤正社員");
		
		// PartTimeEmployee（パート社員）のインスタンスを生成
        Employee partTime = new PartTimeEmployee("P001", "田中パート");
		
        // 正社員の勤務時間9時間で日給を計算（8h 通常 + 1h 割増）
        int fullTimeWage = fullTime.calculateDailyWage(9);
		
        // パート社員の勤務時間9時間で日給を計算（全て通常）
        int partTimeWage = partTime.calculateDailyWage(9);

        // 正社員の給与をコンソールに出力
        System.out.println("正社員の給与: " + fullTimeWage + " 円");
        // パート社員の給与をコンソールに出力
        System.out.println("パート社員の給与: " + partTimeWage + " 円");
	}
}
