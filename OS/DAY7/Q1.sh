#Write a shell script to reverse a no

echo -n "Enter a Number to Reverse: "
read n

t=$n
s=0
while [ $t -gt 0 ]
do
	r=`expr $t % 10`
	s=`expr $s \* 10`
	s=`expr $s + $r`
	t=`expr $t / 10`
done

echo "Reverse of $n is $s"