package org.apache.maven.doxia.ide.eclipse.common.ui;

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

import org.osgi.framework.BundleContext;

/**
 * This class controls the Common plug-in life cycle.
 *
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @version $Id$
 * @since 1.0
 */
public class CommonPlugin
    extends AbstractDoxiaPlugin
{
    // The plug-in ID
    public static final String PLUGIN_ID = "org.apache.maven.doxia.ide.eclipse.common.ui";

    // The shared instance
    private static CommonPlugin plugin;

    /**
     * The constructor
     */
    public CommonPlugin()
    {
        plugin = this;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static CommonPlugin getDefault()
    {
        return plugin;
    }

    @Override
    public void start( BundleContext context )
        throws Exception
    {
        super.start( context );
    }

    @Override
    public void stop( BundleContext context )
        throws Exception
    {
        super.stop( context );

        ColorManager.getInstance().dispose();
    }
}
