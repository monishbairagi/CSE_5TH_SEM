echo "enter a number";
read a;
if [ `expr $a % 7` -eq 0 ]
then
echo "number is divisible by 7";
else
echo "number not divisible by 7";
fi 