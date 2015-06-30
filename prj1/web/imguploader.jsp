<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
	<script type="text/javascript">
		function imgViewer()  {
			window.open("/prj1/DispatchServlet?jspUrl=imgviewer.jsp");
		}
		function send(){
			var desc = document.getElementById("desc").value;
 			document.forms[0].action="/prj1/SaveFile?desc="+desc;
			document.forms[0].submit();
		}
	</script>
	<style type="text/css">
		h1 {
			font-family: cursive;
			font-variant: small-caps;
			font-size: 50px;
		}
		body{
			margin: 0;
			background-color: rgba(6, 255, 0, 0.34);
			background-image: linear-gradient(to left, rgba(74, 255, 0, 1) 0%, rgba(8, 66, 16, 1) 98%);
		}
		.container{
			text-align: center;
			margin: 1%;
			padding: 5%;
			background-color: rgb(127, 147, 147);
			height: auto;
			min-height: 100%;
		}
		.btn {
			margin-top: 50px;
			border-radius: 25px;
			padding: 5px 20px;
			background-color: lime;
			cursor: pointer;
			border: 0px;
			color: rgb(86, 86, 86);
			transition: background-color 0.2s ease-in-out;
		}
		.desc {
			margin-top: 50px;
			border-radius: 25px;
			padding: 5px 20px;
			background-color: lime;
			cursor: pointer;
			border: 0px;
			color: rgb(86, 86, 86);
			width: 240px;
			transition: background-color 0.2s ease-in-out;
			text-align: center;
			margin: 40px auto;
			margin-bottom: 0;
		}
		
		.btn:hover {
			background-color: rgba(0, 255, 0, 0.30);
		}
		
		input[type="file"]::-webkit-file-upload-button {
			border-radius: 25px;
			border: 0px;
			background-color: rgba(0, 255, 0, 0);
			cursor: pointer;
			color: rgb(86, 86, 86);
			transition: background-color 0.2s ease-in-out;
		}
	</style>
	</head>
		<body>
			<div class="container">
				<h1>Images Uploader</h1>
				
				<form action="/prj1/SaveFile" method="post" enctype="multipart/form-data">
				
					<input class="btn" type="file" name="file" /> <br />
					<div class="desc"> 
						<label>Descrizione</label>
						<input type="text" style="border-radius: 25px;border: 0;width: 100%;" placeholder="Inserisci una descrizione dell' immagine" name="desc" id="desc"/>
					</div>
					<button  class="btn" type="button" onClick="javascript:send();">Upload File</button>
				</form>
				<button class="btn" onClick="javascript:imgViewer();">Images Viewer</button>
			</div>
		</body>
</html>
