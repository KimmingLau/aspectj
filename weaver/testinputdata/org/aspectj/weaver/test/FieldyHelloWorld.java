/* Copyright (c) 2002 Contributors.
 *
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v 2.0
 * which accompanies this distribution and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt
 *
 * Contributors:
 *     PARC     initial implementation
 */
package org.aspectj.weaver.test;

public class FieldyHelloWorld {

	public static String str = "Hello";

    public static void main(String[] args) {
        str += " World";

        System.out.println(str);
    }
}
