$(document).ready(function () {
$("#errfirstname").hide();
$("#errlastname").hide();
$("erridnumber").hide();
$("#errphonenumber").hide();
$("#errcpass").hide();
$("#erremail").hide();

$("#submit").click(function () {
    var firstname=$("#firstname").val();
    var lastname=$("#lastname").val();
    var phonenumber=$("#phonenumber").val();
    var idnumber=$("#idnumber").val();
    var email=$("#email").val();
    var userpass=$("#userpass").val();
    var mailformat=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(firstname=="" || firstname==null){
    alert("firstname cannot be empty");
    return false;
}else if(lastname=="" || lastname==null){
    alert("lastname cannot be empty.");
    return false
}else if(phonenumber=="" || phonenumber==null){
    alert("phone Number cannot be empty.");
    return false;
}else if(idnumber<6 || idnumber>8){
    alert("Id number should be 8 digits");
    return false;
}else if(email=="" || email==null) {
    alert("Email Address cannot be Empty.");
    return false;
}else if(userpass=="" || userpass==null){
    alert("Password cannot be empty.");
    return false;
} else if(!(email.match(mailformat))) {
    alert("Please enter valid email Address");
    return false;
}
// }else {
//     $("#form").submit();
//     return true;
// }
    return true;
});
$("#email").change(function () {
    var email=$("#email").val();
    var mailformat=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if(!(email.match(mailformat))){
        $("#erremail").show();
        return false;
    }else {
        $("#erremail").hide();
        return true;
    }

});
$("#cpass").change(function () {
    var userpass=$("#userpass").val();
    var cpass=$("#cpass").val();
    if(!(userpass==cpass)){
        $("#errcpass").show();
        return false
    }else {
        $("#errcpass").hide();
        return true;
    }
});

});