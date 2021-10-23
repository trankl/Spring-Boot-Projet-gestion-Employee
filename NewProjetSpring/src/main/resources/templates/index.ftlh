
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
       <link rel="stylesheet" type="text/css" href="/css/style.css"/>
   </head>
   
   <body>
   
      <h1>Welcome</h1>
    
      <#if message??>
      <h2>${message}</h2>
      </#if>  
     
      <br><br>
      <a href="/addEmployee">Add new Employee</a>
          <br><br>
      <a href="/deleteEmployee">Delete Employee</a>
     <br><br>
      <a href="/employeesList">Employees List</a>  
      
   </body>	
   
</html>