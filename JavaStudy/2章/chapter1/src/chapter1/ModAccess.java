package chapter1;

public class ModAccess {
	public String pub_var = "publicだよ";
    protected String prot_var = "protectedだよ";
    String pack_var = "package privateだよ";
    private String pri_var = "privateだよ";

    public void test() {
        // クラス内部ではすべてのレベルのメンバーにアクセス可
        System.out.println(this.pub_var);
        System.out.println(this.prot_var);
        System.out.println(this.pack_var);
        System.out.println(this.pri_var);
    }

    public static void main(String[] args) {
        ModAccess m = new ModAccess();
        m.test();
    }
}

//アクセス修飾子
//public 全てのクラスからアクセスできる
//protected 現在のクラスとサブクラスからアクセスできる
//なし 現在のクラスと同じパッケージのクラスからアクセスできる
//private 現在のクラスからだけアクセスできる
