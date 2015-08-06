<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="D:\WorkspaceJAva\stu\WebContent\css\bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
.link2 {
	border: solid 2px #aaa;
	border-radius: 3x;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	background-color: #89ba38;
	color: #000;
	text-decoration: none;
	font-weight: bold;
	margin: 10px 3px 10px 3px;
	padding: 3px;
	display: inline-block;
}

.link2:hover {
	background-color: #acea11;
}

.effect-4:hover {
	border-radius: 50px 5px 50px 5px;
	-webkit-border-radius: 50px 5px 50px 5px;
	-moz-border-radius-topleft: 50px;
	-moz-border-radius-topright: 5px;
	-moz-border-radius-bottomleft: 5px;
	-moz-border-radius-bottomright: 50px;
}
body{
background-image: url("C:\Users\Anele\Pictures\clean_cool_apple_iphone_logo_hd_wallpapers_21_pictures_wus.jpg");
 background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center; 
    
}
</style>
</head>
<body>
<center>
		<h2>Retrieving data From the server..</h2>
		<form action="BeeAutomation/Company" method="get">
			<button type="submit" class="btn btn-primary effect-4">Get
				All Companies</button>
				<div class="jumbotron">
  <h1>Hello, world!</h1>
  <p>GET ALL COMPANIES BY ID</p>
  <div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">@</span>
  <input type="text" class="form-control" placeholder="company ID" aria-describedby="sizing-addon1">
</div>
  <p><a class="btn btn-primary btn-lg" href="NewFile.html" role="button">Learn more</a></p>
</div>
		</form>
		<a href="BeeAutomation/Company/certificates" class="link2">Get
			Certificates</a>
</center>
</body>
</html>
