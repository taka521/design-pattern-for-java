package composition;

import banner.Banner;

/**
 * プリントバナークラス
 */
public class PrintBanner extends Print {

    /** バナー */
    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
