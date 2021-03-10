echo -n "Enter the size of the array: ";
read n;

i=0;
echo "Enter numbers: ";
while [ $i -lt $n ] 
do
    read a[$i];
    i=`expr $i + 1`;
done

sum=0;
i=0;
while [ $i -lt $n ] 
do
	sum=`expr $sum + ${a[$i]}`
    i=`expr $i + 1`;
done

avg=`expr $sum / $n`;

echo "Sum: $sum";
echo "Avg: $avg";