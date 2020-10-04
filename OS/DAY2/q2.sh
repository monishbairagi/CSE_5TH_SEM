#Write a shell script code to check a number is prime or not.

echo -n "Enter a Number: "
read n

flag=1
i=2
while [ $i -lt $n ]
do
	if [ `expr $n % $i` -eq 0 ]
	then
		flag=0
	fi
	i=`expr $i + 1`
done

if [ $flag -eq 1 ]
then
	echo "$n is Prime."
else
	echo "$n is Not Prime."
fi