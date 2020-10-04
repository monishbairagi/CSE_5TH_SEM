echo ENTER 1ST NUMBER : ; 
read a; 
echo ENTER 2ND NUMBER : ; 
read b; 
echo ENTER 3RD NUMBER : ; 
read c; 

if [ $a -gt $b -a $a -gt $c ] 
then 
echo "$a is LARGEST "; 
elif [ $b -gt $a -a $b -gt $c ] 
then 
echo "$b is LARGEST "; 
else 
echo "$c is LARGEST "; 
fi
