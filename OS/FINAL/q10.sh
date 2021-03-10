echo -n "Enter The Size of The Array: "
read n 

echo "Enter Elements of The Array: "
i=0
while [ $i -lt $n ] 
do
    read a[$i] 
    i=`expr $i + 1` 
done

i=0
smallest=${a[$i]}
largest=${a[$i]}
while [ $i -lt $n ] 
do
	if [ ${a[$i]} -gt $largest ]
	then
		largest=${a[$i]}
	elif [ ${a[$i]} -lt $smallest ]
	then
		smallest=${a[$i]}
	fi
    i=`expr $i + 1` 
done

echo "The Smallest Element of The Array is $smallest."
echo "The Largest Element of The Array is $largest."