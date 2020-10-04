#Write a shell script code to find a word from a file using grep command.

echo -n "Enter file name: "
read f
echo -n "Enter word to search: "
read w

echo ""
echo "THE WORD '$w' FOUND IN:-"
echo "(Line No. followd by lines)"
echo "---------------------------"

grep -n $w $f