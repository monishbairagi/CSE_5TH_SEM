#Write a shell script code to generate the following pattern:
#                              1
#                             1 1
#                            1 2 1
#                           1 3 3 1
#                          1 4 6 4 1

echo -n "Enter limit: "
read n

i=0
while [ $i -lt $n ]
do
	j=`expr $i + 1`
	while [ $j -lt $n ]
	do
		echo -n " "
		j=`expr $j + 1`
	done
	num=$[11**$i]
	temp=$num
	factor=1
	while [ $temp -ne 0 ]
	do
		temp=`expr $temp / 10`
		factor=`expr $factor \* 10`
	done

	while [ $factor -gt 1 ]
	do
		factor=`expr $factor / 10`
		res=`expr $num / $factor` 
		echo -n "$res "
		num=`expr $num % $factor`
	done
	echo ""
	i=`expr $i + 1`
done