import java.util.*;
import java.io.*;
public class Max2 {

public static void main(String[] args){

int[] arr = {5, 8, 1, 4, 0, 7};
int firstMax = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;

for (int num : arr) {
    if (num > firstMax) {
        secondMax = firstMax;
        firstMax = num;
    } else if (num > secondMax && num != firstMax) {
        secondMax = num;
    }
}
System.out.println("Second Maximum: " + secondMax);
}
}
