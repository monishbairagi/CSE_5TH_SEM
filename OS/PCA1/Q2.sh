echo -n "Enter file name to create: ";
read fileName;
touch $fileName;
echo "$fileName file has been created.";
echo -n "$fileName file permission: ";
echo "$(ls -l $fileName)" | cut -c1-9;
chmod 666 $fileName;
echo -n "$fileName file permission has been changed to ";
echo "$(ls -l $fileName)" | cut -c1-9;
