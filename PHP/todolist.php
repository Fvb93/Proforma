<?php
session_start(); 
$array=[];
$cpt=0;
$change=0;

require_once("todolist.modele.php");

if(isset($_POST["action"])) {
	$action=$_POST["action"];
	$cpt=$_SESSION['cpt'];
	$array=$_SESSION['array'];

	if (str_split($action,7)[0]=="delete_"){
		$change=str_split($action,7)[1];
		$action="Delete";
	}
	if (str_split($action,7)[0]=="toggle_"){
		$change=str_split($action,7)[1];
		$action="Toggle";
	}

	switch ($action) {
		case "Ajouter":
		$_SESSION['array'][$cpt][0]=$_POST["todo"];
		$_SESSION['array'][$cpt][1]="todo";
		$cpt++;
		$_SESSION['cpt']=$cpt;
		break;

		case "Reset":
		$_SESSION['array']=[];
		$_SESSION['cpt']=0;
		break;

		case "Delete":
		unset($_SESSION['array'][$change]);
		break;

		case "Toggle":
		if ($_SESSION['array'][$change][1]=="todo"){
			$_SESSION['array'][$change][1]="done";
		}
		else {
			$_SESSION['array'][$change][1]="todo";
		}
	}
	$array=$_SESSION['array'];
}
require_once("todolist.template.php");
?>

