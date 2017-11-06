package extend;

import banner.Banner;

/**
 * プリントバナークラス
 * <p>
 * {@link Banner} クラスと {@link Print} インターフェースとのAdapterの役割を持ちます。
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
