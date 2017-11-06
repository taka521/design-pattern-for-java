package composition;

/**
 * プリント抽象クラス
 */
public abstract class Print {

    /**
     * 文字列を弱く表示する。<br/>
     * 具体的には、文字列を括弧つきで表示します。
     * <p>
     * {@code string => (string) }
     */
    public abstract void printWeak();

    /**
     * 文字列を強く表示する。<br/>
     * 具体的には、文字列をアスタリスク付きで表示します。
     * <p>
     * {@code string => *string* }
     */
    public abstract void printStrong();

}
