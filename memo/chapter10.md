# chapter10: 例外によるエラーコードの置き換え

nullを返すことにより異常系の処理を行うという実装にしていると、具体的なエラー処理を記述するメソッドまでに多くのメソッド内でnullに対処する処理を記述しなければならないことがある。
そういった際には例外クラスを用意し、例外発生時にはthrowすることで、具体的な対処をするメソッドまではthrows節をメソッドに付加するだけで済むようになる。