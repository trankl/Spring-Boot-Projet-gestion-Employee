<html>
   <head>
      <title>Add Employee</title>
       <link rel="stylesheet" type="text/css" href="/css/style.css"/>  
   </head>
   <body>
      
         <h1>Add Employee</h1>
            <#if employee?? && noErrors?? >
            Your submitted data<br>
            ID: ${employee.id}<br>
            First Name: ${employee.firstName}<br>
            Last Name: ${employee.lastName}<br>
            Mail: ${employee.mail}<br>
            Password: ${employee.password}<br>
        <#else>
    		 
     	 <form action="/addEmployee" method="post">
            <label for ="firstName" > First Name : </label>
			<input type="text" id="firstName" name="firstName" required> <br>  <br> 
			<label for ="lastName" > Last Name : </label>
			<input type="text" id="lastName" name="lastName" required > <br>  <br> 
			<label for ="mail" > Email : </label>
			<input type="email" id="mail" name="mail" required > <br>  <br> 
			<label for ="password" > Password : </label>
			<input type="password" id="password" name="password" required ><br>
            <input type="submit" name="create" value="Create" />
            </form>
        </#if>
           <br><br>
     <a href="/employeesList">Return Employee List</a>
   </body>
   
</html>