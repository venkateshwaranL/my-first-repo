function add() 
{ 
sum=$(($1 + $2)) 
echo "Sum = $sum" 
} 
a=10 
b=20 
add $a $b 