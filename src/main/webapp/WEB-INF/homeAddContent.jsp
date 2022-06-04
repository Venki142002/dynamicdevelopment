<%@ include file="common/adminheader.jspf" %>
<div class="container-fluid p-3">
<form action="homeAddContent" method="post" class="form_controller">
    <input type="text" name="content">
    <button class="btn btn-success" type="submit">submit</button>
</form>
</div>
<%@ include file="common/footer.jspf" %>