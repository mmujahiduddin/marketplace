/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.telemetry;

import org.junit.Assert;
import org.junit.Test;


public class TelemetryHandlerTest extends TelemetryBaseTest {

  @Test
  public void testQueueEvent() {
    ITelemetryHandler telemetryHandler = createTelemetryHandler();
    TelemetryEvent te = createTelemetryEvent();
    Assert.assertTrue( telemetryHandler.queueEvent( te ) );
  }
}
