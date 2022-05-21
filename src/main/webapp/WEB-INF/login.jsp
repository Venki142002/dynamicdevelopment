<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="../css/login.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
</head>
<body>
<form id="forms" method="post">
    <h1>LOGIN</h1>
    <div class="user">
        <i class="fas fa-user"></i>
            <input type="text" placeholder="Mail ID" name="mail" id="mail">
        <small></small>
    </div>
    <div class="password">
        <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" name="password" id="password">
        <br>
        <small></small>
    </div>
    <div class="button">
        <button><b>LOGIN</b></button>
        <button type="button"><a href="Registration"><b>REGISTER</b></a></button>
    </div>

    <h4 style="color: white">${a}</h4>
</form>

<script>
    const form = document.getElementById("forms");
    const user = document.getElementById("mail");
    const password = document.getElementById("password");
    form.addEventListener("submit",e => {
        e.preventDefault();
        process();
    })
    function process()
    {
        const usern = user.value.trim();
        const pass = password.value.trim();
        u=1;p=1;
        if(usern === '')
        {
            setError(user,"!PLEASE FILL ALL THE DETAILS")
            u = 0;
        }
        if (pass === '')
        {
            setError(password,"!PLEASE FILL ALL THE DETAILS")
            p=0;
        }
        if(u===1 && p===1)
        {

            document.getElementById("forms").action = "login";
            document.getElementById("forms").submit();
        }

    }
    function setError(input,msg)
    {

        const formControl = input.parentElement;
        const small  = formControl.querySelector("small");
        formControl.className = "user error";
        small.innerText = msg;
    }
</script>
</body>
</html>
