<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details</title>
</head>
<body>
    <% String n = request.getParameter("uname");
       String p = request.getParameter("pswd");
       if(n == "admin" && p == "123@"){
           out.println("Welcome user");
       }
       else{
           out.println("Invalid user");
       }
     %>
</body>
</html>