/***********************************************************************************************
*
* Copyright 2018 Infosys Ltd.
* Use of this source code is governed by MIT license that can be found in the LICENSE file or at
* https://opensource.org/licenses/MIT.
*
***********************************************************************************************/

package com.infy.idp.customtools


import com.infy.idp.utils.ExecuteCmd

/**
 *
 * This class includes the method for adding FindBugs customtool
 *
 */

class FxCopCmdCT {

	/*
	* This function is used to add the commands to run FxCopCmdCT
	*/

	public static void invokeTool(context, jsonData, moduleIndex) {
		
		HashMap<String, String> data = performMapping(jsonData,moduleIndex)
		def command = """ "${data.get('FXCOP_SCRIPT_PATH')}" """
		ExecuteCmd.invokeCmd(context, command, jsonData.basicInfo.buildServerOS)
	}

	/*
     * This function is used to perform mapping for adding FxCopCmdCT
     */

	private static Map<String,String> performMapping(jsonData, moduleIndex) {
		
		HashMap<String, String> data = new HashMap<String, String>()
		
		def solDir = jsonData.buildInfo.modules.getAt(moduleIndex).relativePath.replace('\\', '/')
	 
		solDir = solDir.contains('/') ? solDir.substring(0, solDir.lastIndexOf('/')) + '/' : ''
			
		data.put('FXCOP_SCRIPT_PATH', '%IDP_WS%/' + solDir + 'fxcop_cmd.bat')
		
		return data
	}	
}
