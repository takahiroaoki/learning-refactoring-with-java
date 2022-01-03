# refactoring-with-java

本レポジトリのコードは基本的に[Java言語で学ぶリファクタリング入門](https://www.amazon.co.jp/Java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0%E5%85%A5%E9%96%80-%E7%B5%90%E5%9F%8E-%E6%B5%A9-ebook/dp/B00I8AT1EU/ref=sr_1_1?__mk_ja_JP=%E3%82%AB%E3%82%BF%E3%82%AB%E3%83%8A&crid=3AWP7TEPZ9LMT&keywords=%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0+java&qid=1641202421&sprefix=%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0+ja%2Caps%2C178&sr=8-1)に基づいています。

また著者の方の公式サイトは[コチラ](https://www.hyuki.com/)です。Javaのバージョンの関係や学習のために、配布されたコードと異なる箇所が複数あります。元のコードは[著者の方のページ](https://www.hyuki.com/ref/#download)からダウンロードすることができます。


## 実行環境

本レポジトリのコードの実行環境は以下です。

- Windows 10
- [Docker Desktop for Windows](https://www.docker.com/products/docker-desktop) 4.2.0
- VSCode + Remote Development 0.21.0（拡張機能）

## ディレクトリ構成

主要なディレクトリ構成を以下に示します。

refactoring-with-java
- demo/
  - src/
    - main/java/com/example/: 各章ごとのコードが入っているディレクトリ
    - test/java/com/example/: 各章ごとのテストコードが入っているディレクトリ
- memo/: 書籍の章ごとのメモが入っているディレクトリ

## 動作確認

動作確認をする際は以下の手順で行ってください。

1. Docker Desktopを起動する。
2. refactoring-with-javaフォルダ（つまりこのプロジェクト）をRemote Development拡張機能をインストールしたVSCodeで開く。
3. コマンドパレットから"Reopen in Container"を実行する。
4. 各パッケージのMain.javaファイルを実行する。

## JUnitについて
本プロジェクトではJUnit5を使用しています。
./demo/src/test/java/com/example/chapterX内のテストについて、VSCodeのコマンドパレットなどから"Java: Debug Tests"などを実行してテストを実行することができます。

## 参考文献
- [Java言語で学ぶリファクタリング入門](https://www.amazon.co.jp/Java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0%E5%85%A5%E9%96%80-%E7%B5%90%E5%9F%8E-%E6%B5%A9-ebook/dp/B00I8AT1EU/ref=sr_1_1?__mk_ja_JP=%E3%82%AB%E3%82%BF%E3%82%AB%E3%83%8A&crid=3AWP7TEPZ9LMT&keywords=%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0+java&qid=1641202421&sprefix=%E3%83%AA%E3%83%95%E3%82%A1%E3%82%AF%E3%82%BF%E3%83%AA%E3%83%B3%E3%82%B0+ja%2Caps%2C178&sr=8-1)
