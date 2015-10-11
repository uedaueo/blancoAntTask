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

import java.util.List;

/**
 * blancoAntTaskのなかで利用されるValueObjectです。
 */
public class BlancoAntTaskStructure {
    /**
     * タスク名を指定します。必須項目です。
     *
     * フィールド: [name]。
     */
    private String fName;

    /**
     * パッケージ名を指定します。必須項目です。
     *
     * フィールド: [package]。
     */
    private String fPackage;

    /**
     * 説明を記載します。
     *
     * フィールド: [description]。
     */
    private String fDescription;

    /**
     * クラス名の後方に付与されるサフィックス。
     *
     * フィールド: [suffix]。
     */
    private String fSuffix;

    /**
     * アトリビュートを保持するリスト。
     *
     * フィールド: [attributeList]。
     * デフォルト: [new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>()]。
     */
    private List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> fAttributeList = new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>();

    /**
     * フィールド [name] の値を設定します。
     *
     * フィールドの説明: [タスク名を指定します。必須項目です。]。
     *
     * @param argName フィールド[name]に設定する値。
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * フィールド [name] の値を取得します。
     *
     * フィールドの説明: [タスク名を指定します。必須項目です。]。
     *
     * @return フィールド[name]から取得した値。
     */
    public String getName() {
        return fName;
    }

    /**
     * フィールド [package] の値を設定します。
     *
     * フィールドの説明: [パッケージ名を指定します。必須項目です。]。
     *
     * @param argPackage フィールド[package]に設定する値。
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * フィールド [package] の値を取得します。
     *
     * フィールドの説明: [パッケージ名を指定します。必須項目です。]。
     *
     * @return フィールド[package]から取得した値。
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * フィールド [description] の値を設定します。
     *
     * フィールドの説明: [説明を記載します。]。
     *
     * @param argDescription フィールド[description]に設定する値。
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * フィールド [description] の値を取得します。
     *
     * フィールドの説明: [説明を記載します。]。
     *
     * @return フィールド[description]から取得した値。
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * フィールド [suffix] の値を設定します。
     *
     * フィールドの説明: [クラス名の後方に付与されるサフィックス。]。
     *
     * @param argSuffix フィールド[suffix]に設定する値。
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * フィールド [suffix] の値を取得します。
     *
     * フィールドの説明: [クラス名の後方に付与されるサフィックス。]。
     *
     * @return フィールド[suffix]から取得した値。
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * フィールド [attributeList] の値を設定します。
     *
     * フィールドの説明: [アトリビュートを保持するリスト。]。
     *
     * @param argAttributeList フィールド[attributeList]に設定する値。
     */
    public void setAttributeList(final List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> argAttributeList) {
        fAttributeList = argAttributeList;
    }

    /**
     * フィールド [attributeList] の値を取得します。
     *
     * フィールドの説明: [アトリビュートを保持するリスト。]。
     * デフォルト: [new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>()]。
     *
     * @return フィールド[attributeList]から取得した値。
     */
    public List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> getAttributeList() {
        return fAttributeList;
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
        buf.append("blanco.anttask.valueobject.BlancoAntTaskStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",attributeList=" + fAttributeList);
        buf.append("]");
        return buf.toString();
    }
}
