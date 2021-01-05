echo -n "Enter File Path: "
read PATH
if [ -f $PATH ]; then
	echo "$PATH passwords are enabled."
	if [ -w $PATH ]; then
		echo "You have permission to edit $path."
	else
		echo "You do NOT have permission to edit $path."
	fi
else
	echo "$PATH does NOT exist."
fi 