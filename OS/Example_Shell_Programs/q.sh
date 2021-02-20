enter two number
read x
read y
s=1
i=1
while [ $i -le $y ]
do
s=`expr $s \* $x`
i=`expr $i + 1`
done
echo $x to the power $y is $s