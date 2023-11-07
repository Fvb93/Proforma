<?php
require_once("stagiairedata.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>	
	<ul> 

        <?php
        if(isset($_GET["id"])) {
            $id=$_GET["id"];
        } 

        foreach ($stagiaires as $key=>$val) { 
         if($key==$id) {                       
           echo "<li>", "ID : ",$key, "</li>";  
           echo "<ul>";
           if ($val["sexe"]=="M") {
            echo "<li>", "Monsieur ",strtoupper($val["nom"]) ," ", $val["prenom"], "</li>";                                
        }                                            
        if ($val["sexe"]=="F") {
            echo "<li>", "Madame ",strtoupper($val["nom"]) ," ", $val["prenom"], "</li>"; 
        }
        echo "<li>","DDN"," : ",$val["ddn"], "</li>";
        echo "<li>","Nombre d'enfants"," : ",$val["enfants"], "</li>";
        echo "<li>","Hobbies"," : ","</li>";
        echo "<ul>";
        foreach ($val["hobbies"] as $key2=>$val2) {                                 
           echo "<li>", $hobbies[$val2], "</li>";  
       }
       echo "</ul>";
       echo "</ul>";
   }
}
?> 
</ul> 
<a href="stagiaire.php"> Retour </a>
</body>
</html>