echo enter the number
read a
r=$a
s=0
while [ $a -gt 0 ]
do
c=`expr $a % 10`
s=`expr $s \*10 + $c`
a=`expr $a / 10`
done
if [ $s -eq $r ]
then
echo number is palindrom
else
echo number is not palindrom
fi
