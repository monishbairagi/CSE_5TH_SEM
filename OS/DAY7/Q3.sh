#Write a shell script to sort an array of 5 elements.

echo -n "Enter The Size of Array: ";
read n;

echo "Enter Array Elements: ";
for ((i=0;i<n;i++))
do
	read a[$i];
done

for ((i=0;i<n-1;i++))
do
	x=`expr $n - $i`;
	for ((j=0;j<x-1;j++))
	do
		v=`expr $j + 1`;
		if [ ${a[$j]} -gt ${a[$v]} ]
		then
			t=${a[$j]};
			a[$j]=${a[$v]};
			a[$v]=$t;
		fi
	done
done

echo -n "Array After Sorting: ";
for ((i=0;i<n;i++))
do
	echo -n "${a[$i]} ";
done
echo ""