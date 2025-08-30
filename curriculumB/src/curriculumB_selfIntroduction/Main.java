package curriculumB_selfIntroduction;

/*-------------------------------------------------------------------------
[概要] メイン処理クラス
[詳細] Personクラスのインスタンスを生成し、情報を出力する処理を行う。
-------------------------------------------------------------------------*/
public class Main {
    public static void main(String[] args) {
        // Personクラスのインスタンスを生成
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

        // インスタンスフィールドの値を出力
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);

        // インスタンスのprintメソッドを呼び出して情報を出力
        System.out.println();
        person1.print();

        // staticメソッドを呼び出して人数を出力
        System.out.println();
        Person.printTotalCount();
    }
}
