/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * メッセージ定義[BlancoAntTask]が内部的に利用するリソースバンドルクラス。
 *
 * リソースバンドル定義: [BlancoAntTaskMessage]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 */
class BlancoAntTaskMessageResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoAntTaskMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTaskMessage]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoAntTaskMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/message/BlancoAntTaskMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTaskMessage]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoAntTaskMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/message/BlancoAntTaskMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskMessageResourceBundleクラスのコンストラクタ。
     *
     * 基底名[BlancoAntTaskMessage]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoAntTaskMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/message/BlancoAntTaskMessage", locale, loader);
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
     * bundle[BlancoAntTaskMessage], key[MBATI001]
     *
     * [タスク名[{0}]、アトリビュート[{1}]において、[必須]と[デフォルト]が同時に指定されています。しかし[必須]と[デフォルト]は排他的に、しかしいずれかは指定する必要があります。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[MBATI001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbati001(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "タスク名[{0}]、アトリビュート[{1}]において、[必須]と[デフォルト]が同時に指定されています。しかし[必須]と[デフォルト]は排他的に、しかしいずれかは指定する必要があります。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBATI001");
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
     * bundle[BlancoAntTaskMessage], key[MBATA001]
     *
     * [メタディレクトリ[{0}]が存在しません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MBATA001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbata001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メタディレクトリ[{0}]が存在しません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBATA001");
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
     * bundle[BlancoAntTaskMessage], key[MBATA002]
     *
     * [メタディレクトリ[{0}]のファイル一覧取得処理に失敗しました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[MBATA002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMbata002(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メタディレクトリ[{0}]のファイル一覧取得処理に失敗しました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MBATA002");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
