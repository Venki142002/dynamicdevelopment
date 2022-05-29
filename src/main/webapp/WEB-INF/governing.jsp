<%@ include file="common/header.jspf" %>
<div class="container-fluid p-3 text-center">
    <h1><b>Governing Body</b></h1>
</div>
<h2 class="text-right"><b>Members of the CBTC Governing Body</b></h2>
<div class="container-fluid p-3 table-responsive">
    <table class="table" id="tableconent" >
        <tbody style="border-style: none">
        <%for (int i=1;i<=10;i++){

        %>
        <tr>
            <td><%=i%></td>
            <td>Doe</td>
            <td>john@example.com</td>
        </tr>
<%}%>
        </tbody>
    </table>
</div>
<%@ include file="common/footer.jspf" %>