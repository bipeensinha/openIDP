/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/
package com.infosys.json;

import org.junit.Test;

import junit.framework.Assert;
/*This class is for testing reports*/
public class FindBugsReportsTest {

	@Test
	
	public void urltest(){
		FindBugsReports bgr = new FindBugsReports();
		
		bgr.setURL("infosys.com");
		
		Assert.assertEquals("infosys.com", bgr.getURL());
	}
}
