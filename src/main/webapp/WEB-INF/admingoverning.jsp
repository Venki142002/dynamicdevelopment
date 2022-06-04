<%@ include file="common/adminheader.jspf" %>
<div class="container-fluid p-3 text-center">
    <h1><b>Governing Body</b></h1>
</div>
<h2 class="text-right"><b>Members of the CBTC Governing Body</b></h2>
<div class="container p-3 ">
    <table class="table table-striped table-bordered">
        <thead>
        <th></th>
        <th></th>
        </thead>
        <tbody>

        <%int i = 1;%>
        <c:forEach items="${gov}" var="paras">
            <tr>
                <td><%=i%>
                </td>
                <td>${paras.content}</td>
                <td>${paras.position}</td>
                <td><a href="govDeleteContent?id=${paras.id}" class="btn btn-danger">Delete</a></td>
            </tr>
            <%i++;%>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="container-fluid p-3">
    <form action="govAddContent" method="post" class="form_controller">
        <label>ENTER NAME TO ADD :</label> <input type="text" name="content"><label>POSITION :</label><input type="text"
                                                                                                             name="position">
        <button class="btn btn-success" type="submit">ADD</button>
    </form>
</div>
<%@ include file="common/footer.jspf" %>