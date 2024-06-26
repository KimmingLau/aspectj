/* *******************************************************************
 * Copyright (c) 2004 IBM Corporation
 *
 * All rights reserved.
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *    Andy Clement     initial implementation
 * ******************************************************************/
package org.aspectj.runtime.internal.cflowstack;


public class ThreadStackFactoryImpl11 implements ThreadStackFactory {

	public ThreadStack getNewThreadStack() {
		return new ThreadStackImpl11();
	}

	public ThreadCounter getNewThreadCounter() {
		return new ThreadCounterImpl11();
	}

}
