<?php
require_once("stagiairedata.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

    <ul> 
        <?php
        
        foreach ($stagiaires as $key=>$val) {           // Affiche le numéro des éléments
           echo "<li>";
           echo "Element : ",$key;
           echo "</li>";  

         foreach ($val as $key2=>$val2) {               // Affiche le vecteur avec les infos
            echo "<ul>";
            if ($key2=="hobbies") {             
                echo "<li>";
                echo $key2," : ";          
                echo "<ul>";

                foreach ($val2 as $key3=>$val3) {       // Affiche les hobbies                  
                    echo "<li>";
                    echo $key3," : ",$val3;
                    echo "</li>";   
                }
                echo "</ul>";
                echo "</li>";
            }  

            else {                                             
                echo "<li>";
                echo $key2," : ",$val2;
                echo "</li>";
            }  
            echo "</ul>";      
        }  
    }
    ?> 
</ul> 

// EXERCICE SUIVANT 

<ul> 
    <?php
 foreach ($stagiaires as $key=>$val) {                     // Affiche le numéro des éléments
   echo "<li>";
   echo "ID : ",$key;
   echo "</li>";  

   foreach ($val as $key2=>$val2) {                        // Affiche le vecteur avec les infos
       echo "<ul>";
       $nom=$val["nom"];
       $prenom=$val["prenom"];
       $ddn=$val["ddn"];

       if ($key2=="sexe" && $val2=="M") {
        echo "<li>";
        echo "Monsieur ",strtoupper($nom) ," ", $prenom ;
        echo "</li>";                                
        echo "<li>";
        echo "DDN"," : ",$ddn;
        echo "</li>";
    }                                            

    if ($key2=="sexe" && $val2=="F") {
        echo "<li>";
        echo "Madame ",strtoupper($nom) ," ", $prenom ;
        echo "</li>";
        echo "<li>";
        echo "DDN"," : ",$ddn;
        echo "</li>";
    }

    if ($key2=="enfants") {
        echo "<li>";
        echo "Nombre d'enfants"," : ",$val2;
        echo "</li>";
    }
    if ($key2=="hobbies") {             
        echo "<li>";
        echo "Hobbies : ";          
        echo "<ul>";

        foreach ($val2 as $key3=>$val3) {       // Affiche les hobbies                  
            echo "<li>";
            echo $hobbies[$val3];
            echo "</li>";               
        }
    }
    echo "</ul>";
    echo "</li>";
}  
echo "</ul>";
}
?> 
</ul> 


// EXERCICE SUIVANT 

<ul> 
   <?php
 foreach ($stagiaires as $key=>$val) {                     // Affiche le numéro des éléments
   echo "<li>";
   echo "Personne n°: ",$key;
   echo "</li>";  

   foreach ($val as $key2=>$val2) {                        // Affiche le vecteur avec les infos
       echo "<ul>";
       $nom=$val["nom"];
       $prenom=$val["prenom"];

       if ($key2=="sexe" && $val2=="M") {
        echo "<li>";
        echo "Monsieur ",'<a href="stagiairepage2.php?id=',$key,'" >',strtoupper($nom),'</a>'," ", $prenom ;
        echo "</li>";                                
    }                                            

    if ($key2=="sexe" && $val2=="F") {
        echo "<li>";
        echo "Madame ",'<a href="stagiairepage2.php?id=',$key,'">',strtoupper($nom),'</a>'," ", $prenom ;
        echo "</li>";
    }     
    echo "</ul>";
    echo "</li>";
} 
}
?>  
</ul>  


// DEUXIEME OPTIMISATION DU CODE

<ul> 
    <?php
foreach ($stagiaires as $key=>$val) {                     
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
?> 
</ul> 
</body>
</html>  

