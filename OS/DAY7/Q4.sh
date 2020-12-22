#Write a shell script to copy the content of a source file into a destination file.

echo -n "Enter The Name of The File: "
read file

echo -n "Enter The Name of New The File: "
read newfile

cp $file $newfile