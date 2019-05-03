/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoAntTaskが利用するリソースバンドルを蓄えます。
 *
 * リソースバンドル定義: [BlancoAntTask]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoAntTaskResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoAntTaskResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTask]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoAntTaskResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTask]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoAntTaskResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTask]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoAntTaskResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * 内部的に保持しているリソースバンドルオブジェクトを取得します。
     *
     * @return 内部的に保持しているリソースバンドルオブジェクト。
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoAntTask], key[METAFILE_DISPLAYNAME]
     *
     * [AntTask定義書] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMetafileDisplayname() {
        // 初期値として定義書の値を利用します。
        String strFormat = "AntTask定義書";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[ITEM_NO]
     *
     * [項目番号] (ja)<br>
     *
     * @return key[ITEM_NO]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getItemNo() {
        // 初期値として定義書の値を利用します。
        String strFormat = "項目番号";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ITEM_NO");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[ITEM_REQUIRED]
     *
     * [必須項目] (ja)<br>
     *
     * @return key[ITEM_REQUIRED]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getItemRequired() {
        // 初期値として定義書の値を利用します。
        String strFormat = "必須項目";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ITEM_REQUIRED");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.01]
     *
     * [Apache Antタスク [{0}]のクラス。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[CLASSCOMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "Apache Antタスク [{0}]のクラス。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.02]
     *
     * [このクラスでは、Apache Antタスクで一般的に必要なチェックなどのコーディングを肩代わりします。] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このクラスでは、Apache Antタスクで一般的に必要なチェックなどのコーディングを肩代わりします。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.03]
     *
     * [実際の処理は パッケージ[{0}]に{1}クラスを作成して記述してください。&lt;br&gt;] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[CLASSCOMMENT.03]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment03(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "実際の処理は パッケージ[{0}]に{1}クラスを作成して記述してください。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.04]
     *
     * [Antタスクへの組み込み例&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getClasscomment04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクへの組み込み例<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.01]
     *
     * [Antタスクの[{0}]アトリビュート。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[FIELD.COMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldComment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクの[{0}]アトリビュート。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.02]
     *
     * [フィールド [{0}] に値がセットされたかどうか。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[FIELD.COMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldComment02(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "フィールド [{0}] に値がセットされたかどうか。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.VERBOSE]
     *
     * [verboseモードで動作させるかどうか。] (ja)<br>
     *
     * @return key[FIELD.COMMENT.VERBOSE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getFieldCommentVerbose() {
        // 初期値として定義書の値を利用します。
        String strFormat = "verboseモードで動作させるかどうか。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.VERBOSE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.COMMENT.01]
     *
     * [Antタスクの[{0}]アトリビュートのセッターメソッド。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.SET.COMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodSetComment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクの[{0}]アトリビュートのセッターメソッド。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.COMMENT.02]
     *
     * [セットしたい値] (ja)<br>
     *
     * @return key[METHOD.SET.COMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodSetComment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "セットしたい値";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.LINE.01]
     *
     * [Antタスクの[{0}]アトリビュートに与えられた値の数値解析に失敗しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.SET.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodSetLine01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクの[{0}]アトリビュートに与えられた値の数値解析に失敗しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.01]
     *
     * [Antタスクの[{0}]アトリビュートのゲッターメソッド。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.GET.COMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodGetComment01(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクの[{0}]アトリビュートのゲッターメソッド。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.11]
     *
     * [必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。&lt;br&gt;] (ja)<br>
     *
     * @return key[METHOD.GET.COMMENT.11]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodGetComment11() {
        // 初期値として定義書の値を利用します。
        String strFormat = "必須アトリビュートです。Apache Antタスク上で必ず値が指定されます。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.11");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.12]
     *
     * [デフォルト値[{0}]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。&lt;br&gt;] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.GET.COMMENT.12]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodGetComment12(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "デフォルト値[{0}]が設定されています。Apache Antタスク上でアトリビュートの指定が無い場合には、デフォルト値が設定されます。<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.12");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.13]
     *
     * [このフィールドの値] (ja)<br>
     *
     * @return key[METHOD.GET.COMMENT.13]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodGetComment13() {
        // 初期値として定義書の値を利用します。
        String strFormat = "このフィールドの値";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.13");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.COMMENT.01]
     *
     * [Antタスクのメイン処理。Apache Antから このメソッドが呼び出されます。] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.COMMENT.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteComment01() {
        // 初期値として定義書の値を利用します。
        String strFormat = "Antタスクのメイン処理。Apache Antから このメソッドが呼び出されます。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.COMMENT.02]
     *
     * [タスクとしての例外が発生した場合。] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.COMMENT.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteComment02() {
        // 初期値として定義書の値を利用します。
        String strFormat = "タスクとしての例外が発生した場合。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.01]
     *
     * [// {0}アトリビュート[{1}]は必須入力です。入力チェックを行います。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.EXECUTE.LINE.01]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteLine01(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "// {0}アトリビュート[{1}]は必須入力です。入力チェックを行います。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.02]
     *
     * [必須アトリビュート[{0}]が設定されていません。処理を中断します。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[METHOD.EXECUTE.LINE.02]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteLine02(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "必須アトリビュート[{0}]が設定されていません。処理を中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.04]
     *
     * [// 実際のAntタスクの主処理を実行します。] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.04]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteLine04() {
        // 初期値として定義書の値を利用します。
        String strFormat = "// 実際のAntタスクの主処理を実行します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.05]
     *
     * [タスクを処理中に例外が発生しました。処理を中断します。] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.05]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteLine05() {
        // 初期値として定義書の値を利用します。
        String strFormat = "タスクを処理中に例外が発生しました。処理を中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.06]
     *
     * [タスクを処理中にエラーが発生しました。処理を中断します。] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.06]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMethodExecuteLine06() {
        // 初期値として定義書の値を利用します。
        String strFormat = "タスクを処理中にエラーが発生しました。処理を中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }
}
