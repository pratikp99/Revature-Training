<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Submitted Form Data</h2>

    <div>
        <label>Name: </label>
        <span><%= request.getParameter("name") %></span>
    </div>
    
    <div>
        <label>Contact: </label>
        <span><%= request.getParameter("contact") %></span>
    </div>
    
    <div>
        <label>Gender: </label>
        <span><%= request.getParameter("gender") %></span>
    </div>
    
    <div>
        <label>State: </label>
        <span><%= request.getParameter("state") %></span>
    </div>
    
    <div>
        <label>Hobbies: </label>
        <span>
            <%
                String[] hobbies = request.getParameterValues("hobbies");
                if (hobbies != null) {
                    for (int i = 0; i < hobbies.length; i++) {
                        out.print(hobbies[i]);
                        if (i < hobbies.length - 1) {
                            out.print(", ");
                        }
                    }
                } else {
                    out.print("None");
                }
            %>
        </span>
    </div>

</body>
</html>