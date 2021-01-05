echo -n "Enter File Name/Directory: "
read fname
if [ -e $fname ]; then
	if [ -f $fname ]; then
		echo "$fname is a REGULAR FILE."
		ls -l $fname
	elif [ -d $fname ]; then
		echo "$fname is a DIRECTORY."
		ls -l $fname
	else
		echo "$fname is a OTHER FILE."
		ls -l $fname
	fi
else
	echo "$fname Does Not Exist."
fi 