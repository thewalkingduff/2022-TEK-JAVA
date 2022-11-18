<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <form method="get" action="/">
        Course Name : <input type="text" name="courseName" value="${courseNameKey}">
        Instructor Name : <input type="text" name="instructorName" value="${instructorNameKey}">   
        <button type="submit">Search</button>
    </form>

    <table border="1px" cellpadding="5" >
        <tr>
            <td><b>ID</b></td>
            <td><b>Instructor</b></td>
            <td><b>Course</b></td>
        </tr>
        <c:forEach items="${courses}" var="course">
            <tr>      
                <td>${course.id}</td>
                <td>${course.instructor}</td>
                <td>${course.name}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>