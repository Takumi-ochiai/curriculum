package chapter1;

public class ModAccessOther {
	//↑extends ModAccessが無いのでModAccess.javaから継承していない
	public static void main(String[] args) {
        ModAccess my = new ModAccess();
        System.out.println(my.pub_var);
        // protected以下のメンバーにはアクセス不可
        // System.out.println(my.prot_var);
        // System.out.println(my.pack_var);
        // System.out.println(my.pri_var);
    }
}


//継承していないのでpublic以外出力出来ない
