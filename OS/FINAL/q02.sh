#Write a shell script code to check a user given number is Armstrong or not.

echo -n "Enter a Number: "
read n

t=$n
s=0
while [ $t -gt 0 ]
do
	r=`expr $t % 10`
	c=`expr $r \* $r \* $r`
	s=`expr $s + $c`
	t=`expr $t / 10`
done

if [ $s -eq $n ]
then
	echo "$n is Armstrong."
else
	echo "$n is Not Armstrong."
fi