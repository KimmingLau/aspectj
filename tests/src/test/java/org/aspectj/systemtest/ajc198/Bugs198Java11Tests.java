/*******************************************************************************
 * Copyright (c) 2021 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *******************************************************************************/
package org.aspectj.systemtest.ajc198;

import junit.framework.Test;
import org.aspectj.testing.JavaVersionSpecificXMLBasedAjcTestCase;
import org.aspectj.testing.XMLBasedAjcTestCase;

/**
 * @author Alexander Kriegisch
 */
public class Bugs198Java11Tests extends JavaVersionSpecificXMLBasedAjcTestCase {
  public Bugs198Java11Tests() {
    super(11);
  }

  public void testGitHub_68() {
		runTest("correctly weave code using constant-dynamic");
	}

  public static Test suite() {
    return XMLBasedAjcTestCase.loadSuite(Bugs198Java11Tests.class);
  }

  @Override
  protected java.net.URL getSpecFile() {
    return getClassResource("ajc198.xml");
  }

}
