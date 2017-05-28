package design.pattern.observer;

import java.util.Objects;

public class Subscriber implements Observer {

    /** ユーザ名 */
    private final String userName;

    /** 通知上限回数 */
    private final int notifyMaxCount;

    /** 通知回数 */
    private int notifyCount = 0;

    /**
     * コンストラクタ。<br/>
     *
     * ユーザ名が null の場合、<code>NullPointerException</code>がスローされます。
     *
     * @param userName ユーザ名
     * @param notifyMaxCount 通知上限回数
     */
    public Subscriber(final String userName, final int notifyMaxCount){
        Objects.requireNonNull(userName);
        this.userName = userName;
        this.notifyMaxCount = notifyMaxCount;
    }

    /**
     * 記事の投稿通知を受け取ります。<br/>
     * なお、通知回数が上限値に達した場合には、通知対象から自身を削除します。
     *
     * @param subject 購読先のBlogインスタンス
     */
    @Override
    public void update(final Subject subject) {
        System.out.printf("%sに「%s」の投稿通知が届きました。%n", this.userName, subject.getSubjectStatus());

        // 通知上限に達した場合には、通知対象から除外する。
        if(++notifyCount == notifyMaxCount){
            subject.deleteObserver(this);
        }
    }

    /**
     * ユーザ名を取得します。
     *
     * @return ユーザ名
     */
    public String getUserName(){
        return this.userName;
    }
}
