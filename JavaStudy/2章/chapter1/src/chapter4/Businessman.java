package chapter4;

public class businessman {
	//======パラメータ======
	    private String name = null; //なまえ
	    private int gender = 0; //性別(1:男　2:女)
	    private int length = 0; //身長
	    private int weight = 0; //体重
	    private String skill = null; //特技
	    private String hoby = null; //趣味

	    //コンストラクタ
	    public businessman() {
	      this.name = "サラリーマン金太郎";
	      this.gender = 1;
	      this.length = 180;
	      this.weight = 80;
	      this.skill = "商談";
	      this.hoby = "編み物";
	    }
	    
	//======操作======
	    //営業メソッド
	public void sales() {
	  System.out.println(this.name + "は外回りにいってきます！");
	}

	//休憩メソッド
	public void rest() {
	  System.out.println(this.name + "は" + this.hoby + "をして休憩しています。");
	}

	public static void main(String[] args) {
	  businessman bm = new businessman();
	        bm.sales();
	  bm.rest();
	  System.out.println(bm.skill + "が得意です！");
	}
}