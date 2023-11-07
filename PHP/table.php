<?php
$nb;
$nbl=5;
$nbc=5;
$parite;
?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style type="text/css">
		.impair { background:blue; }
		.pair { background:pink;  }
		td { border: 5px solid black;  font-size: 50px; text-align:center; }
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

				if ($nb%2==0) {
					$parite="pair";					
				}

				else {
					$parite="impair";
				}	
				
				echo "<td class='$parite'>";
				echo $nb;				
				echo "</td>";
			}				
			echo "</tr>";
		}
		?>
	</table>
</body>
</html>