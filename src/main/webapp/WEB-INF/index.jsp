<%@ include file="common/header.jspf" %>
<!-- image1 -->
<div class="container-fluid p-3   text-left" id="homeimage">
    <div id="demo" class="carousel slide" data-bs-ride="carousel">

        <!-- Indicators/dots -->
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
            <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
            <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
        </div>

        <!-- The slideshow/carousel -->
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../img/la.jpg" alt="Los Angeles" class="d-block" style="width:100%">
                <div class="carousel-caption">
                    <h3>Los Angeles</h3>
                    <p>We had such a great time in LA!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../img/chicago.jpg" alt="Chicago" class="d-block" style="width:100%">
                <div class="carousel-caption">
                    <h3>Chicago</h3>
                    <p>Thank you, Chicago!</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../img/ny.jpg" alt="New York" class="d-block" style="width:100%">
                <div class="carousel-caption">
                    <h3>New York</h3>
                    <p>We love the Big Apple!</p>
                </div>
            </div>
        </div>

        <!-- Left and right controls/icons -->
        <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
            <span class="carousel-control-next-icon"></span>
        </button>
    </div>



</div>

<!-- about -->
<div class="container-fluid p-3 " >
    <div class="container text-center">
        <h4><b>Welcome to NECBDC</b></h4>
        <p style="justify-content:center;" >${para}</p>
        <a href="aboutcbtc" style="text-decoration:none;">Read More...</a>
    </div>
</div>

<!-- image2 -->
<div class="container-fluid  p-3 text-center">
    <div class="container text-center">
        <h1>What We Do?</h1>
    </div><br>
    <div class="container p-2  text-center row " id="home2image">

        <div class="col-md-4 mt-3 col-lg-3">
            <b>Consultancy</b>
            <img src="https://source.unsplash.com/collection/190727/1500x900" class="img-fluid" alt="image">
            <p>CBTC provides consultancy to entrepreneurs and organizations.</p>
        </div>
        <div class="col-md-4 mt-3 col-lg-3"> <b>Promotions</b>
            <img src="https://source.unsplash.com/collection/190727/1500x900" class="img-fluid" alt="image">
            <p>CBTC provides marketing support to bamboo Artisans and entrepreneurs.</p>
        </div>
        <div class="col-md-4 mt-3 col-lg-3"> <b>Training</b>
            <img src="https://source.unsplash.com/collection/190727/1500x900" class="img-fluid" alt="image">
            <p>CBTC has been providing training to artisans and entrepreneurs.</p>
        </div>
        <div class="col-md-4 mt-3 col-lg-3"> <b>Networking</b>
            <img src="https://source.unsplash.com/collection/190727/1500x900" class="img-fluid" alt="image">
            <p>CBTC partners with several national & international organizations.</p>
        </div>

    </div>

</div>
<%@ include file="common/footer.jspf" %>