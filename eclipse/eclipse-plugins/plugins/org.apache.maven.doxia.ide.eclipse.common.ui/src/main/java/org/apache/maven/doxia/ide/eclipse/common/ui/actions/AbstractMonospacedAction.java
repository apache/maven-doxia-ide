package org.apache.maven.doxia.ide.eclipse.common.ui.actions;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.doxia.ide.eclipse.common.ui.CommonPlugin;
import org.apache.maven.doxia.ide.eclipse.common.ui.CommonPluginMessages;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Abstract <code>monospaced</code> action.
 *
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @version $Id$
 * @since 1.0
 * @see IActionConstants#MONOSPACED_ACTION for the action Key
 */
public abstract class AbstractMonospacedAction
    extends AbstractStyleAction
{
    /**
     * Default constructor
     *
     * @param editor
     */
    public AbstractMonospacedAction( ITextEditor editor )
    {
        super( CommonPluginMessages.getResourceBundle(), "Monospaced.", editor );

        setId( IActionConstants.MONOSPACED_ACTION );

        ImageRegistry imageRegistry = CommonPlugin.getDefault().getImageRegistry();
        setImageDescriptor( imageRegistry.getDescriptor( CommonPlugin.IMG_MONOSPACED ) );
        // TODO activate me!
        setDisabledImageDescriptor( imageRegistry.getDescriptor( CommonPlugin.IMG_MONOSPACED_DISABLED ) );
    }
}
