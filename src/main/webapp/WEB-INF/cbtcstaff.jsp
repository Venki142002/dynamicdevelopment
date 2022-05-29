<%@ include file="common/header.jspf" %>
<div class="container-fluid p-3 ">
    <h1><b>CBTC Staff
    </b></h1>
</div>
<div class="container-fluid p-3 table-responsive">
    <table class="table" id="tableconent">
        <thead>
        <td>Name</td>
        <td>Designation</td>
        <td>Contact No/Mobile Number</td>
        </thead>
        <tbody style="border-style: none">
        <%
            for (int i = 1; i <= 10; i++) {

        %>
        <tr>
            <td>kishore</td>
            <td>Doe</td>
            <td>john@example.com</td>
        </tr>
        <%}%>
        </tbody>
    </table>
</div>
<%@ include file="common/footer.jspf" %>