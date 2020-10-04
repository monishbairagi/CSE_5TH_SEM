#Write a shell script code to change the file permission.

echo " ----------------------------------------"
echo "| chmod [Reference][operator][Mode] file |"
echo " ----------------------------------------"
echo "| Reference: u, g, o, a                  |"
echo "| operator : =, +, -                     |"
echo "| Mode     : r, w, x, rw, rx, wx, rwx    |"
echo " ----------------------------------------"
echo ""

echo -n "Enter File Name: "
read f
echo -n "Enter Reference: "
read r
echo -n "Enter operator : "
read o
echo -n "Enter Mode     : "
read m

chmod $r$o$m $f

echo ""
ls -l $f
echo ""
echo "Operation Completed.Thank You."