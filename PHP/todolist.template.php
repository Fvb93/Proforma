<?php
function affichage($array){
	echo "<ul>";
	foreach ($array as $key => $val) {
	echo "<li>";
	echo '<input type="submit" name="action" value="toggle_',$key,'">';
	echo $array[$key][0]," - ",$array[$key][1];
	echo '<input type="submit" name="action" value="delete_',$key,'">';
	echo "</li>";
}
	echo "</ul>";
}

function resume($array){
	$total=0;
	$todo=0;
	echo "<ul>";
	foreach ($array as $key => $val) {
	$total++;
	if ($array[$key][1]=="todo") {
	$todo++;	
	}
	}
	echo "<li>";
	echo "Total : ",$total;
	echo "</li>";
	echo "<li>";
	echo "To do : ",$todo;
	echo "</li>";
	echo "<li>";
	echo "Complete : ", ($total-$todo);
	echo "</li>";
	echo "</ul>";
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
	<form action="todolist.php" method="post">
		<h1>Todo List</h1>
		<div>
		<input type="text" name="todo">
		<input type="submit" name="action" value="Ajouter">
		</div>
		<div>
			<?php affichage($array); ?>
		</div>
		<div style="border-top:1px solid black;">
			<?php resume($array); ?>
		</div>
		<div style="border-top:1px solid black;">
		<input type="submit" name="action" value="Reset">
		</div>
	</body>
	</html>