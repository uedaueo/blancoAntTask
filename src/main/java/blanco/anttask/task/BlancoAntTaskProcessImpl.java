/*
 * blanco Framework
 * Copyright (C) 2004-2005 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.anttask.BlancoAntTaskConstants;
import blanco.anttask.BlancoAntTaskMeta2Xml;
import blanco.anttask.BlancoAntTaskXml2JavaClass;
import blanco.anttask.message.BlancoAntTaskMessage;
import blanco.anttask.task.valueobject.BlancoAntTaskProcessInput;

/**
 * Process of blancoAntTask
 *
 * @author IGA Tosiki
 */
public class BlancoAntTaskProcessImpl implements BlancoAntTaskProcess {
    /**
     * Defines a message.
     */
    protected final BlancoAntTaskMessage fMsg = new BlancoAntTaskMessage();

    /**
     * The method for describing a specific process.
     *
     * This method is used to describe the actual process.
     *
     * @param input
     *            Input parameters for processing.
     * @return Exit status of the process. 
     *         Returns END_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, 
     *           or END_ERROR of BlancoAntTaskBatchProcess class.
     * @throws IOException
     *            If an I/O exception occurs.
     * @throws IllegalArgumentException
     *            If an invalid input is found.
     */
    public int execute(BlancoAntTaskProcessInput input) throws IOException,
            IllegalArgumentException {
        System.out.println("- " + BlancoAntTaskConstants.PRODUCT_NAME + " ("
                + BlancoAntTaskConstants.VERSION + ")");

        try {
            final File blancoTmpAntTaskDirectory = new File(input.getTmpdir()
                    + BlancoAntTaskConstants.TARGET_SUBDIRECTORY);
            blancoTmpAntTaskDirectory.mkdirs();

            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new IllegalArgumentException(fMsg.getMbata001(input
                        .getMetadir()));
            }

            /*
             * Determines a newline character.
             */
            String LF = "\n";
            String CR = "\r";
            String CRLF = CR + LF;
            String lineSeparatorMark = input.getLineSeparator();
            String lineSeparator = "";
            if ("LF".equals(lineSeparatorMark)) {
                lineSeparator = LF;
            } else if ("CR".equals(lineSeparatorMark)) {
                lineSeparator = CR;
            } else if ("CRLF".equals(lineSeparatorMark)) {
                lineSeparator = CRLF;
            }
            if (lineSeparator.length() != 0) {
                System.setProperty("line.separator", lineSeparator);
                if (input.getVerbose()) {
                    System.out.println("lineSeparator try to change to " + lineSeparatorMark);
                    String newProp = System.getProperty("line.separator");
                    String newMark = "other";
                    if (LF.equals(newProp)) {
                        newMark = "LF";
                    } else if (CR.equals(newProp)) {
                        newMark = "CR";
                    } else if (CRLF.equals(newProp)) {
                        newMark = "CRLF";
                    }
                    System.out.println("New System Props = " + newMark);
                }
            }

            new BlancoAntTaskMeta2Xml().processDirectory(fileMetadir,
                    blancoTmpAntTaskDirectory.getAbsolutePath());

            final File[] fileTmp = blancoTmpAntTaskDirectory.listFiles();
            if (fileTmp == null) {
                // When failed to get a file list for some reason. 
                throw new IllegalArgumentException(fMsg
                        .getMbata002(blancoTmpAntTaskDirectory
                                .getAbsolutePath()));
            }

            for (int index = 0; index < fileTmp.length; index++) {
                if (fileTmp[index].getName().endsWith(".xml")) {
                    final BlancoAntTaskXml2JavaClass xml2source = new BlancoAntTaskXml2JavaClass();
                    xml2source.setEncoding(input.getEncoding());
                    xml2source.process(fileTmp[index], new File(input
                            .getTargetdir()));
                }
            }
        } catch (TransformerException e) {
            throw new IOException("An exception occurred during the XML conversion: " + e.toString());
        }

        return BlancoAntTaskBatchProcess.END_SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
