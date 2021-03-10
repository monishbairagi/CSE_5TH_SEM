#Write a shell script code to check a number is palindrome or not.

echo -n "Enter a Number: "
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

if [ $s -eq $n ]
then
	echo "$n is Palindrome."
else
	echo "$n is Not Palindrome."
fi