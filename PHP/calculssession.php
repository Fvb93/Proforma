<?php
session_start();
$nb1=rand(1,5);
$nb2=rand(1,5);
$rep="";
$message="";
$bouton="Envoi";


if(isset($_POST["action"])){
    if($_POST["action"]=="Recommencer") {
        $_SESSION['nb1']=$nb1;
        $_SESSION['nb2']=$nb2;
    }
    if($_POST["action"]=="Envoi") {
        if(isset($_SESSION['nb1'])) {
            $nb1=$_SESSION["nb1"]; 
        }
        else {
            $_SESSION['nb1']=$nb1;
        }
        if(isset($_SESSION['nb2'])) {
            $nb2=$_SESSION["nb2"]; 
        }
        else {
            $_SESSION['nb2']=$nb2;
        }

        $rep=$_POST["rep"];

        if($nb1+$nb2==$rep) {
            $message="Bravo";
            $bouton="Recommencer";
        } 
        else {
            $message="Pas bien";
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

    <form action="calculssession.php" method="post">

       <?php echo $nb1, " + ", $nb2, " = ";?>

      <input  type="number" name="rep" value='<?php echo $rep;?>'>

        <input type="submit" name="action" value='<?php echo $bouton;?>'>

       <?php echo $message;?>
   </form>
</body>
</html> 