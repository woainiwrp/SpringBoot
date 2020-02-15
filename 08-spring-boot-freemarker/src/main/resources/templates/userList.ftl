<html>
	<head>
		<title>freemarker</title>
		<meta charset="utf-8"></meta>
		
	</head> 
	<body>
		<table border="1" align="center" width="50%">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			
			<#list list as user>
				<tr>
					
					<td>${user.userId}</td>
					<td>${user.username}</td>
					<td>${user.userage }</td>
				</tr>
				
				
			</#list>
		</table>
		
		
	</body>
</html>