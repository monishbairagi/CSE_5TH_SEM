echo 1. ADD
echo 2. SUB
echo 3. MUL
echo 4. DIV
echo enter choice
read c;
echo enter two numbers
read a
read b
case $c in
1) d=`expr $a + $b`;;
2) d=`expr $a - $b`;;
3) d=`expr $a \* $b`;;
4) d=`expr $a / $b`;;
*) echo "wrong choice";
esac
echo the result is $d;