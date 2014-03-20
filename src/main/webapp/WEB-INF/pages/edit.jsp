<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit a Movie</title>
</head>
<body>--
<h1>Update the Movie</h1>

<form action="/movies/update/" method="get">
<p>ID : <input type="text" name="id" value=${movie.id}></p>
<p>Title : <input type="text" name="title" value=${movie.title}> </p>
<p>Release year : <input type="text" name="releaseYear"  value=${movie.releaseYear}> </p>
<p>Category : <input type=="text" name="category" value=${movie.category}></p>
<p>Synopsis : <input type=="text" name="synopsis" value=${movie.synopsis}></p>
<p>Rate : <input type=="text" name="rate" value=${movie.rate}></p>
<input type="submit" value="update">
</form>
</body>
</html>
