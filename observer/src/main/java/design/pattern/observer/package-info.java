/**
 * <h1>Observerパターンのパッケージです。</h1>
 *
 * Observerパターンは、Observer（またはListener）とSubjectを使用する。<br/>
 * Observerは、Subjectが発生させるイベントを観察するため、Subject側に登録される。<br/>
 *
 * Observerパターンを利用する場合、基本的に通知を行うことが多いため、
 * Publish(発行)-Subscribe(購読) パターンとも呼ばれます。<br/>
 *
 * <br/>
 *
 * 簡単な例だと、RSS。<br/>
 *
 * この場合、記事を投稿するのが Subject( or Publish) で、
 * 記事の投稿通知を受け取るのが Observer( or Subscribe) にあたります。<br/>
 *
 * この方が分かりやすいかもしれません。
 *
 * <h2>Subject（サブジェクト）</h2>
 *
 * Observerの登録・削除・通知機能を提供するインターフェース。<br/>
 * Subjectは、複数のObserverを保持する。
 *
 * <h2>Observer（オブザーバー）</h2>
 *
 * Subjectのイベント通知を受け取るための<code>update</code>メソッドを持ちます。<br/>
 * <code>update</code>メソッドは、Subject側で呼び出されます。
 *
 * <br/>
 *
 * このパッケージでは、RSSを例にして実装を行なっていきます。
 *
 */
package design.pattern.observer;
