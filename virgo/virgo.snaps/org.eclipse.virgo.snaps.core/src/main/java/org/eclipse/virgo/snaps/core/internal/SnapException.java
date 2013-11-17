/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.snaps.core.internal;

/**
 * TODO Document SnapException
 * <p />
 * 
 * <strong>Concurrent Semantics</strong><br />
 * 
 * TODO Document concurrent semantics of SnapException
 * 
 */
public class SnapException extends RuntimeException {

    private static final long serialVersionUID = -7708370910141978887L;

    public SnapException(String message, Throwable cause) {
        super(message, cause);
    }

    public SnapException(String message) {
        super(message);
    }

    public SnapException(Throwable cause) {
        super(cause);
    }

}
