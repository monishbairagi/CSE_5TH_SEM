echo "enter a number";
read a
d=`expr $a % 7`
e=`expr $a % 10`
if [ $d -eq 0 -a $e -eq 0 ]
then
echo $a is divisible by 7 and 10
else
echo $a is not divisible by 7 and 10
fi
