echo 1. pwd
echo 2. ls
echo 3. date
echo enter a number
read p
case $p in
1) pwd;;
2) ls;;
3) date;;
*) echo "wrong choice";;
esac