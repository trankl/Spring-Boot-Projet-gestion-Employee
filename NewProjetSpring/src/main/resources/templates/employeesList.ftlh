
<html>
   <head>
      <title>Employee List</title>
       <link rel="stylesheet" type="text/css" href="/css/style.css"/>
   </head>   
   <body>
     <h1>Employee List</h1>
     <a href="/addEmployee">Add Employee</a>
     <br><br>
     <a href="/deleteEmployee">Delete Employee</a>
     <br><br>
    
         <table class="paleBlueRows">
            <thead>
            <tr>
               <th>First Name</th>
               <th>Last Name</th>
               <th>Email</th>
            </tr>
            </thead>
            <tbody>
            <#list ListEmployees as employee>
            <tr>
               <td>${employee.firstName}</td>
               <td>${employee.lastName}</td>
                <td>${employee.mail}</td>
            </tr>
            </#list>
            <tbody>
            <tfoot>
				<tr>
				<td colspan="3">
					<div class="links">
					<a href="#">&laquo;</a> 
					<a class="active" href="#">1</a> 
					<a href="#">2</a> 
					<a href="#">3</a> 
					<a href="#">4</a> 
					<a href="#">&raquo;</a>
					</div>
				</td>
				</tr>
			</tfoot>
         </table>
     
   </body>
</html>