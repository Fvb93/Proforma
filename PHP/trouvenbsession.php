<?php
session_start();
$nb1=rand(0,100);
$rep="";
$message="";
$bouton="";

if(isset($_POST["action"])) {
    if($_POST["action"]=="Reset") {
        $_SESSION['nb1']=$nb1;
    }
    if($_POST["action"]=="Tester") {
      if(isset($_SESSION['nb1'])) {
        $nb1=$_SESSION["nb1"]; 
    }
    else {
        $_SESSION['nb1']=$nb1;
    }

    $rep=$_POST["rep"];

    if($rep<$nb1) {
        $message="Ton nombre est trop petit";
    } 
    else {
        if ($rep>$nb1) {
            $message="Ton nombre est trop grand";
        }
        else {
            $message="Bravo champion !";
            $bouton="disabled";
        }
    }
}
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcul</title>
</head>
<body>

    <form action="trouvenbsession.php" method="post">
        <h1>Cherchez un nombre compris entre 0 et 100 </h1>

        <input type="hidden" name="nb1" value='<?php echo $nb1;?>'>

        <input  type="number" name="rep" value='<?php echo $rep;?>'>


        <input type="submit" name="action" value="Tester" <?php echo $bouton;?>>


        <input type="submit" name="action" value="Reset">

        <?php echo $message;?>
    </form>
</body>
</html> 