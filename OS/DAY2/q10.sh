#Write a shell script using switch case to create a menu driven programme to print the 
#1. System date
#2. List of Hidden file
#3. Permission of all files and directory
#4. All users currently logged in

echo " ------------------------------------------------- "
echo "|                  ---:MENU:----                  |"
echo " ------------------------------------------------- "
echo "| 1 to Show System Date                           |"
echo "| 2 to Show List of Hidden Files                  |"
echo "| 3 to Show Permission of all Files and Directory |"
echo "| 4 to Show All Users Currently Logged In         |"
echo " ------------------------------------------------- "
echo -n "Enter Your Choice: "
read choice

echo ""

case $choice in
	1)
		echo "System Date:-"
		echo "-------------------------------------------------"
		date
		echo "-------------------------------------------------"
		;;
	2)
		echo "List of Hidden Files:-"
		echo "-------------------------------------------------"
		ls -a ~
		echo "-------------------------------------------------"
		;;
	3)
		echo "Permission of all Files and Directory:-"
		echo "-------------------------------------------------"
		ls -l
		echo "-------------------------------------------------"
		;;
	4)
		echo "Users Currently Logged In:-"
		echo "-------------------------------------------------"
		who
		echo "-------------------------------------------------"
		;;
	*)
		echo "Wrong input. Try again."
		;;
esac