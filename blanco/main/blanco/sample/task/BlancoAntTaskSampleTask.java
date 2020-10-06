package blanco.sample.task;

import java.math.BigDecimal;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput;

/**
 * Apache Antタスク [BlancoAntTaskSample]のクラス。
 *
 * このクラスは単にサンプルです。実際の動作には利用されません。<br>
 * このクラスでは、Apache Antタスクで一般的に必要なチェックなどのコーディングを肩代わりします。
 * 実際の処理は パッケージ[blanco.sample.task]にBlancoAntTaskSampleBatchProcessクラスを作成して記述してください。<br>
 * <br>
 * Antタスクへの組み込み例<br>
 * <pre>
 * &lt;taskdef name=&quot;blancoanttasksample&quot; classname=&quot;blanco.sample.task.BlancoAntTaskSampleTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoAntTaskSampleTask extends Task {
    /**
     * このクラスは単にサンプルです。実際の動作には利用されません。
     */
    protected BlancoAntTaskSampleProcessInput fInput = new BlancoAntTaskSampleProcessInput();

    /**
     * フィールド [attr1] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr1Processed = false;

    /**
     * フィールド [attr2] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr2Processed = false;

    /**
     * フィールド [attr3] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr3Processed = false;

    /**
     * フィールド [attr4] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr4Processed = false;

    /**
     * フィールド [attr5] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr5Processed = false;

    /**
     * フィールド [attr6] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr6Processed = false;

    /**
     * フィールド [attr7] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr7Processed = false;

    /**
     * フィールド [attr8] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr8Processed = false;

    /**
     * フィールド [attr9] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr9Processed = false;

    /**
     * フィールド [attr10] に値がセットされたかどうか。
     */
    protected boolean fIsFieldAttr10Processed = false;

    /**
     * verboseモードで動作させるかどうか。
     *
     * @param arg verboseモードで動作させるかどうか。
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verboseモードで動作させるかどうか。
     *
     * @return verboseモードで動作させるかどうか。
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Antタスクの[attr1]アトリビュートのセッターメソッド。
     *
     * 項目番号: 1<br>
     * 文字列（必須）<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr1(final String arg) {
        fInput.setAttr1(arg);
        fIsFieldAttr1Processed = true;
    }

    /**
     * Antタスクの[attr1]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 1<br>
     * 文字列（必須）<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr1() {
        return fInput.getAttr1();
    }

    /**
     * Antタスクの[attr2]アトリビュートのセッターメソッド。
     *
     * 項目番号: 2<br>
     * blanco:string<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr2(final String arg) {
        fInput.setAttr2(arg);
        fIsFieldAttr2Processed = true;
    }

    /**
     * Antタスクの[attr2]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 2<br>
     * blanco:string<br>
     * デフォルト値[デフォルト]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr2() {
        return fInput.getAttr2();
    }

    /**
     * Antタスクの[attr3]アトリビュートのセッターメソッド。
     *
     * 項目番号: 3<br>
     * 整数(int)(必須)<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr3(final String arg) {
        try {
            fInput.setAttr3(Integer.parseInt(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr3]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr3Processed = true;
    }

    /**
     * Antタスクの[attr3]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 3<br>
     * 整数(int)(必須)<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr3() {
        return String.valueOf(fInput.getAttr3());
    }

    /**
     * Antタスクの[attr4]アトリビュートのセッターメソッド。
     *
     * 項目番号: 4<br>
     * blanco:int<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr4(final String arg) {
        try {
            fInput.setAttr4(Integer.parseInt(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr4]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr4Processed = true;
    }

    /**
     * Antタスクの[attr4]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 4<br>
     * blanco:int<br>
     * デフォルト値[10]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr4() {
        return String.valueOf(fInput.getAttr4());
    }

    /**
     * Antタスクの[attr5]アトリビュートのセッターメソッド。
     *
     * 項目番号: 5<br>
     * 整数(long)(必須)<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr5(final String arg) {
        try {
            fInput.setAttr5(Long.parseLong(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr5]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr5Processed = true;
    }

    /**
     * Antタスクの[attr5]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 5<br>
     * 整数(long)(必須)<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr5() {
        return String.valueOf(fInput.getAttr5());
    }

    /**
     * Antタスクの[attr6]アトリビュートのセッターメソッド。
     *
     * 項目番号: 6<br>
     * blanco:long<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr6(final String arg) {
        try {
            fInput.setAttr6(Long.parseLong(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr6]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr6Processed = true;
    }

    /**
     * Antタスクの[attr6]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 6<br>
     * blanco:long<br>
     * デフォルト値[100]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr6() {
        return String.valueOf(fInput.getAttr6());
    }

    /**
     * Antタスクの[attr7]アトリビュートのセッターメソッド。
     *
     * 項目番号: 7<br>
     * 整数(decimal)(必須)<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr7(final String arg) {
        try {
            fInput.setAttr7(new BigDecimal(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr7]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr7Processed = true;
    }

    /**
     * Antタスクの[attr7]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 7<br>
     * 整数(decimal)(必須)<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr7() {
        return fInput.getAttr7().toString();
    }

    /**
     * Antタスクの[attr8]アトリビュートのセッターメソッド。
     *
     * 項目番号: 8<br>
     * 整数(decimal)<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr8(final String arg) {
        try {
            fInput.setAttr8(new BigDecimal(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Antタスクの[attr8]アトリビュートに与えられた値の数値解析に失敗しました。" + e.toString());
        }
        fIsFieldAttr8Processed = true;
    }

    /**
     * Antタスクの[attr8]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 8<br>
     * 整数(decimal)<br>
     * デフォルト値[123.456]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public String getAttr8() {
        return fInput.getAttr8().toString();
    }

    /**
     * Antタスクの[attr9]アトリビュートのセッターメソッド。
     *
     * 項目番号: 9<br>
     * 真偽(必須)<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr9(final boolean arg) {
        fInput.setAttr9(arg);
        fIsFieldAttr9Processed = true;
    }

    /**
     * Antタスクの[attr9]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 9<br>
     * 真偽(必須)<br>
     * 必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>
     *
     * @return このフィールドの値
     */
    public boolean getAttr9() {
        return fInput.getAttr9();
    }

    /**
     * Antタスクの[attr10]アトリビュートのセッターメソッド。
     *
     * 項目番号: 10<br>
     * blanco:boolean<br>
     *
     * @param arg セットしたい値
     */
    public void setAttr10(final boolean arg) {
        fInput.setAttr10(arg);
        fIsFieldAttr10Processed = true;
    }

    /**
     * Antタスクの[attr10]アトリビュートのゲッターメソッド。
     *
     * 項目番号: 10<br>
     * blanco:boolean<br>
     * デフォルト値[true]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>
     *
     * @return このフィールドの値
     */
    public boolean getAttr10() {
        return fInput.getAttr10();
    }

    /**
     * Antタスクのメイン処理。Apache Antから このメソッドが呼び出されます。
     *
     * @throws BuildException タスクとしての例外が発生した場合。
     */
    @Override
    public final void execute() throws BuildException {
        System.out.println("BlancoAntTaskSampleTask begin.");

        // 項目番号[1]、アトリビュート[attr1]は必須入力です。入力チェックを行います。
        if (fIsFieldAttr1Processed == false) {
            throw new BuildException("必須アトリビュート[attr1]が設定されていません。処理を中断します。");
        }
        // 項目番号[3]、アトリビュート[attr3]は必須入力です。入力チェックを行います。
        if (fIsFieldAttr3Processed == false) {
            throw new BuildException("必須アトリビュート[attr3]が設定されていません。処理を中断します。");
        }
        // 項目番号[5]、アトリビュート[attr5]は必須入力です。入力チェックを行います。
        if (fIsFieldAttr5Processed == false) {
            throw new BuildException("必須アトリビュート[attr5]が設定されていません。処理を中断します。");
        }
        // 項目番号[7]、アトリビュート[attr7]は必須入力です。入力チェックを行います。
        if (fIsFieldAttr7Processed == false) {
            throw new BuildException("必須アトリビュート[attr7]が設定されていません。処理を中断します。");
        }
        // 項目番号[9]、アトリビュート[attr9]は必須入力です。入力チェックを行います。
        if (fIsFieldAttr9Processed == false) {
            throw new BuildException("必須アトリビュート[attr9]が設定されていません。処理を中断します。");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- attr1:[" + getAttr1() + "]");
            System.out.println("- attr2:[" + getAttr2() + "]");
            System.out.println("- attr3:[" + getAttr3() + "]");
            System.out.println("- attr4:[" + getAttr4() + "]");
            System.out.println("- attr5:[" + getAttr5() + "]");
            System.out.println("- attr6:[" + getAttr6() + "]");
            System.out.println("- attr7:[" + getAttr7() + "]");
            System.out.println("- attr8:[" + getAttr8() + "]");
            System.out.println("- attr9:[" + getAttr9() + "]");
            System.out.println("- attr10:[" + getAttr10() + "]");
        }

        try {
            // 実際のAntタスクの主処理を実行します。
            // この箇所でコンパイルエラーが発生する場合、BlancoAntTaskSampleProcessインタフェースを実装して blanco.sample.taskパッケージに BlancoAntTaskSampleProcessImplクラスを作成することにより解決できる場合があります。
            final BlancoAntTaskSampleProcess proc = new BlancoAntTaskSampleProcessImpl();
            if (proc.execute(fInput) != BlancoAntTaskSampleBatchProcess.END_SUCCESS) {
                throw new BuildException("タスクは異常終了しました。");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("タスクを処理中に例外が発生しました。処理を中断します。" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("タスクを処理中にエラーが発生しました。処理を中断します。" + e.toString());
        }
    }
}
