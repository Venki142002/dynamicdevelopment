<%@ include file="common/header.jspf" %>
<div class="container-fluid p-3 text-center">
    <h1><b>Governing Body</b></h1>
</div>
<h2 class="text-right"><b>Members of the CBTC Governing Body</b></h2>
<div class="container-fluid p-3 table-responsive">

        <table class="table table-striped table-bordered">
            <thead>
            <th></th>
            <th></th>
            <th></th>
            </thead>
            <tbody>

            <%int i = 1;%>
            <c:forEach items="${gov}" var="paras">
                <tr>
                    <td><%=i%></td>
                    <td>${paras.content}</td>
                    <td>${paras.position}</td>
                </tr>
                <%i++;%>
            </c:forEach>
            </tbody>
        </table>

</div>
<%@ include file="common/footer.jspf" %>