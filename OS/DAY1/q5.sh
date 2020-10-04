echo ENTER A NUMBER : ; 
read a; 
x=0; 
for ((i=1;i<=a;i++)) 
do 
x=`expr $x + $i`; 
done 
echo "SUM OF ALL NATURAL NUMBERS TILL $a IS : $x";
