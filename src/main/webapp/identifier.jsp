<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Identifier</title>
<style>
body, p, legend, label, input {
    font: normal 8pt verdana, helvetica, sans-serif;
}

fieldset {
    padding: 10px;
    border: 1px #0568CD solid;
}

legend {
    font-weight: bold;
    color: #0568CD;
}



form label {
    float: left;
    width: 200px;
    margin: 3px 0px 0px 0px;
}

form input {
    margin: 3px 3px 0px 0px;
    border: 1px #999 solid;
}

form input.sansLabel {
    margin-left: 200px;
}

form .requis {
    color: #c00;
}
</style>
</head>
<body>

 <form method="post" action="inscription">
  <fieldset>
  <legend>identifiez_vous</legend>
 
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                <br />
                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20" />
                <br />
                 <input type="submit" value="login" class="sansLabel" />
                 </fieldset>
</form>

</body>
</html>