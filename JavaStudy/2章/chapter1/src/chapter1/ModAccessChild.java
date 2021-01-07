package chapter1;

public class ModAccessChild extends ModAccess {
	//↑extends ModAccessでModAccess.javaから継承している
	public void test() {
        System.out.println(this.pub_var);
        System.out.println(this.prot_var);
        System.out.println(this.pack_var);
        // System.out.println(this.pri_var); ←プライベート変数にはアクセス不可
    }
 
    public static void main(String[] args) {
        ModAccess mc = new ModAccessChild();
        mc.test();
    }
}


//アクセス修飾子
//public 全てのクラスからアクセスできる
//protected 現在のクラスとサブクラスからアクセスできる
//なし 現在のクラスと同じパッケージのクラスからアクセスできる
//private 現在のクラスからだけアクセスできる

// 今回はprivateのみ出力出来ない
//また、 private な pri_var にはアクセスができないため、
//実装時にはコンパイルエラーとなりエラー対象のコードに赤い下線が引かれます。
//
//コンパイルエラー時の対応策としては主に以下の3つとなります。
//①正しいコードに修正
//②コメントアウトすることにより、コードとして認識させない
//③対象のコードを削除