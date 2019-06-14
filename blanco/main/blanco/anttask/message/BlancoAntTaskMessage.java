/*
 * このソースコードは blanco Frameworkによって自動生成されています。
 */
package blanco.anttask.message;

/**
 * blancoAntTaskのメッセージクラス。プログラム中で利用されるメッセージを格納します。
 */
public class BlancoAntTaskMessage {
    /**
     * メッセージをプロパティファイル対応させるための内部的に利用するリソースバンドルクラス。
     */
    protected final BlancoAntTaskMessageResourceBundle fBundle = new BlancoAntTaskMessageResourceBundle();

    /**
     * メッセージ定義ID[BlancoAntTask]、キー[MBATI001]の文字列を取得します。
     *
     * No.2:
     * 文字列[タスク名[{0}]、アトリビュート[{1}]において、[必須]と[デフォルト]が同時に指定されています。しかし[必須]と[デフォルト]は排他的に、しかしいずれかは指定する必要があります。]
     *
     * @param arg0 置換文字列{0}の値。
     * @param arg1 置換文字列{1}の値。
     * @return メッセージ文字列。
     */
    public String getMbati001(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbati001]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("メソッド[getMbati001]のパラメータ[arg1]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBATI001] " + fBundle.getMbati001(arg0, arg1);
    }

    /**
     * メッセージ定義ID[BlancoAntTask]、キー[MBATA001]の文字列を取得します。
     *
     * No.5:
     * 文字列[メタディレクトリ[{0}]が存在しません。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMbata001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbata001]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBATA001] " + fBundle.getMbata001(arg0);
    }

    /**
     * メッセージ定義ID[BlancoAntTask]、キー[MBATA002]の文字列を取得します。
     *
     * No.6:
     * 文字列[メタディレクトリ[{0}]のファイル一覧取得処理に失敗しました。]
     *
     * @param arg0 置換文字列{0}の値。
     * @return メッセージ文字列。
     */
    public String getMbata002(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("メソッド[getMbata002]のパラメータ[arg0]にnullが与えられました。しかし、このパラメータにnullを与えることはできません。");
        }

        return "[MBATA002] " + fBundle.getMbata002(arg0);
    }
}
