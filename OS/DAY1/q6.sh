echo ENTER A NUMBER : ; 
read a; 
sum=0; 
n=$a; 
while [ $a -ne 0 ] 
do 
x=`expr $a % 10`; 
sum=`expr $sum + $x`; 
a=`expr $a / 10`; 
done 
echo "SUM OF DIGITS OF $n IS $sum";