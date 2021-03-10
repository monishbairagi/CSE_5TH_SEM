echo -n "Enter Number to Check Odd or Even: ";
read n;
if [ $(( $n % 2 )) -eq 0 ]
then
	echo "$n is Even.";
else
	echo "$n is Odd.";
fi
