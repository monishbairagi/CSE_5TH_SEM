echo "enter a number"
read a
c=`expr $a % 2`
if [ $c -eq 0 ]
then
echo "number is even";
else
echo "number is odd";
fi