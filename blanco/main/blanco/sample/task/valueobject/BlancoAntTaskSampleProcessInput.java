/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.sample.task.valueobject;

import java.math.BigDecimal;

/**
 * 処理クラス [BlancoAntTaskSampleProcess]の入力バリューオブジェクトクラスです。
 */
public class BlancoAntTaskSampleProcessInput {
    /**
     * verboseモードで動作させるかどうか。
     *
     * フィールド: [verbose]。
     * デフォルト: [false]。
     */
    private boolean fVerbose = false;

    /**
     * 文字列（必須）
     *
     * フィールド: [attr1]。
     */
    private String fAttr1;

    /**
     * blanco:string
     *
     * フィールド: [attr2]。
     * デフォルト: [デフォルト]。
     */
    private String fAttr2 = "デフォルト";

    /**
     * 整数(int)(必須)
     *
     * フィールド: [attr3]。
     */
    private int fAttr3;

    /**
     * blanco:int
     *
     * フィールド: [attr4]。
     * デフォルト: [10]。
     */
    private int fAttr4 = 10;

    /**
     * 整数(long)(必須)
     *
     * フィールド: [attr5]。
     */
    private long fAttr5;

    /**
     * blanco:long
     *
     * フィールド: [attr6]。
     * デフォルト: [100]。
     */
    private long fAttr6 = 100;

    /**
     * 整数(decimal)(必須)
     *
     * フィールド: [attr7]。
     */
    private BigDecimal fAttr7;

    /**
     * 整数(decimal)
     *
     * フィールド: [attr8]。
     * デフォルト: [123.456]。
     */
    private BigDecimal fAttr8 = new BigDecimal("123.456");

    /**
     * 真偽(必須)
     *
     * フィールド: [attr9]。
     */
    private boolean fAttr9;

    /**
     * blanco:boolean
     *
     * フィールド: [attr10]。
     * デフォルト: [true]。
     */
    private boolean fAttr10 = true;

    /**
     * フィールド [verbose] の値を設定します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     *
     * @param argVerbose フィールド[verbose]に設定する値。
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * フィールド [verbose] の値を取得します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     * デフォルト: [false]。
     *
     * @return フィールド[verbose]から取得した値。
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * フィールド [attr1] の値を設定します。
     *
     * フィールドの説明: [文字列（必須）]。
     *
     * @param argAttr1 フィールド[attr1]に設定する値。
     */
    public void setAttr1(final String argAttr1) {
        fAttr1 = argAttr1;
    }

    /**
     * フィールド [attr1] の値を取得します。
     *
     * フィールドの説明: [文字列（必須）]。
     *
     * @return フィールド[attr1]から取得した値。
     */
    public String getAttr1() {
        return fAttr1;
    }

    /**
     * フィールド [attr2] の値を設定します。
     *
     * フィールドの説明: [blanco:string]。
     *
     * @param argAttr2 フィールド[attr2]に設定する値。
     */
    public void setAttr2(final String argAttr2) {
        fAttr2 = argAttr2;
    }

    /**
     * フィールド [attr2] の値を取得します。
     *
     * フィールドの説明: [blanco:string]。
     * デフォルト: [デフォルト]。
     *
     * @return フィールド[attr2]から取得した値。
     */
    public String getAttr2() {
        return fAttr2;
    }

    /**
     * フィールド [attr3] の値を設定します。
     *
     * フィールドの説明: [整数(int)(必須)]。
     *
     * @param argAttr3 フィールド[attr3]に設定する値。
     */
    public void setAttr3(final int argAttr3) {
        fAttr3 = argAttr3;
    }

    /**
     * フィールド [attr3] の値を取得します。
     *
     * フィールドの説明: [整数(int)(必須)]。
     *
     * @return フィールド[attr3]から取得した値。
     */
    public int getAttr3() {
        return fAttr3;
    }

    /**
     * フィールド [attr4] の値を設定します。
     *
     * フィールドの説明: [blanco:int]。
     *
     * @param argAttr4 フィールド[attr4]に設定する値。
     */
    public void setAttr4(final int argAttr4) {
        fAttr4 = argAttr4;
    }

