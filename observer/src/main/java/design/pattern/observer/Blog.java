package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <h1>ブログクラス</h1>
 *
 * 記事の投稿を行い、購読者へ通知を行います。
 *
 */
public class Blog implements Subject<String> {

    /** 通知先リスト */
    private final List<Observer> observers = new ArrayList<>();

    /** 最新記事のタイトル */
    private String latestTitle = "";

    @Override
    public void setObserver(final Observer observe) {
        this.observers.add(observe);
    }

    @Override
    public void deleteObservers() {
        this.observers.clear();
    }

    @Override
    public void deleteObserver(final Observer observer) {
        Objects.requireNonNull(observer, "削除対象のObserverがnullです。");
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        final int LOOP_SIZE = observers.size();
        for (int i = 0 ; i < LOOP_SIZE ; i++) {
            observers.get(i).update(this);
        }

        /*
         * 以下のコードは ConcurrentModificationException が発生する。
         *
         * ====================================================================
         *
         * this.observers.forEach(observer -> observer.update(this));
         *
         * this.observers.stream().forEach(observer -> observer.update(this));
         *
         * for(Observer observer : this.observers){
         *     observer.update(this);
         * }
         *
         * ====================================================================
         *
         * これらは全てIteratorを利用して処理しているコードになる。
         *
         * Iteratorは内部的に「予想される変更回数」と「実際の変更回数」を保持しており、
         * next(), remove()等のメソッドで、
         *   「予想される変更回数」!=「実際の変更回数」
         * の場合に、ConcurrentModificationException がスローされるように実装されている。
        */

    }

    /**
     * 最新記事のタイトルを取得します。
     *
     * @return 最新記事のタイトル。
     */
    @Override
    public String getSubjectStatus() {
        return this.latestTitle;
    }

    /**
     * 記事を投稿します。<br/>
     * 購読者(Observer)へ通知が行われます。
     */
    @Override
    public void execute() {
        System.out.println("記事を投稿しました。");
        this.notifyObservers();
    }

    /**
     * 記事のタイトルを設定します。
     *
     * @param title タイトル
     */
    public void setLatestTitle(final String title){
        this.latestTitle = title;
    }

    /**
     *
     * 購読者数を取得します。
     *
     * @return 購読者数
     */
    public int getSubscribeSize(){
        return this.observers.size();
    }
}
