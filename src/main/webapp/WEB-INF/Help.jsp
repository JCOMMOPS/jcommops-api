<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
		String uri = (String) request.getAttribute("uri");
		String version = (String) request.getAttribute("projectVersion");
		String name = (String) request.getAttribute("projectName");
	%>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<title><%=name%></title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<div class="page-header">
		<h1>Documentation: <%=name%> (V<%=version%>)</h1>
	</div>
	<div class="well">
		<h2>About the API</h2>
		<p>JCOMMOPS Web Service API is a REST-like API designed to distribute metadata, in interoperable and ready-to-use formats,
		to integrate other software (usually under machine to machine schema). The metadata distributed by this API version (V1.0) are
		in three common data formats: <b>.json</b>, <b>.xml</b> and <b>.csv</b>.</p>
	</div>
	
	<div class="container">
		<h2>Listing the platforms</h2>
		<p>The list of platforms includes platforms' "IDs" and their corresponding "JCOMMOPS-References".</p>
		
		<div class="container">
			<h3>Listing all the platforms</h3>
			<p>The total list of all the referenced platforms can be obtained with a GET request using the following URL pattern:
			<div class="text-center"><i><b>[ROOT][/]X.Y[/] platforms.format</b></i></div>
			<br>
			Where "X.Y" string path is the version of the API (current version is <%= version %>) and "format" in "platforms.format" string path represents the data output.</p>
			
			<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listAllPtfExample" aria-expanded="false" aria-controls="listAllPtfExample">Example</button>
			<div class="collapse" id="listAllPtfExample">
				<div class="well">
					To generate the global platforms list in json format, here the dedicated URL:<br>
					<i><%=uri%>platforms.json</i>
					<br>
					Below is a truncated output of the example URL:
					<pre>
						<code>
							[
							...,
							{"id":507587,"jcommopsRef":"7900372"},
							{"id":507586,"jcommopsRef":"7900373"},
							{"id":507585,"jcommopsRef":"7900374"},
							{"id":507524,"jcommopsRef":"7900375"},
							{"id":506352,"jcommopsRef":"5903904"},
							{"id":506351,"jcommopsRef":"5903959"},
							...
							]
						</code>
					</pre>
				</div>
			</div>
		</div>
		<br>
		
		<div class="container">
			<h3>Listing a filtered list of platforms using key parameters</h3>
			<p>
			A filtered list of platforms can be obtained with a GET request using this URL pattern:
			<div class="text-center"><i><b>[ROOT][/] X.Y[/]platforms.format[/]find?parm1=value1&parm2=value2&...</b></i></div>
			<br>
			Where parm1, parm2…param(i) respresent the query parameters and value1, value2…value(i) represent the corresponding values respectively. Note also that for multiple values
			selection, each parameter can assign several values separated by comma ",". 
			</p>
			<br><br>
			<b>Table 1.</b> Search parameters to specify the URL of a "selected list of platforms".
			<form name="submitPramValues" method="POST">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>Parameter*</th>
								<th>Description</th>
								<th>Values</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>status</td>
								<td>The status of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=status" role="button">Get statuses</a></td>
							</tr>
							<tr>
								<td>model</td>
								<td>The model of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=model" role="button">Get models</a></td>
							</tr>
							<tr>
								<td>type</td>
								<td>The type of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=type" role="button">Get types</a></td>
							</tr>
							<tr>
								<td>family</td>
								<td>The family of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=family" role="button">Get families</a></td>
							</tr>
							<tr>
								<td>program</td>
								<td>The affiliation program(s) of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=program" role="button">Get programs</a></td>
							</tr>
							<tr>
								<td>country</td>
								<td>The country involved in the platform-program</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=country" role="button">Get countries</a></td>
							</tr>
							<tr>
								<td>masterProgram</td>
								<td>The affiliation master program(s) of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=masterProgram" role="button">Get master programs</a></td>
							</tr>
							<tr>
								<td>network</td>
								<td>The affiliation network of the platform</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=network" role="button">Get networks</a></td>
							</tr>
							<tr>
								<td>variable</td>
								<td>The variable(s) monitored by the platform's sensor(s)</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=variable" role="button">Get variables</a></td>
							</tr>
							<tr>
								<td>sensorModel</td>
								<td>The platform's sensor(s) model(s)</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=sensorModel" role="button">Get sensor models</a></td>
							</tr>
							<tr>
								<td>sensorType</td>
								<td>The platform's sensor(s) type(s)</td>
								<td><a class="btn btn-info btn-block" target="_blank" href="?param=sensorType" role="button">Get sensor types</a></td>
							</tr>
						</tbody>
					</table>
					(*) by convention all the parameters' acronyms are in small caps for single word parameters, and in lower camel case for acronyms of compound words.<br><br>
					
					A search parameter's value corresponds to either an identification number (<b>ID</b>) or a non-sensitive caps string (<b>Short Name</b> ). The values that can each
					parameter take are listed in the corresponding links in table 1 (Get parameter button).
				</div>
			</form>
			<br>
			
			<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#listFilteredPtfExample" aria-expanded="false" aria-controls="listFilteredPtfExample">Example</button>
			<div id="listFilteredPtfExample" class="collapse">
				<div class="well">
					<p>
						To generate the list of <b>active platforms</b> monitoring the <b>dissolved oxygen</b>, here the dedicated URL:
						<div class="text-center"><i><%=uri%>platforms.xml/find?status=ACTIVE&variable=DOXY</i></div>
						<br><br>
						Below is a truncated output of the example URL:<br>
						
					</p>
					<pre>
						<code>
							&lt;platforms&gt;
								&lt;platform id="498692"&gt;
									&lt;jcommpsRef&gt;1901467&lt;/jcommpsRef&gt;
								&lt;/platform&gt;
								&lt;platform id="500471"&gt;
									&lt;jcommpsRef&gt;5903381&lt;/jcommpsRef&gt;
								&lt;/platform&gt;
								&lt;platform id="500505"&gt;
									&lt;jcommpsRef&gt;6900876&lt;/jcommpsRef&gt;
								&lt;/platform&gt;
								&lt;platform id="500506"&gt;
									&lt;jcommpsRef&gt;6900877&lt;/jcommpsRef&gt;
								&lt;/platform&gt;
								&lt;platform id="500690"&gt;
									&lt;jcommpsRef&gt;6900870&lt;/jcommpsRef&gt;
								&lt;/platform&gt;
								... Additional results truncated in this example[] ...
							&lt;/platforms&gt;
						</code>
					</pre>
					<p>
					In the URL of the example above the parameter "<b>status</b>" has the value of "<b>ACTIVE</b>" standing for an "<b>active platform</b>" 
					and the parameter "<b>variable</b>" has the value of "<b>DOXY</b>" standing for "<b>dissolved oxygen</b>". 
					The previous URL is equivalent to:
					<div class="text-center"><i><%=uri%>platforms.xml/find?status=3&variable=33</i></div>
					Where in this URL we replaced the short names's values of status and variable ("ACTIVE" and "DOXY") and assigned their corresponding IDs ("3" and "33").
					</p>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<h2>Getting the details of a referenced platform</h2>
		<p>
		The platform details metadata include a number of essential information on a platform (only some of them are listed in table 1). 
		A platform details can be obtained with a GET request using the following dedicated URL pattern:
		<div class="text-center"><i><b>[ROOT][/]X.Y[/] platform.format[/]ID</b></i><br></div><br>
		Where "ID" is the identification number of the platform. Beware of the singular form of “platform” in the URL string platform.format compared to the previous examples (platforms listing).
		</p>
		
		<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#detailsPtfExample" aria-expanded="false" aria-controls="detailsPtfExample">Example</button>
		<div id="detailsPtfExample" class="collapse">
			<div class="well">
				To generate the details information of platform (id=498692) in xml output. This platform was identified in the previous
				section's example as "<b>active</b>" and including a sensor measuring "<b>dissolved oxygen</b>". Here the dedicated URL for this example:
				<div class="text-center"><i><%=uri%>platform.xml/498692</i><br></div>
				Below is a truncated output of the example URL:<br>
				<pre>
					<code>
						&lt;platform id="498692"&gt;
							&lt;jcommpsRef&gt;1901467&lt;/jcommpsRef&gt;
							&lt;ptfFamily id="2"&gt;...&lt;/ptfFamily&gt;
							&lt;ptfType id="26"&gt;...&lt;/ptfType&gt;
							&lt;ptfModel id="1222"&gt;...&lt;/ptfModel&gt;
							&lt;ptfStatus id="3"&gt;...&lt;/ptfStatus&gt;
							&lt;deployement id="49917"&gt;...&lt;/deployement&gt;
							&lt;lastLocation id="70653874"&gt;
								&lt;lastLocationDate&gt;2015-08-13T06:37:32Z&lt;/lastLocationDate&gt;
								&lt;lat&gt;13.017&lt;/lat&gt;
								&lt;lon&gt;-64.97&lt;/lon&gt;
							&lt;/lastLocation&gt;
							&lt;program id="58"&gt;
								&lt;name&gt;Argo WHOI&lt;/name&gt;
								&lt;active&gt;1&lt;/active&gt;
								&lt;agencies&gt;
									&lt;agency id="24"&gt;
										&lt;name&gt;Woods Hole Oceanographic Institution&lt;/name&gt;
										&lt;nameShort&gt;WHOI&lt;/nameShort&gt;
									&lt;/agency&gt;
								&lt;/agencies&gt;
							&lt;/program&gt;
							&lt;country id="66"&gt;...&lt;/country&gt;
							&lt;masterProgramme id="0"&gt;...&lt;/masterProgramme&gt;
							&lt;contacts&gt;...&lt;/contacts&gt;
							&lt;variables&gt;
								&lt;variable id="1"&gt;
									&lt;name&gt;Sea Water Salinity&lt;/name&gt;
									&lt;nameShort&gt;SUB_SAL&lt;/nameShort&gt;
								&lt;/variable&gt;
								&lt;variable id="31"&gt;
									&lt;name&gt;Sea Water Temperature&lt;/name&gt;
									&lt;nameShort&gt;SUB_T&lt;/nameShort&gt;
								&lt;/variable&gt;
								&lt;variable id="33"&gt;
									&lt;name&gt;Dissolved Oxygen&lt;/name&gt;
									&lt;nameShort&gt;DOXY&lt;/nameShort&gt;
								&lt;/variable&gt;
							&lt;/variables&gt;
						&lt;/platform&gt;
					</code>
				</pre>
			</div>
		</div>
	</div>
	<div class="container">
		<h2>Getting the details of a filtered list of platforms</h2>
		<p>
		To filter a list of platforms like it is presented in section 1.2. and obtain the detailed metadata (section 2.) for each platform listed, here the dedicated URL pattern:
		<div class="text-center"><i><b>[ROOT][/]X.Y[/]platforms.format[/]details/find?parm1=value1&parm2=value2&...</b></i></div><br>
		Compared to platforms list search URL, the URL above includes the string "details". Also, beware of the plural form of “platforms” in the URL string platforms.format.
		</p>
		<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#detailsFilteredListPtfExample" aria-expanded="false" aria-controls="detailsFilteredListPtfExample">Example</button>
		<div id="detailsFilteredListPtfExample" class="collapse">
			<div class="well">
				Let's take the same example shown in section 1.2. To generate the list of active platforms monitoring the dissolved oxygen in .csv, here the dedicated URL:<br>
				<div class="text-center"><i><%=uri%>platforms.csv/details/find?status=ACTIVE&variable=DOXY</i><br></div>
				Below is a truncated output of the example URL:<br>
				<pre>
					<code>
