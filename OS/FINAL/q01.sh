#Write a shell script code to sort an array of integer.

echo -n "Enter the size of the array: "
read n 

i=0 
echo "Enter numbers: "
while [ $i -lt $n ] 
do
    read a[$i] 
    i=`expr $i + 1` 
done

i=0
while [ $i -lt $n ]
do
	j=`expr $i + 1`
	while [ $j -lt $n ]
	do
		if [ ${a[$j]} -lt ${a[$i]} ]
		then
			t=${a[$i]}
			a[$i]=${a[$j]}
			a[$j]=$t
		fi
		j=`expr $j + 1`
	done
	i=`expr $i + 1`
done

echo "Array after Sorting:-"
i=0 
while [ $i -lt $n ] 
do
    echo ${a[$i]} 
    i=`expr $i + 1` 
done