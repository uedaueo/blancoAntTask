/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.valueobject;

/**
 * blancoAntTaskのなかで利用されるValueObjectです。
 */
public class BlancoAntTaskAttributeStructure {
    /**
     * 項目番号。
     *
     * フィールド: [no]。
     */
    private String fNo;

    /**
     * アトリビュート名。
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * 型。
     *
     * フィールド: [type]。
     * デフォルト: ["blanco:string"]。
     */
    private String fType = "blanco:string";

    /**
     * 必須項目かどうか。
     *
     * フィールド: [require]。
     * デフォルト: [false]。
     */
    private boolean fRequire = false;

    /**
     * デフォルト値。
     *
     * フィールド: [default]。
     */
    private String fDefault;

    /**
     * 説明。
     *
     * フィールド: [description]。
     */
    private String fDescription;

    /**
     * フィールド [no] の値を設定します。
     *
     * フィールドの説明: [項目番号。]。
     *
     * @param argNo フィールド[no]に設定する値。
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * フィールド [no] の値を取得します。
     *
     * フィールドの説明: [項目番号。]。
     *
     * @return フィールド[no]から取得した値。
     */
    public String getNo() {
        return fNo;
    }

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [アトリビュート名。]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [アトリビュート名。]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [type] の値を設定します。
     *
     * フィールドの説明: [型。]。
     *
     * @param argType フィールド[type]に設定する値。
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * フィールド [type] の値を取得します。
     *
     * フィールドの説明: [型。]。
     * デフォルト: ["blanco:string"]。
     *
     * @return フィールド[type]から取得した値。
     */
    public String getType() {
        return fType;
    }

    /**
     * フィールド [require] の値を設定します。
     *
     * フィールドの説明: [必須項目かどうか。]。
     *
     * @param argRequire フィールド[require]に設定する値。
     */
    public void setRequire(final boolean argRequire) {
        fRequire = argRequire;
    }

    /**
     * フィールド [require] の値を取得します。
     *
     * フィールドの説明: [必須項目かどうか。]。
     * デフォルト: [false]。
     *
     * @return フィールド[require]から取得した値。
     */
    public boolean getRequire() {
        return fRequire;
    }

    /**
     * フィールド [default] の値を設定します。
     *
     * フィールドの説明: [デフォルト値。]。
     *
     * @param argDefault フィールド[default]に設定する値。
     */
    public void setDefault(final String argDefault) {
        fDefault = argDefault;
    }

    /**
     * フィールド [default] の値を取得します。
     *
     * フィールドの説明: [デフォルト値。]。
     *
     * @return フィールド[default]から取得した値。
     */
    public String getDefault() {
        return fDefault;
    }

    /**
     * フィールド [description] の値を設定します。
     *
     * フィールドの説明: [説明。]。
     *
     * @param argDescription フィールド[description]に設定する値。
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド [description] の値を取得します。
     *
     * フィールドの説明: [説明。]。
     *
     * @return フィールド[description]から取得した値。
     */
    public String getDescription() {
        return fDescription;
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
        buf.append("blanco.anttask.valueobject.BlancoAntTaskAttributeStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",require=" + fRequire);
        buf.append(",default=" + fDefault);
        buf.append(",description=" + fDescription);
        buf.append("]");
        return buf.toString();
    }

    /**
     * このバリューオブジェクトを指定のターゲットに複写します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ複写処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @param target target value object.
     */
    public void copyTo(final BlancoAntTaskAttributeStructure target) {
        if (target == null) {
            throw new IllegalArgumentException("Bug: BlancoAntTaskAttributeStructure#copyTo(target): argument 'target' is null");
        }

        // No needs to copy parent class.

        // Name: fNo
        // Type: java.lang.String
        target.fNo = this.fNo;
        // Name: fName
        // Type: java.lang.String
        target.fName = this.fName;
        // Name: fType
        // Type: java.lang.String
        target.fType = this.fType;
        // Name: fRequire
        // Type: boolean
        target.fRequire = this.fRequire;
        // Name: fDefault
        // Type: java.lang.String
        target.fDefault = this.fDefault;
        // Name: fDescription
        // Type: java.lang.String
        target.fDescription = this.fDescription;
    }
}
