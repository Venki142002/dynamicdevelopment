<%@ include file="common/adminheader.jspf" %>
<div class="container-fluid p-3 text-center">
    <h1><b>Governing Body</b></h1>
</div>
<h2 class="text-right"><b>Members of the CBTC Governing Body</b></h2>
<div class="container p-3 ">
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
                <td> <a href="staffDeleteContent?id=${paras.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="container-fluid p-3">
    <form action="staffAddContent" method="post" class="form_controller">
       <ul class="list-unstyled list-group list-group-horizontal">
           <li><label>ENTER NAME TO ADD :</label> <input type="text" name="content"></li>
           <li><label>Designation :</label><input type="text" name="position"></li>
           <li><label>Contact No :</label><input type="text" name="contact"></li>
        <button class="btn btn-success" type="submit">ADD</button>
       </ul>
    </form>
</div>
<%@ include file="common/footer.jspf" %>