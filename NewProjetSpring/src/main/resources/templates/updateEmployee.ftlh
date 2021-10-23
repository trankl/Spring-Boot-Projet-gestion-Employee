
<html>
   <head>
      <title>Update Employee</title>
       <link rel="stylesheet" type="text/css" href="/css/style.css"/>
   </head>   
   <body>
     <h1>Update Employee</h1>
     
     <a href="/deleteEmployee">Delete Employee</a>
     <br><br>
     <a href="/employeesList">Return Employee List</a>
      <br><br>
      <form action="/updateEmployee" method="post">
      		<label for ="id" > Employee ID : </label>
			<input type="text" id="id" name="id"> <br>  <br>
      		<label for ="firstName" > First Name : </label>
			<input type="text" id="firstName" name="firstName" > <br>  <br> 
			<label for ="lastName" > Last Name : </label>
			<input type="text" id="lastName" name="lastName" > <br>  <br> 
			<label for ="mail" > Email : </label>
			<input type="email" id="mail" name="mail"  > <br>  <br> 
			<label for ="password" > Password : </label>
			<input type="password" id="password" name="password"  >
      <br><br>
            <input type="submit" name="update" value="update" />
         </form>
      <br><br>
     
   </body>
</html>