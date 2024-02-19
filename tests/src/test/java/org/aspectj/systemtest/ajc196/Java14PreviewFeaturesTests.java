/*******************************************************************************
 * Copyright (c) 2021 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *******************************************************************************/
package org.aspectj.systemtest.ajc196;

import org.aspectj.apache.bcel.Constants;
import org.aspectj.testing.XMLBasedAjcTestCase;
import org.aspectj.testing.XMLBasedAjcTestCaseForJava14Only;

import junit.framework.Test;

/**
 * @author Alexander Kriegisch
 */
public class Java14PreviewFeaturesTests extends XMLBasedAjcTestCaseForJava14Only {
  private static final Constants.ClassFileVersion classFileVersion = Constants.ClassFileVersion.of(14);

  public void testRecords() {
    runTest("simple record");
    checkVersion("Person", classFileVersion.MAJOR, classFileVersion.PREVIEW_MINOR);
  }

  public void testRecords2() {
    runTest("using a record");
  }

  public void testInstanceofPatterns() {
    runTest("instanceof patterns");
  }

  public void testAdvisingRecords() {
    runTest("advising records");
  }

  public void testTextBlock1() {
    runTest("textblock 1");
  }

  public void testTextBlock2() {
    runTest("textblock 2");
  }

  public static Test suite() {
    return XMLBasedAjcTestCase.loadSuite(Java14PreviewFeaturesTests.class);
  }

  @Override
  protected java.net.URL getSpecFile() {
    return getClassResource("ajc196.xml");
  }

}
