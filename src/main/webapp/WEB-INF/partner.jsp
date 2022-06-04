<%@ include file="common/header.jspf" %>
<!-- conent -->
<div class="container-fluid  p-3 ">
    <h1 class="text-center"><b>CBTC PARTNERS</b></h1>
    <br>
    <div class="container">


        <ul class="">
            <c:forEach items="${partner}" var="paras">
                <li>${paras.content}</li>
            </c:forEach>

        </ul>
    </div>
</div>
<%@ include file="common/footer.jspf" %>