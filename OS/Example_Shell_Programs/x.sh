echo enter the number
read a
while [ $a -gt 0 ]
do
c=`expr $a % 10`
echo $c
a=`expr $a / 10`
done
