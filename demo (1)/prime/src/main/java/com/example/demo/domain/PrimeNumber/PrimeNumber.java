package com.example.demo.domain.PrimeNumber;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeNumber {
    private int startRange, endRange;
    List<Integer> primeNumbers;

    public int getStartRange(){
        return startRange;
    }
    public int getEndRange(){
        return endRange;
    }

    public void setStartRange(int startRange){
        this.startRange=startRange;
    }

    public void setEndRange(int endRange){
        this.endRange=endRange;
    }

    public List<Integer> prime(){
        List<Integer> primeNumbers;
        int i, j, flag;
        primeNumbers = new ArrayList<>();
        for(i=startRange; i<=endRange; i++){
            if (i==0 || i==1){
                continue;
            }
            flag=1;

            for(j=2;j<i; ++j){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if (flag == 1) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
