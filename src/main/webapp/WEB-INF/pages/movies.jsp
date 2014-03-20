<%--
  Created by IntelliJ IDEA.
  User: ltemal
  Date: 17/03/14
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movies List</title>
</head>
<body>
<c:if test="${!empty movies}">
    <h3>movies</h3>
    <table >
        <thead>
        <tr>
        <tr>
            <th>#</th>
            <th>Titre</th>
            <th>Réalisateur</th>
            <th>Année de sortie</th>
            <th>Note</th>
            <th>Delete action</th>
            <th>Uppdate action</th>

        </tr>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${movies}" var="movie">
            <tr>
                <td>${movie.id}</td>
                <td>${movie.title}</td>
                <td>${movie.directors}</td>
                <td>${movie.releaseYear}</td>
                <td>${movie.rate}</td>
            <td>
                <form action="/movies/delete/${movie.id}" method="delete"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form>
            </td>
                <td>
                    <form action="/movies/edit/${movie.id}" method="get"><input type="submit" class="btn btn-danger btn-mini" value="Update"/></form>
                </td>

            </tr>
            </tr>
        </c:forEach>
        </tbody>p
    </table>
</c:if>
</body>
</html>
