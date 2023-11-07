<!DOCTYPE html>
<html lang=fr>
<head>
	<meta charset="UTF-8">
	<title>Variables</title>
</head>
<body>
<!--    -->	
	<?php 
	// en ligne
	/* */
		echo "1.<br/>2.";
	?>
<hr>
	<?php 
		echo "1.";
		echo "<br/>";
		echo "2.";
	?>
<hr>
	<?php 
		echo "1.","<br/>","2.";
	?>
<hr>
	<?php 
		echo "1."."<br/>"."2.";
	?>
<hr>
	<?php 
		echo "1.
		<br/>
		2.";
		            // ajouter \n pour retour à la ligne dans le source généré
	?>
<hr>
	<?php 
		$nom ="Isabelle";
		echo "Hello ".$nom."<br/>";
		$nom=123;
		echo "Hello $nom <br/>";
		echo "Hello \$nom <br/>"; // l'interpolation n'a pas lieu pour la var $nom
		echo 'Hello $nom <br/>';  // avec ' jamais d'interpolation
	?>
<hr>
	<?php
	$prenom="Josy";
	$nom="Dubois";
	$complet="Mme ".$prenom." ".$nom."<br/>";
	echo $complet;
	echo "$complet";
	$complet="Mme $prenom $nom <br/>";
	echo $complet;
	echo '<br/>';
	?>

	<table>
<tr>
<td>1</td>
<td>1</td>
<td>1</td>
</tr>
... autant de ligne à 3 cellules
</tr>
</table>
