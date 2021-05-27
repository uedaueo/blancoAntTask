/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import blanco.anttask.message.BlancoAntTaskMessage;
import blanco.anttask.valueobject.BlancoAntTaskAttributeStructure;
import blanco.anttask.valueobject.BlancoAntTaskStructure;
import blanco.commons.util.BlancoStringUtil;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * Extracts information from the "Batch Processing Definition Form" Excel format.
 * 
 * This class is responsible for extracting information from intermediate XML files.
 * 
 * @author IGA Tosiki
 */
public class BlancoAntTaskXmlParser {
    /**
     * Defines a message.
     */
    protected final BlancoAntTaskMessage fMsg = new BlancoAntTaskMessage();

    /**
     * Parses an XML document in an intermediate XML file to get an array of information.
     * 
     * @param argMetaXmlSourceFile
     *            An intermediate XML file.
     * @return An array of information obtained as a result of parsing.
     */
    public BlancoAntTaskStructure[] parse(final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);
    }

    /**
     * Parses an XML document in an intermediate XML file to get an array of value object information.
     * 
     * @param argXmlDocument
     *            XML document of an intermediate XML file.
     * @return An array of value object information obtained as a result of parsing.
     */
    public BlancoAntTaskStructure[] parse(final BlancoXmlDocument argXmlDocument) {
        final List<BlancoAntTaskStructure> listStructure = new ArrayList<BlancoAntTaskStructure>();
        // Gets the root element.
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // The process is aborted if there is no root element.
            return null;
        }

        // Gets a list of sheets (Excel sheets).
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");
        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoAntTaskStructure structure = parseElementSheet(elementSheet);
            if (structure != null) {
                // Memorize the obtained information.
                listStructure.add(structure);
            }
        }

        final BlancoAntTaskStructure[] result = new BlancoAntTaskStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * Parses the "sheet" XML element in the intermediate XML file to get the value object information.
     * 
     * @param argElementSheet
     *            "sheet" XML element in the intermediate XML file.
     * @return Value object information obtained as a result of parsing.
     *           Null is returned if "name" is not found.
     */
    public BlancoAntTaskStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoAntTaskStructure structure = new BlancoAntTaskStructure();
        // Gets the input parameter information.

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoanttask-common");
        if (listCommon.size() == 0) {
            // Skips if these is no common.
            return null;
        }

        // Processes only the first item.
        final BlancoXmlElement elementCommon = listCommon.get(0);

        // Gets detailed information from the sheet.
        structure.setName(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "taskName"));
        structure.setPackage(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "packageName"));

        if (BlancoStringUtil.null2Blank(structure.getName()).length() == 0) {
            return null;
        }

        if (BlancoStringUtil.null2Blank(structure.getPackage()).trim().length() == 0) {
            throw new IllegalArgumentException("Package name is not specified["
                    + structure.getName() + "]");
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "description") != null) {
            structure.setDescription(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "description"));
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "suffix") != null) {
            structure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "suffix"));
        }

        final BlancoXmlElement elementAttributes = BlancoXmlBindingUtil
                .getElement(argElementSheet, "blancoanttask-list");
        if (elementAttributes == null) {
            return null;
        }

        // Gets the contents of the list.
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listField = BlancoXmlBindingUtil
                .getElementsByTagName(elementAttributes, "attribute");
        for (int indexField = 0; indexField < listField.size(); indexField++) {
            final BlancoXmlElement elementField = listField.get(indexField);

            final BlancoAntTaskAttributeStructure attributeStructure = new BlancoAntTaskAttributeStructure();

            attributeStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                    elementField, "no"));
            attributeStructure.setName(BlancoXmlBindingUtil.getTextContent(
                    elementField, "attribute"));
            if (BlancoStringUtil.null2Blank(attributeStructure.getName())
                    .length() == 0) {
                // Skips if attribute is not specified.
                continue;
            }

            if (BlancoStringUtil.null2Blank(
                    BlancoXmlBindingUtil.getTextContent(elementField, "type"))
                    .length() > 0) {
                attributeStructure.setType(BlancoXmlBindingUtil.getTextContent(
                        elementField, "type"));
            }

            attributeStructure.setRequire("true".equals(BlancoXmlBindingUtil
                    .getTextContent(elementField, "require")));
            attributeStructure.setDefault(BlancoXmlBindingUtil.getTextContent(
                    elementField, "default"));
            attributeStructure.setDescription(BlancoXmlBindingUtil
                    .getTextContent(elementField, "description"));

            if (attributeStructure.getRequire()) {
                if (BlancoStringUtil
                        .null2Blank(attributeStructure.getDefault()).length() > 0) {
                    // In task_name[{0}] and attribute[{1}], [Required] and [Default] are specified at the same time.
                    // However, [Required] and [Default] must be specified exclusively, and one of them must be specified.
                    throw new IllegalArgumentException(fMsg.getMbati001(
                            structure.getName(), attributeStructure.getName()));
                }
            }

            structure.getAttributeList().add(attributeStructure);
        }

        return structure;
    }
}
