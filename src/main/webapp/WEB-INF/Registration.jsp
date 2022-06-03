<%@ include file="common/header.jspf" %>

<div class="container">
    <header>
        <div class="header">
            <h2>CREATE ACCOUNT</h2>
        </div>
    </header>
    <form id="forms" action="Registration" method="post">
        <div class="part1" >
            <div class="form_controller">
                <label>USER NAME</label>
                <input type="text" placeholder="USER NAME" id="username" name="username">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>FIRST NAME</label>
                <input type="text" placeholder="Full Name" id="fullname" name="fullname">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>MAIL ID</label>
                <input type="email" placeholder="Enter Your mailID" id="mailid" name="mailid">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>PASSWORD</label>
                <input type="password" placeholder="Enter password" id="password" name="password">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>CONFIRM PASSWORD</label>
                <input type="password" placeholder="Enter password" id="conpassword" name="conpassword">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
        </div>


        <!--part2-->
        <div class="more"> <h4>MORE</h4> </div>

        <div class="part2">
        <div class="form_controller">
            <label>GENDER</label>
            <div class="radio">
                <input type="radio" id="male" name="gender" value="male">MALE
                <input type="radio" id="female" name="gender" value="female">FEMALE
                <input type="radio" id="other" name="gender" value="others">OTHERS
            </div>
        </div>
            <div class="form_controller">
                <label>DOB</label>
                <input type="date" id="dob" name="dob">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>MOBILE NUMBER</label>
                <input type="text" placeholder="Your Mobile Number" id="phno" name="phno">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>BLOOD GROUP</label>
                <input type="text" placeholder="YOUR BLOOD GROUP" id="bld" name="bld">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <div class="form_controller">
                <label>CITY</label>
                <input type="text" placeholder="YOUR CITY" id="city" name="city">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>ERROR MESSAGE</small>
            </div>
            <button>Submit</button>
        </div>
    </form>
</div>
<script>
    morebutton = document.querySelector(".more"),
    nextpart2 = document.querySelector(".part2"),
    contain = document.querySelector(".container");

morebutton.addEventListener("click",() =>
{
    nextpart2.classList.add("part2adding");
    contain.classList.add("contain");
    morebutton.classList.add("nextbutton");
})


//validation
const form = document.getElementById("forms");
const usernames = document.getElementById("username")
const fullnames = document.getElementById("fullname")
const mails = document.getElementById("mailid")
const password1s = document.getElementById("password")
const password2s = document.getElementById("conpassword")
const dobs = document.getElementById("dob")
const phnos = document.getElementById("phno")
const bloodgrps = document.getElementById("bld")
const citys = document.getElementById("city")


form.addEventListener('submit',e => {
    e.preventDefault();
 checkInput()
})

function checkInput()
{
    var u, f, m, p, pho, d, blo, cit;
    const username = usernames.value.trim();
    const fullname = fullnames.value.trim();
    const mail = mails.value.trim();
    const password1 = password1s.value.trim();
    const password2 = password2s.value.trim();
    const dob = dobs.value.trim();
    const phno = phnos.value.trim();
    const bld = bloodgrps.value.trim();
    const city = citys.value.trim();
    if(username === '')
    {
        setError(usernames,'username cannot be blank');
    }
    else
    {
        setSuccess(usernames);
    u = 1;
    }
    if (fullname === '') {
        setError(fullnames, 'Name cannot be blank');
    } else {
        setSuccess(fullnames);
        f = 1;
    }
    if(mail === '')
    {
        setError(mails,'MailID cannot be blank');
    }
    else if (!isEmail(mail))
    {
        setError(mails,'MailID is not valid!');
    }
    else
    {
        setSuccess(mails);
        m=1;
    }
    if(password1 === '')
    {
        setError(password1s,'password cannot be blank');
    }
    else
    {
        setSuccess(password1s);
    }
    if(password2 === '')
    {
        setError(password2s,'confirm password cannot be blank');
    }
    else if(password1 !== password2)
    {
        setError(password2s,'password does not match');
    }
    else
    {
        setSuccess(password2s);
        p = 1;
    }
    if(dob === '')
    {
        setError(dobs,'DOB cannot blank');
    }
    else
    {
        setSuccess(dobs);
        d = 1;
    }
    if(phno === '')
    {
        setError(phnos,'please enter your mobile number');
    }
    if(!isphno(phno))
    {
        setError(phnos,'please enter Valid mobile number');
    }
    else
    {
        setSuccess(phnos);
        pho = 1;
    }
    if(bld === '')
    {
        setError(bloodgrps,'blood group cannot be blank');
    }
    else if(!blood(bld))
    {
        setError(bloodgrps,'blood group is Valid😔');
    }
    else
    {
        setSuccess(bloodgrps);
        blo= 1;
    }
    if(city === '')
    {
        setError(citys,'please enter your city😔');
    }
    else
    {
        setSuccess(citys);
        cit = 1;
    }

    if(u===1&&f===1&&m===1&&p===1&&pho===1&&d===1&&blo===1&&cit===1)
    {
        document.getElementById("forms").action = "Registration";
        document.getElementById("forms").submit();
    }
}
function setError(input,msg)
{
    const formControl = input.parentElement;
    const small  = formControl.querySelector("small");
    formControl.className = "form_controller error";
    small.innerText = msg;
}
function setSuccess(input)
{
    const formControl = input.parentElement;
    formControl.className = 'form_controller sucess' ;
}
function  isphno(phno)
{
    return /^[0-9\-]{10}$/i.test(phno)
}
function isEmail(mail)
{
    return /^([a-z0-9\-]+)(\.[a-z0-9\-]+)*@([a-z0-9\-]+\.)+[a-z]{2,6}$/i.test(mail)
}
function preventBack(){window.history.forward();}
function blood(bld)
{
    return /^[A|B|AB|O][\\+|\\-][Ve|ve]/.test(bld);
}
</script>
<%@ include file="common/footer.jspf" %>