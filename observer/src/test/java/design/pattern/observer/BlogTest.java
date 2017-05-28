package design.pattern.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlogTest {

    @Test
    public void notifyTest(){

        // Subjectの生成
        Blog blog = new Blog();

        // Observerの生成
        Subscriber subscriber1 = new Subscriber("うさぎ", 2);
        Subscriber subscriber2 = new Subscriber("かめ", 1);

        // ObserverをSubjectへ登録
        blog.setObserver(subscriber1);
        blog.setObserver(subscriber2);

        // 1回目
        blog.setLatestTitle("デザインパターンメモ");
        blog.execute();

        assertEquals(1, blog.getSubscribeSize());

        // ２回目
        blog.setLatestTitle("SpringBootメモ");
        blog.execute();

        assertEquals(0, blog.getSubscribeSize());

    }

}
