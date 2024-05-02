package com.example.demo.domain.PrimeNumber;
import com.example.demo.domain.PrimeNumber.*;
public class Prime {
    int startRange, endRange;
    public int getStartRange () {

        return startRange;
    }
    public void setStartRange ( int startRange){

        this.startRange = startRange;
    }

    public int getEndRange () {

        return endRange;
    }
    public void setEndRange ( int endRange){

        this.endRange = endRange;
    }
    public void main(String[] args){
        int i, j, flag;
        for (i = startRange; i <= endRange; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}
