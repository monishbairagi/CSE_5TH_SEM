echo "enter three numbers";
read a
read b
read c
if [ $a -gt $b -a $a -gt $c ]
then
echo $a is big
elif [ $b -gt $c ]
then
echo $b is big
else
echo $c is big
fi
