<?php
$nb;
$nbl=5;
$nbc=5;
$r;
$g;
$b;
?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style type="text/css">
		td { border: 5px solid black;  font-size: 50px; text-align:center; }
<?php
		for ($i=0;$i<$nbl*$nbc;$i++) {
				$r=rand(0,255);
				$g=rand(0,255);
				$b=rand(0,255);
		echo ".fond$i { background: rgb($r,$g,$b); }";
	}
	?>
</style>
</head>
<body>
	<table>
		<?php
		for ($i=0;$i<$nbl;$i++) 
		{
			echo "<tr>";
			for ($j=0;$j<$nbc;$j++) 
			{
				$nb=rand(0,99);
				echo "<td class='fond".($i*$nbc+$j)."''>";
				echo $nb;				
				echo "</td>";

			}				
			echo "</tr>";
		}
		?>
	</table>
</body>
</html>
