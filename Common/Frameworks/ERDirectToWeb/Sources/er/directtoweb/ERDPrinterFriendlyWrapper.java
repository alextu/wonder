/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb;

import com.webobjects.foundation.NSTimestamp;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOComponent;

// FIXME: Needs to move to look framework.
/**
 * Printer friendly page wrapper.<br />
 * 
 */

public class ERDPrinterFriendlyWrapper extends WOComponent {

    public ERDPrinterFriendlyWrapper(WOContext context) { super(context); }

    public boolean isStateless() { return true; }

    public NSTimestamp now() { return new NSTimestamp(); } 
}