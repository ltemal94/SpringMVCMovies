<%--
  Created by IntelliJ IDEA.
  User: ltemal
  Date: 17/03/14
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table >
    <thead>
    <tr>
    <tr>
        <th>ID</th>
        <th>Titre</th>
        <th>Réalisateur</th>
        <th>Année de sortie</th>
        <th>Note</th>


    </tr>
    </tr>
    </thead>
    <tbody>

            <td>${movie.id}</td>
            <td>${movie.title}</td>
            <td>${movie.directors}</td>
            <td>${movie.releaseYear}</td>
            <td>${movie.rate}</td>


        </tr>
        </tr>

    </tbody>
</table>
</body>
</html>
