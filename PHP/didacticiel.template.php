<?php 
function formulaire($cpt,$array){
	echo "<p>","Calculs ",($cpt)+1,"/10","</p>";
	echo $array[$cpt][0],$array[$cpt][1],$array[$cpt][2]," = ";
	echo '<input type="number" name="Réponse" step="any" value="',$array[$cpt][4],'" >';
	echo "<div>";
	echo '<input type="submit" name="action" value="Précédent">';
	echo '<input type="submit" name="action" value="Bilan">';
	echo '<input type="submit" name="action" value="Suivant">';
	echo '<input type="submit" name="action" value="Reset">';
	echo '</div>';
	echo'</form>';
}

function bilan($cpt,$array){
	$score=0;
	foreach($array as $key => $val) {
		if ($array[$key][4]==$array[$key][3]) {
			$score++;
		}
		echo "<div>";
		echo $array[$key][0],$array[$key][1],$array[$key][2]," = ", $array[$key][4]," score ",($array[$key][4]==$array[$key][3]?"1":"0");
		echo "</div>";
	}
	echo "Score total = ",$score,"/10";
	echo "<div>";
	echo '<input type="submit" name="action" value="Recommencer">';
	echo '</div>';
	echo'</form>';
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>
<body>
	<form action="didacticiel.php" method="post">
		<h1>Didacticiel</h1>	
		<?php
		
			if ($action=="Bilan") {
				bilan($cpt,$array);
			}
			else {
				formulaire($cpt,$array);
			}
		
		?>
	</body>
	</html>
