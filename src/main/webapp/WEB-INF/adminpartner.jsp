<%@ include file="common/adminheader.jspf" %>
<div class="container p-3 ">
    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>content</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${partner}" var="paras">
            <tr>
                <td>${paras.content}</td>
                <td> <a href="partnerDeleteContent?id=${paras.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="container-fluid p-3">
        <form action="partnerAddContent" method="post" class="form_controller">
            <label>ENTER CONTENT TO ADD:</label> <input type="text" name="content">
            <button class="btn btn-success" type="submit">ADD</button>
        </form>
    </div>
    <%--    <a href="homeAddContent" class="btn btn-success">ADD</a>--%>
</div>
<%@ include file="common/footer.jspf" %>