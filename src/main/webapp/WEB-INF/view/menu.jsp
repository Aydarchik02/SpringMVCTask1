<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <style>
    body {
      font-family: 'Arial', sans-serif;
      background-color: #f2f2f2;
      margin: 20px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 20px;
    }

    th, td {
      padding: 10px;
      text-align: left;
      border: 1px solid #dddddd;
    }

    th {
      background-color: #4CAF50;
      color: white;
    }

    tr:nth-child(even) {
      background-color: #f9f9f9;
    }

    a {
      text-decoration: none;
      color: #0066cc;
    }

    button {
      background-color: #4CAF50;
      color: white;
      border: none;
      padding: 10px 15px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 14px;
      cursor: pointer;
    }

    button a {
      color: white;
      text-decoration: none;
    }
  </style>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>age</th>
    <th>UPDATE</th>
    <th>DELETE</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="hello" items="${find}">
    <tr>
      <td>${hello.id}</td>
      <td>
        <a href="/find/by/${hello.id}">
            ${hello.name}
        </a>
      </td>
      <td>${hello.age}</td>
      <td>
        <button>
          <a href="/update/form/${hello.id}">
            UPDATE
          </a>
        </button>
      </td>
      <td>
        <button>
          <a href="/delete/${hello.id}">
            DELETE
          </a>
        </button>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<button>
  <a href="/form">
    Register
  </a>
</button>
</body>
</html>