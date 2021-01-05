if [ -e $1 ]; then
	if [ -f $1 ]; then
		echo "$1 is a REGULAR FILE."
		ls -l $fname
	elif [ -d $1 ]; then
		echo "$1 is a DIRECTORY."
		ls -l $fname
	else
		echo "$1 is a OTHER FILE."
		ls -l $fname
	fi
else
	echo "$1 Does Not Exist."
fi 