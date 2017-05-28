package design.pattern.observer;

/**
 * <h2>Subjectインターフェース</h2>
 *
 * Observerの登録・削除・通知機能を提供します。<br/>
 *
 * @param <T> <code>getSubjectStatus</code>メソッドの戻り値の型
 */
public interface Subject<T> {

    /**
     * Observerを設定します。
     *
     * @param observe Observer
     */
    void setObserver(final Observer observe);

    /**
     * Observerを一括削除します。
     */
    void deleteObservers();

    /**
     * Observerを削除します。<br/>
     * このメソッドは、Observer側で呼び出されることを想定しています。
     *
     * @param observer 削除対象のObserver
     */
    void deleteObserver(Observer observer);

    /**
     * Observerに通知を行います。
     */
    void notifyObservers();

    /**
     * Subjectのステータスを取得します。
     *
     * @return ステータス
     */
    T getSubjectStatus();

    /**
     * 処理を実行します。<br/>
     * 登録されたObserverへ通知は、このメソッド内の処理で行われます。
     */
    void execute();

}
