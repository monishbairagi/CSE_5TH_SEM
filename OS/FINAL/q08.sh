i=1
while [ $i -eq 1 ]
do
	echo "";
	echo " ------------------------- ";
	echo "|      ---:MENU:----      |";
	echo " ------------------------- ";
	echo "| 1) ls                   |";
	echo "| 2) date                 |";
	echo "| 3) pwd                  |";
	echo "| 4) who                  |";
	echo "| 5) Exit                 |";
	echo " ------------------------- ";
	echo -n "Enter Your Choice: ";
	read choice;
	
	echo "";

	case $choice in
		1)
			echo "List of Files:-";
			echo "---------------------------";
			ls;
			echo "---------------------------";
			echo "";
			;;
		2)
			echo "System Date:-";
			echo "---------------------------";
			date;
			echo "---------------------------";
			echo "";
			;;
		3)
			echo "Print Working Directory:-";
			echo "---------------------------";
			pwd;
			echo "---------------------------";
			echo "";
			;;
		4)
			echo "Users Currently Logged In:-";
			echo "-------------------------------";
			who;
			echo "---------------------------";
			echo "";
			;;
		5)
			i=0;
			echo "Program has been Terminated.";
			echo "";
			;;
		*)
			echo "Wrong input. Try again.";
			echo "";
			;;
	esac
done
