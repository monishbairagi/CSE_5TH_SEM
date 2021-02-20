echo enter a number
read a
i=1
while [ $i - le $a ]
do
echo `expr $i \* $i`
i=`expr $i + 1`
done