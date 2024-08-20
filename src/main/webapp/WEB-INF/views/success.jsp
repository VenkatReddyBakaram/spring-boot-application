<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            padding: 50px;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
        }
        .logout-link {
            display: block;
            margin-bottom: 20px;
            color: #4CAF50;
            text-decoration: none;
            font-size: 18px;
        }
        .logout-link:hover {
            text-decoration: underline;
        }
        .pay-link {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 3px;
            transition: background-color 0.3s ease;
        }
        .pay-link:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Welcome to Your Dashboard</h2>


    <a href="login" class="logout-link">Sign Out</a>
    <br><br>
    <font color='green'> <h2>
        
        <%
        
        String userName = (String) session.getAttribute("userName");      
        
        %>
        
        Welcome To Mr/Mrs :       <%= userName %>

        <br> </h2>

        <h3>
        Emp Name : ${employee.empName} <br>
        Emp Email : ${employee.email} <br>
        Emp Phone Number : ${employee.phoneNumber} <br>
        City : ${employee.address.city} <br>
        State : ${employee.address.state} <br>
        Country : ${employee.address.country} <br>
        ZipCode : ${employee.address.zipCode} <br>
        </h3>

    </font>

    <a href="payment" class="pay-link">Click to Pay</a>
    
</div>
</body>
</html>