platformId;jcommopsRef;telecomId;telecomType;internalRef;serialRef;ptfFamily;ptfType;ptfModel;program;country;masterProgramme;deployementDate;deployementLatitude;deployementLongitude;deployementScore;deployementDensity;notificationDate;shipName;shipRef;lastLocationDate;lastLocationLatitude;lastLocationLongitude;Age;cycleTime;driftPressure;profilePressure;iceDetection;sensorModel;sensorTypes;variables
498692;1901467;1781103;IRIDIUM;3404;953;FLOAT;FLOAT;SOLO_W;Argo_WHOI;United States;Argo;2010-05-01T03:10:00Z;0.43;-16.51; ; ;2010-05-14T14:41:09Z; ;33RO;2015-08-13T06:37:32Z;13.017;-64.97;1930;240;1800;1000;0;GEN_CTD;{GEN_CTD_TEMP}{GEN_CTD_PRES}{GEN_CTD_SAL};{SUB_SAL}{SUB_T}{DOXY};
500471;5903381;1783666;ARGOS;3694;4322;FLOAT;FLOAT;APEX;Argo_UW;United States;Argo;2010-11-25T04:43:00Z;-12.8;165; ; ;2011-01-11T22:42:46Z; ;;2015-08-31T00:25:16Z;-17.938;149.7571;1739;240;2000;1000;0;GEN_CTD;{GEN_CTD_TEMP}{GEN_CTD_PRES}{GEN_CTD_SAL};{SUB_SAL}{SUB_T}{DOXY};
500505;6900876;1783707;ARGOS;5057;5057;FLOAT;FLOAT;APEX;Argo_BSH;Germany;Argo;2014-06-29T14:56:00Z;56.9983;-21.83; ; ;2014-04-17T08:41:50Z; ;06PO;2015-09-03T10:46:17Z;59.6721;-12.5459;430;120;1200;1000;0;GEN_CTD;{GEN_CTD_TEMP}{GEN_CTD_PRES}{GEN_CTD_SAL};{SUB_SAL}{SUB_T}{DOXY};
... Additional results truncated in this example...	
					</code>
				</pre>
			</div>
		</div>
	</div>
</div>
<br><br>
</body>
</html>