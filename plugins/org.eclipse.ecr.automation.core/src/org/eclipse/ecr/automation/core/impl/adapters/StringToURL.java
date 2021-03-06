/*
 * Copyright (c) 2006-2011 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     bstefanescu
 */
package org.eclipse.ecr.automation.core.impl.adapters;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.ecr.automation.OperationContext;
import org.eclipse.ecr.automation.TypeAdaptException;
import org.eclipse.ecr.automation.TypeAdapter;

/**
 * @author <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 */
public class StringToURL implements TypeAdapter {

    public Object getAdaptedValue(OperationContext ctx, Object objectToAdapt)
            throws TypeAdaptException {
        try {
            String content = (String) objectToAdapt;
            return new URL(content);
        } catch (MalformedURLException e) {
            throw new TypeAdaptException(e);
        }
    }

}
