<?php
$nb1=rand(1,5);
$nb2=rand(1,5);
$rep="";
$message="";
$bouton="Envoi";

if(isset($_POST["action"])){
    if($_POST["action"]=="Envoi") {
    $nb1=$_POST["nb1"];
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

    <form action="calculsget.php" method="post">
        <?php echo $nb1, " + ", $nb2, ' = ';?>
        <input type="hidden" name="nb1" value='<?php echo $nb1;?>'>
      

        <input type="hidden" name="nb2" value='<?php echo $nb2;?>'>
      

        <input  type="number" name="rep" value='<?php echo $rep;?>'>

        <input type="submit" name="action" value='<?php echo $bouton;?>'>

        <?php echo $message;?>
    </form>
</body>
</html> 