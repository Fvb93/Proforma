<?php
session_start(); 
$array=[];
$cpt=0;
$rep="";
$score=0;
$action="init";

require_once("didacticiel.modele.php");



if(isset($_POST["action"])) {
	$action=$_POST["action"];
	
}
if(isset($_POST["Réponse"])){
		$cpt=$_SESSION['cpt'];
		$_SESSION['array'][$cpt][4]=$_POST["Réponse"];
		$array=$_SESSION['array'];
}
	
	switch ($action) {

		case "Suivant":
		$cpt++;
		if ($cpt==10) {
			$cpt=0;
			
		}
		$_SESSION['cpt']=$cpt;
		break;
		
		case "Précédent":
		$cpt--;
		//$_SESSION['cpt']=$cpt;
		if ($cpt==-1) {
			$cpt=9;
			
		}
		$_SESSION['cpt']=$cpt;
		break;
		case "init":
		case "Reset":
		case "Recommencer":
		$cpt=0;
		$array=remplissagetab();
		$_SESSION['array']=$array;
		$_SESSION["cpt"]=$cpt;
	}


require_once("didacticiel.template.php");

//echo var_dump($array);
?>

