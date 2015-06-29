<% String msg = (String) request.getAttribute("message"); %>
<html>
	<head>
	<script type="text/javascript">
		function imgUploader() {
			window.open("/prj1/DispatchServlet?jspUrl=imguploader.jsp");
		}
		function imgViewer()  {
			window.open("/prj1/DispatchServlet?jspUrl=imgviewer.jsp");
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
		.btn:hover {
			background-color: rgba(0, 255, 0, 0.30);
		}
	</style>
	</head>
		<body>
			<div class="container">
				<h1> Welcome Gianpaolo! </h1>
				<button class="btn" onClick="javascript:imgUploader();">Images Uploader</button>
				<button class="btn" onClick="javascript:imgViewer();">Images Viewer</button>
			</div>
		</body>
</html>