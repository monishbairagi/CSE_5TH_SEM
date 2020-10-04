#Write a shell script code to find out the difference between three files using diff3.

echo -n "Enter 1st file name: "
read f1
echo -n "Enter 2nd file name: "
read f2
echo -n "Enter 3rd file name: "
read f3

echo ""
echo "----------------------------------------"
diff3 -a $f1 $f2 $f3