    /**
     * フィールド [attr4] の値を取得します。
     *
     * フィールドの説明: [blanco:int]。
     * デフォルト: [10]。
     *
     * @return フィールド[attr4]から取得した値。
     */
    public int getAttr4() {
        return fAttr4;
    }

    /**
     * フィールド [attr5] の値を設定します。
     *
     * フィールドの説明: [整数(long)(必須)]。
     *
     * @param argAttr5 フィールド[attr5]に設定する値。
     */
    public void setAttr5(final long argAttr5) {
        fAttr5 = argAttr5;
    }

    /**
     * フィールド [attr5] の値を取得します。
     *
     * フィールドの説明: [整数(long)(必須)]。
     *
     * @return フィールド[attr5]から取得した値。
     */
    public long getAttr5() {
        return fAttr5;
    }

    /**
     * フィールド [attr6] の値を設定します。
     *
     * フィールドの説明: [blanco:long]。
     *
     * @param argAttr6 フィールド[attr6]に設定する値。
     */
    public void setAttr6(final long argAttr6) {
        fAttr6 = argAttr6;
    }

    /**
     * フィールド [attr6] の値を取得します。
     *
     * フィールドの説明: [blanco:long]。
     * デフォルト: [100]。
     *
     * @return フィールド[attr6]から取得した値。
     */
    public long getAttr6() {
        return fAttr6;
    }

    /**
     * フィールド [attr7] の値を設定します。
     *
     * フィールドの説明: [整数(decimal)(必須)]。
     *
     * @param argAttr7 フィールド[attr7]に設定する値。
     */
    public void setAttr7(final BigDecimal argAttr7) {
        fAttr7 = argAttr7;
    }

    /**
     * フィールド [attr7] の値を取得します。
     *
     * フィールドの説明: [整数(decimal)(必須)]。
     *
     * @return フィールド[attr7]から取得した値。
     */
    public BigDecimal getAttr7() {
        return fAttr7;
    }

    /**
     * フィールド [attr8] の値を設定します。
     *
     * フィールドの説明: [整数(decimal)]。
     *
     * @param argAttr8 フィールド[attr8]に設定する値。
     */
    public void setAttr8(final BigDecimal argAttr8) {
        fAttr8 = argAttr8;
    }

    /**
     * フィールド [attr8] の値を取得します。
     *
     * フィールドの説明: [整数(decimal)]。
     * デフォルト: [123.456]。
     *
     * @return フィールド[attr8]から取得した値。
     */
    public BigDecimal getAttr8() {
        return fAttr8;
    }

    /**
     * フィールド [attr9] の値を設定します。
     *
     * フィールドの説明: [真偽(必須)]。
     *
     * @param argAttr9 フィールド[attr9]に設定する値。
     */
    public void setAttr9(final boolean argAttr9) {
        fAttr9 = argAttr9;
    }

    /**
     * フィールド [attr9] の値を取得します。
     *
     * フィールドの説明: [真偽(必須)]。
     *
     * @return フィールド[attr9]から取得した値。
     */
    public boolean getAttr9() {
        return fAttr9;
    }

    /**
     * フィールド [attr10] の値を設定します。
     *
     * フィールドの説明: [blanco:boolean]。
     *
     * @param argAttr10 フィールド[attr10]に設定する値。
     */
    public void setAttr10(final boolean argAttr10) {
        fAttr10 = argAttr10;
    }

    /**
     * フィールド [attr10] の値を取得します。
     *
     * フィールドの説明: [blanco:boolean]。
     * デフォルト: [true]。
     *
     * @return フィールド[attr10]から取得した値。
     */
    public boolean getAttr10() {
        return fAttr10;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",attr1=" + fAttr1);
        buf.append(",attr2=" + fAttr2);
        buf.append(",attr3=" + fAttr3);
        buf.append(",attr4=" + fAttr4);
        buf.append(",attr5=" + fAttr5);
        buf.append(",attr6=" + fAttr6);
        buf.append(",attr7=" + fAttr7);
        buf.append(",attr8=" + fAttr8);
        buf.append(",attr9=" + fAttr9);
        buf.append(",attr10=" + fAttr10);
        buf.append("]");
        return buf.toString();
    }
}
