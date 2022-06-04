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
<c:forEach items="${staff}" var="paras">
        <tr>
            <td>${paras.content}</td>
            <td>${paras.position}</td>
            <td>${paras.contact}</td>
        </tr>
</c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="common/footer.jspf" %>