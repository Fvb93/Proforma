<?php
$animal="";
$nb;
?>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>

<body>
	<?php

	$nb=rand(1,100);

	if ($nb<=50) {
		$animal="chien";
	}
	else {
		$animal="chat";
	}

	echo "<h1> $nb vous avez gagné un $animal </h1>" ;
	echo "<img src='images/$animal.jpeg'/>";

	?>	
</body>
</html>

