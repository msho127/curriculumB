package curriculumB;

public class Qes2 {

	public static void main(String[] args) {
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int score = 75;
		if ( score > 60 ) {
			System.out.println( "合格です！" );
		}else if( score < 60 ){
			System.out.println( "不合格です。" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int age = 25;
		if( 20 <= age && 30 >= age ){
			System.out.println( "適正年齢です" );
		}else{
			System.out.println( "適正年齢ではありません" );	
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		age = 18;
		if( 20 <= age ){
			System.out.println( "成人です" );
		}else if( 13 <= age && 19 >= age ){
			System.out.println( "ティーンエイジャーです" );
		}else if( 12 >= age ){
			System.out.println( "子どもです" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int x = 30;
		int y = 15;
		int z = 50;
		if(x >= y && x >= z){
			System.out.println( "一番大きいのは" + x + "です。" );
		}else if(y >= x && y >= z){
			System.out.println( "一番大きいのは" + y + "です。" );
		}else{
			System.out.println( "一番大きいのは" + z + "です。" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int num = 0;
		if( num > 0){
			System.out.println( "正の数です" );
		}else if( num == 0){
			System.out.println( "0です" );
		}else if( num < 0){
			System.out.println( "負の数です" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		num = 1;
		if( num % 2 == 0 ){
			System.out.println( "偶数です" );
		}else{
			System.out.println( "奇数です" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		score = 50;
		if( 90 <= score ) {
			System.out.println( "優" );
		}else if( 70 <= score ) {
			System.out.println( "良" );
		}else if( 50 <= score ) {
			System.out.println( "可" );
		}else{
			System.out.println( "不可" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		String text = "";
		if( text.isEmpty()) {
			System.out.println( "入力が無効です" );
		}else {
			System.out.println( "入力された文字は有効です" );
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int day = 1;
		switch( day ) {
			case 1:
				System.out.println( "月曜日" );
				break;
			case 2:
				System.out.println( "火曜日" );
				break;
			case 3:
				System.out.println( "水曜日" );
				break;
			case 4:
				System.out.println( "木曜日" );
				break;
			case 5:
				System.out.println( "金曜日" );
				break;
			case 6:
				System.out.println( "土曜日" );
				break;
			case 7:
				System.out.println( "日曜日" );
				break;
			default:
				System.out.println( "無効な入力です" );
				break;
		}
		System.out.println();
		
		/*----------------------------------
		 [概要] 
		 [詳細] 
		----------------------------------*/
		int month = 1;
		switch( month ) {
			case 12 , 1 , 2:
				System.out.println( "冬" );
				break;
			case 3 , 4 , 5:
				System.out.println( "春" );
				break;
			case 6 , 7 , 8:
				System.out.println( "夏" );
				break;
			case 9 , 10 , 11:
				System.out.println( "秋" );
				break;
			default:
				System.out.println( "無効な月です" );
				break;
		}
				
	}

}
