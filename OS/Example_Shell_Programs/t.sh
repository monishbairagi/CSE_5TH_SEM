i=0
max=10
while [ $i -lt $max ]
do
    echo "output: $i"
    true $(( i++ ))
done