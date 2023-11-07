<?php
$nb1=rand(1,5);
$nb2=rand(1,5);
$rep="";
$message="";
$bouton="Envoi";

if(isset($_POST["action"])){
    if($_POST["action"]=="Envoi") {
    $nb1=$_POST["nb1"]; // ctrl+D Pour sélection multiple
    $nb2=$_POST["nb2"];
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

    <form action="calculs.php" method="post">
        <input id="nb1-id" value='<?php echo $nb1;?>' type="text" name="nb1"
        readonly>+

        <input id="nb2-id" value='<?php echo $nb2;?>' type="text" name="nb2"
        readonly>=

        <input id="rep-id" value='<?php echo $rep;?>' type="number" name="rep">

        <input id="action-id" value='<?php echo $bouton;?>' type="submit" name="action">

        <?php echo $message;?>
    </form>
</body>
</html> 