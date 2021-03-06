package banner;

/**
 * バナークラス<br/>
 * <p>
 * 当クラスは古くから存在している設定。
 * このクラスをラップして、新しい機能を持ったクラスを提供するのが今回の目的。
 */
public class Banner {

    /** 文字列 */
    private final String string;

    public Banner(String string) {
        this.string = string;
    }

    /**
     * 文字列を括弧付きで表示する。
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * 文字列をアスタリスク（*）付きで表示する。
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
