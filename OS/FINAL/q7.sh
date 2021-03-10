echo -n "Enter File Name to Check: ";
read file;
echo -n "Enter Directory Name to Check: ";
read dir;

if [ -e ${file} ]; 
then 
    echo "${file} File Exists."
else
    echo "${file} File is not present."
fi

if [ -d ${dir} ]; 
then 
    echo "${dir} Directory Exists."
else
    echo "${dir} Directory is not present."
fi

if [[ -e ${file} && -d ${dir} ]]
then
	cp $file $dir
	echo "${file} File Copied to ${dir} Directory."
else
	echo "Cannoy Copy, Probably File or Directory Missing."
fi
