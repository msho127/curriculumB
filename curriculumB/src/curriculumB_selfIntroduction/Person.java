package curriculumB_selfIntroduction;

/*-------------------------------------------------------------------------
[概要] 人の情報を管理するクラス
[詳細] 名前・年齢・身長・体重を保持し、BMI計算や自己紹介を行う処理を実装する。
-------------------------------------------------------------------------*/
public class Person {
    // インスタンスフィールドを定義
    String name;    // 名前
    int age;        // 年齢
    double height;  // 身長
    double weight;  // 体重

    // 生成された人数をカウントするstaticフィールド
    static int count = 0;

    public Person(String name, int age, double height, double weight) {
        this.name = name;       // 名前を代入
        this.age = age;         // 年齢を代入
        this.height = height;   // 身長を代入
        this.weight = weight;   // 体重を代入
        count++;                // インスタンス生成時に人数をカウント
    }

    public double bmi() {
        // BMIを計算して返却
        return weight / (height * height);
    }

    public void print() {
        // 名前を出力
        System.out.println("名前は " + this.name + " です");
        // 年齢を出力
        System.out.println("年は " + this.age + " 歳です");
        // BMIを出力
        System.out.println("BMIは " + this.bmi() + " です");
    }

    public static void printTotalCount() {
        // 現在の人数を出力
        System.out.println("合計 " + count + " 人です");
    }
}