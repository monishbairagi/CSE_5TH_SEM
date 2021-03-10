#Write a shell script code to search an array element.

echo -n "Enter the size of the array: "
read n 

i=0 
echo "Enter numbers: "
while [ $i -lt $n ] 
do
    read a[$i] 
    i=`expr $i + 1` 
done

echo -n "Enter value to search: "
read v

flag=0
i=0
while [ $i -lt $n ] 
do
    if [ ${a[$i]} -eq $v ]
	then
		echo "$v is present in the position `expr $i + 1`."
		flag=1
	fi
    i=`expr $i + 1` 
done

if [ $flag -eq 0 ]
then
	echo "$v is not present in the array."
fi