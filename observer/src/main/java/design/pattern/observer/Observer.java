package design.pattern.observer;

/**
 * 観察者（通知を受ける側）
 */
public interface Observer {

    /**
     * Subjectからの通知を受け、処理を行います。<br/>
     * <code>update</code>の呼び出しは、Subjectによって行われます。
     *
     * @param subject Subject
     */
    void update(Subject subject);
}
