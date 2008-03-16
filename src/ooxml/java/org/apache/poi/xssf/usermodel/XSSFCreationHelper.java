/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */
package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.RichTextString;

public class XSSFCreationHelper implements CreationHelper {
	private XSSFWorkbook workbook;
	private XSSFDataFormat dataFormat;
	XSSFCreationHelper(XSSFWorkbook wb) {
		workbook = wb;
		
		// Create the things we only ever need one of
		dataFormat = new XSSFDataFormat();
	}
	
    /**
     * Creates a new XSSFRichTextString for you.
     */
	public RichTextString createRichTextString(String text) {
		return new XSSFRichTextString(text);
	}
	
	public DataFormat createDataFormat() {
		return dataFormat;
	}
}
