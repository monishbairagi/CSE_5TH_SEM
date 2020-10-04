echo "Enter a Number : "; 
read a; 
rev=0; 
n=$a; 
while [ $a -ne 0 ] 
do 
x=`expr $a % 10`; 
b=`expr $rev \* 10`; 
rev=`expr $b + $x`; 
a=`expr $a / 10`; 
done 
echo "REVERSE OF $n IS $rev";
