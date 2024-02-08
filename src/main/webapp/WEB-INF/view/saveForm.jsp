<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 18.12.2023
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Beautiful Form</title>
  <style>
    body {
      font-family: 'Arial', sans-serif;
      background-color: #f5f5f5;
      margin: 20px;
    }
    form {
      width: 300px;
      margin: 0 auto;
      padding: 20px;
      background-color: #ffffff;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
      font-weight: bold;
      margin-bottom: 5px;
      display: block;
    }
    input {
      width: 100%;
      padding: 8px;
      margin-bottom: 10px;
      box-sizing: border-box;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input[type="submit"] {
      background-color: #4caf50;
      color: white;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<form action="/save" method="post">
  <label for="name">Name</label><br>
  <input type="text" name="name" id="name"><br>
  <label for="age">Age</label><br>
  <input type="number" name="age" id="age"><br>
  <input type="submit" value="Register">
</form>
</body>
</html>
