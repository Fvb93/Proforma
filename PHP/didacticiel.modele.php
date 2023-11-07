<?php 
function remplissagetab(){
	$cpt=0;
	do {
		$nb1=rand(0,10);
		$nb2=rand(0,10);
		$op=rand(0,3);
		$rep="";

		switch ($op) {
			case 0:
			$op =" + ";
			$correction=$nb1+$nb2;
			break;
			case 1:
			$op =" - ";
			$correction=$nb1-$nb2;
			break;
			case 2:
			$op =" * ";
			$correction=$nb1*$nb2;
			break;
			case 3:
			$op =" / ";
			if ($nb2==0) {
				$nb2=rand(1,10);
			}
			$correction=$nb1/$nb2;
		}
		$tab[$cpt]=[$nb1,$op,$nb2,$correction,$rep];
		$cpt++;
	} while ($cpt<10);
	return $tab;
}
?>