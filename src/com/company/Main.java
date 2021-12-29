package com.company;

public class Main {
    static boolean isFind(int[] list , int value){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value){
                return  true;
            }

        }
        return false;

    }



    public static void main(String[] args) {
        int[] list ={5,6,8,7,5,12,5,8,9,6,4,6,12};
        int[] duplicte=new int[list.length];
        int startIndex =0;



        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i!=j) && (list[i]==list[j]) && (list[i]%2==0) && list[j]%2==0){
                    if (!isFind(duplicte,list[i])){

                        duplicte[startIndex++]=list[i];
                    }
                    break;


                }

            }

        }
        for (int value : duplicte){
            if (value!=0){
                System.out.println(value);
            }
        }


    }
}
