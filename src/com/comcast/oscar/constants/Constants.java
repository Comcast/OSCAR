package com.comcast.oscar.constants;

/**
 * @bannerLicense
	Copyright 2015 Comcast Cable Communications Management, LLC<br>
	___________________________________________________________________<br>
	Licensed under the Apache License, Version 2.0 (the "License")<br>
	you may not use this file except in compliance with the License.<br>
	You may obtain a copy of the License at<br>
	http://www.apache.org/licenses/LICENSE-2.0<br>
	Unless required by applicable law or agreed to in writing, software<br>
	distributed under the License is distributed on an "AS IS" BASIS,<br>
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>
	See the License for the specific language governing permissions and<br>
	limitations under the License.<br>


 * @author Maurice Garcia (maurice.garcia.2015@gmail.com)
 */


public class Constants {

	private static final String TAB = "\t";
	
	/**
		Semantic Versioning 2.0.0<br>
		http://semver.org/spec/v2.0.0.html<br>
	
		Given a version number MAJOR.MINOR.PATCH, increment the:<br>
		MAJOR version when you make incompatible API changes,<br>
		MINOR version when you add functionality in a backwards-compatible manner, and<br>
		PATCH version when you make backwards-compatible bug fixes.<br>
		Additional labels for pre-release and build metadata are available as extensions:<br>
		
		Format: MAJOR.MINOR.PATCH<br>
	*/
	public static final String OSCAR_VERSION = "2.2"; 
	public static final String OSCAR_CLI_USAGE = "java -jar oscar.jar -k <key> -i <.txt> -o <.bin> -c";
	public static final String OSCAR_CLI_HEADER = "/* OSCAR -> OpenSource Cable modem file AssembleR v" + OSCAR_VERSION + " */";
	public static final String OSCAR_CLI_NO_ARGS = "Type --help for information";
	
	public static final String ERR_MIS_PAR = "Parameter missing, please use correct syntax";
	public static final String ERR_NOT_BIN = "is not a binary file";
	public static final String ERR_DNE = "does not exist";
	
	public static final String OSCAR_BANNER = "OSCAR: OpenSource Cable modem file AssembleR v" + OSCAR_VERSION;
	
	public static final String APACHE_20_LICENCE_DISCLAIMER = 	TAB + OSCAR_BANNER + "\n\n\n\n"+
																TAB +"Copyright 2015 Comcast Cable Communications Management, LLC\n"+
																TAB +"___________________________________________________________________\n"+
																TAB +"Licensed under the Apache License, Version 2.0 (the \"License\")\n"+
																TAB +"you may not use this file except in compliance with the License.\n"+
																TAB +"You may obtain a copy of the License at\n"+
																TAB +"http://www.apache.org/licenses/LICENSE-2.0\n"+
																TAB +"Unless required by applicable law or agreed to in writing, software\n"+
																TAB +"distributed under the License is distributed on an \"AS IS\" BASIS,\n"+
																TAB +"WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"+
																TAB +"See the License for the specific language governing permissions and\n"+
																TAB +"limitations under the License.\n\n"+
																
																
																TAB +"Author: Maurice Garcia (maurice.garcia.2015@gmail.com)\n"+
																TAB +"Author: Allen Flickinger (allen.flickinger@gmail.com)\n";
	
	

}
