/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.sample.task;

import java.io.IOException;
import java.math.BigDecimal;

import blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput;

/**
 * バッチ処理クラス [BlancoAntTaskSampleBatchProcess]。
 *
 * <P>バッチ処理の呼び出し例。</P>
 * <code>
 * java -classpath (クラスパス) blanco.sample.task.BlancoAntTaskSampleBatchProcess -help
 * </code>
 */
public class BlancoAntTaskSampleBatchProcess {
    /**
     * 正常終了。
     */
    public static final int END_SUCCESS = 0;

    /**
     * 入力異常終了。内部的にjava.lang.IllegalArgumentExceptionが発生した場合。
     */
    public static final int END_ILLEGAL_ARGUMENT_EXCEPTION = 7;

    /**
     * 入出力例外終了。内部的にjava.io.IOExceptionが発生した場合。
     */
    public static final int END_IO_EXCEPTION = 8;

    /**
     * 異常終了。バッチの処理開始に失敗した場合、および内部的にjava.lang.Errorまたはjava.lang.RuntimeExceptionが発生した場合。
     */
    public static final int END_ERROR = 9;

    /**
     * コマンドラインから実行された際のエントリポイントです。
     *
     * @param args コンソールから引き継がれた引数。
     */
    public static final void main(final String[] args) {
        final BlancoAntTaskSampleBatchProcess batchProcess = new BlancoAntTaskSampleBatchProcess();

        // バッチ処理の引数。
        final BlancoAntTaskSampleProcessInput input = new BlancoAntTaskSampleProcessInput();

        boolean isNeedUsage = false;
        boolean isFieldAttr1Processed = false;
        boolean isFieldAttr3Processed = false;
        boolean isFieldAttr5Processed = false;
        boolean isFieldAttr7Processed = false;
        boolean isFieldAttr9Processed = false;

        // コマンドライン引数の解析をおこないます。
        for (int index = 0; index < args.length; index++) {
            String arg = args[index];
            if (arg.startsWith("-verbose=")) {
                input.setVerbose(Boolean.valueOf(arg.substring(9)).booleanValue());
            } else if (arg.startsWith("-attr1=")) {
                input.setAttr1(arg.substring(7));
                isFieldAttr1Processed = true;
            } else if (arg.startsWith("-attr2=")) {
                input.setAttr2(arg.substring(7));
            } else if (arg.startsWith("-attr3=")) {
                try {
                    input.setAttr3(Integer.parseInt(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr3]を数値(int)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr3Processed = true;
            } else if (arg.startsWith("-attr4=")) {
                try {
                    input.setAttr4(Integer.parseInt(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr4]を数値(int)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr5=")) {
                try {
                    input.setAttr5(Long.parseLong(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr5]を数値(long)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr5Processed = true;
            } else if (arg.startsWith("-attr6=")) {
                try {
                    input.setAttr6(Long.parseLong(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr6]を数値(long)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr7=")) {
                try {
                    input.setAttr7(new BigDecimal(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr7]を数値(decimal)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr7Processed = true;
            } else if (arg.startsWith("-attr8=")) {
                try {
                    input.setAttr8(new BigDecimal(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]のフィールド[attr8]を数値(decimal)としてパースを試みましたが失敗しました。: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr9=")) {
                input.setAttr9(Boolean.valueOf(arg.substring(7)).booleanValue());
                isFieldAttr9Processed = true;
            } else if (arg.startsWith("-attr10=")) {
                input.setAttr10(Boolean.valueOf(arg.substring(8)).booleanValue());
            } else if (arg.equals("-?") || arg.equals("-help")) {
                usage();
                System.exit(END_SUCCESS);
            } else {
                System.out.println("BlancoAntTaskSampleBatchProcess: 入力パラメータ[" + arg + "]は無視されました。");
                isNeedUsage = true;
            }
        }

        if (isNeedUsage) {
            usage();
        }

        if( isFieldAttr1Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr1]に値が設定されていません。");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr3Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr3]に値が設定されていません。");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr5Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr5]に値が設定されていません。");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr7Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr7]に値が設定されていません。");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr9Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr9]に値が設定されていません。");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }

        int retCode = batchProcess.execute(input);

        // 終了コードを戻します。
        // ※注意：System.exit()を呼び出している点に注意してください。
        System.exit(retCode);
    }

    /**
     * 具体的なバッチ処理内容を記述するためのメソッドです。
     *
     * このメソッドに実際の処理内容を記述します。
     *
     * @param input バッチ処理の入力パラメータ。
     * @return バッチ処理の終了コード。END_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR のいずれかの値を戻します。
     * @throws IOException 入出力例外が発生した場合。
     * @throws IllegalArgumentException 入力値に不正が見つかった場合。
     */
    public int process(final BlancoAntTaskSampleProcessInput input) throws IOException, IllegalArgumentException {
        // 入力パラメータをチェックします。
        validateInput(input);

        // この箇所でコンパイルエラーが発生する場合、BlancoAntTaskSampleProcessインタフェースを実装して blanco.sample.taskパッケージに BlancoAntTaskSampleProcessImplクラスを作成することにより解決できる場合があります。
        final BlancoAntTaskSampleProcess process = new BlancoAntTaskSampleProcessImpl();

        // 処理の本体を実行します。
        final int retCode = process.execute(input);

        return retCode;
    }

    /**
     * クラスをインスタンス化してバッチを実行する際のエントリポイントです。
     *
     * このメソッドは下記の仕様を提供します。
     * <ul>
     * <li>メソッドの入力パラメータの内容チェック。
     * <li>IllegalArgumentException, RuntimeException, Errorなどの例外をcatchして戻り値へと変換。
     * </ul>
     *
     * @param input バッチ処理の入力パラメータ。
     * @return バッチ処理の終了コード。END_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR のいずれかの値を戻します。
     * @throws IllegalArgumentException 入力値に不正が見つかった場合。
     */
    public final int execute(final BlancoAntTaskSampleProcessInput input) throws IllegalArgumentException {
        try {
            // バッチ処理の本体を実行します。
            int retCode = process(input);

            return retCode;
        } catch (IllegalArgumentException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 入力例外が発生しました。バッチ処理を中断します。:" + ex.toString());
            // 入力異常終了。
            return END_ILLEGAL_ARGUMENT_EXCEPTION;
        } catch (IOException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: 入出力例外が発生しました。バッチ処理を中断します。:" + ex.toString());
            // 入力異常終了。
            return END_IO_EXCEPTION;
        } catch (RuntimeException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: ランタイム例外が発生しました。バッチ処理を中断します。:" + ex.toString());
            ex.printStackTrace();
            // 異常終了。
            return END_ERROR;
        } catch (Error er) {
            System.out.println("BlancoAntTaskSampleBatchProcess: ランタイムエラーが発生しました。バッチ処理を中断します。:" + er.toString());
            er.printStackTrace();
            // 異常終了。
            return END_ERROR;
        }
    }

    /**
     * このバッチ処理クラスの使い方の説明を標準出力に示すためのメソッドです。
     */
    public static final void usage() {
        System.out.println("BlancoAntTaskSampleBatchProcess: Usage:");
        System.out.println("  java blanco.sample.task.BlancoAntTaskSampleBatchProcess -verbose=値1 -attr1=値2 -attr2=値3 -attr3=値4 -attr4=値5 -attr5=値6 -attr6=値7 -attr7=値8 -attr8=値9 -attr9=値10 -attr10=値11");
        System.out.println("    -verbose");
        System.out.println("      説明[verboseモードで動作させるかどうか。]");
        System.out.println("      型[真偽]");
        System.out.println("      デフォルト値[false]");
        System.out.println("    -attr1");
        System.out.println("      説明[文字列（必須）]");
        System.out.println("      型[文字列]");
        System.out.println("      必須パラメータ");
        System.out.println("    -attr2");
        System.out.println("      説明[blanco:string]");
        System.out.println("      型[文字列]");
        System.out.println("      デフォルト値[デフォルト]");
        System.out.println("    -attr3");
        System.out.println("      説明[整数(int)(必須)]");
        System.out.println("      型[数値(int)]");
        System.out.println("      必須パラメータ");
        System.out.println("    -attr4");
        System.out.println("      説明[blanco:int]");
        System.out.println("      型[数値(int)]");
        System.out.println("      デフォルト値[10]");
        System.out.println("    -attr5");
        System.out.println("      説明[整数(long)(必須)]");
        System.out.println("      型[数値(long)]");
        System.out.println("      必須パラメータ");
        System.out.println("    -attr6");
        System.out.println("      説明[blanco:long]");
        System.out.println("      型[数値(long)]");
        System.out.println("      デフォルト値[100]");
        System.out.println("    -attr7");
        System.out.println("      説明[整数(decimal)(必須)]");
        System.out.println("      型[数値(decimal)]");
        System.out.println("      必須パラメータ");
        System.out.println("    -attr8");
        System.out.println("      説明[整数(decimal)]");
        System.out.println("      型[数値(decimal)]");
        System.out.println("      デフォルト値[123.456]");
        System.out.println("    -attr9");
        System.out.println("      説明[真偽(必須)]");
        System.out.println("      型[真偽]");
        System.out.println("      必須パラメータ");
        System.out.println("    -attr10");
        System.out.println("      説明[blanco:boolean]");
        System.out.println("      型[真偽]");
        System.out.println("      デフォルト値[true]");
        System.out.println("    -? , -help");
        System.out.println("      説明[使い方を表示します。]");
    }

    /**
     * このバッチ処理クラスの入力パラメータの妥当性チェックを実施するためのメソッドです。
     *
     * @param input バッチ処理の入力パラメータ。
     * @throws IllegalArgumentException 入力値に不正が見つかった場合。
     */
    public void validateInput(final BlancoAntTaskSampleProcessInput input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("BlancoBatchProcessBatchProcess: 処理開始失敗。入力パラメータ[input]にnullが与えられました。");
        }
        if (input.getAttr1() == null) {
            throw new IllegalArgumentException("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr1]に値が設定されていません。");
        }
        if (input.getAttr7() == null) {
            throw new IllegalArgumentException("BlancoAntTaskSampleBatchProcess: 処理開始失敗。入力パラメータ[input]の必須フィールド値[attr7]に値が設定されていません。");
        }
    }
}
