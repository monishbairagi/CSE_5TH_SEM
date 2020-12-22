#Write a shell script to print the smallest no in an array of 10 nos.

echo -n "Enter The Size of The Array: "
read n 

i=0 
echo "Enter Elements of The Array: "
while [ $i -lt $n ] 
do
    read a[$i] 
    i=`expr $i + 1` 
done

i=0
m = ${a[$i]}
while [ $i -lt $n ] 
do
    if [ ${a[$i]} -lt $m ]
	then
		m = ${a[$i]}
	fi
    i=`expr $i + 1`
done

echo "The Smallest Element of The Array is $m"
read n