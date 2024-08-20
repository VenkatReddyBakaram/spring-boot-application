<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Page</title>
  <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        text-align: center;
        padding: 50px;
    }
    .login-form {
        max-width: 300px;
        margin: 0 auto;
        background: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
    }
    .form-input {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 3px;
    }
    .form-submit {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 10px;
        margin: 10px 0;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        font-size: 16px;
    }
    .form-submit:hover {
        background-color: #45a049;
    }
  </style>
</head>
<body>
<div class="login-form">
  <h2>Login Form</h2>
  <form action="doLogin" method="POST">
    <input type="text" id="userName" name="userName" class="form-input" placeholder="Username" required>
    <br>
    <input type="password" id="password" name="password" class="form-input" placeholder="Password" required>
    <br>
    <button type="submit" id ="loginButton" class="form-submit">Login</button>
  </form>
</div>
</body>
</html>
