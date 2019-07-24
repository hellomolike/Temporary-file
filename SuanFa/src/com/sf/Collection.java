package com.sf;

/**
 * 排序算法
 */
public class Collection {

    /*
    主类
     */
    public static void main(String[] args) {
        int[] a={12,45,3,6,98,12,32};
        Collection c=new Collection();
//        c.bubbleSort(a);
        c.selectSort(a);

    }
    //冒泡排序
    void bubbleSort(int[] a){
        int temp;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <a.length-i ; j++) {
                if (a[j]>a[j+1]){
//                    交换相邻两个数字
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.print("第"+i+"步排序结果：");//输出每一步的排序结果
            for (int k = 0; k <a.length ; k++) {
                System.out.print(" "+a[k]); //输出
            }
            System.out.print("\n");
        }
        System.out.println("*************************************************************");
    }
    //选择排序
    void selectSort(int[] a){
        int  index;
        int temp;
        for (int i = 0; i <a.length-1 ; i++) {
            index=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[index]){
                    index=j;
                }
            }
            //交换两个数
            if (index!=i){
                temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
            System.out.print("第"+i+"步排序结果：");//输出每一步的排序结果
            for (int h = 0; h <a.length ; h++) {
                System.out.print(" "+a[h]); //输出
            }
            System.out.print("\n");
        }
        System.out.println("*************************************************************");
    }
    //插入排序
    void insertionSort(int[] a){
        int i,j,t,h;
        for ( i = 1; i <a.length ; i++) {
            t=a[i];
            j=i-1;
            while (j>=0&& t<a[j]){
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=t;
            System.out.print("第"+i+"步排序结果：");//输出每一步的排序结果
            for ( h = 0; h <a.length ; h++) {
                System.out.print(" "+a[h]); //输出
            }
            System.out.print("\n");
        }
    }
    //shell排序
    void Shell(int[] a){
        int i,j,h;
        int r,temp;
        int x=0;
        for ( r = a.length/2;r>=-1; r/=2)  //划组排序
        {
            for ( i = r; i <a.length ; i++) {
                temp=a[i];
                j=i-r;
                while (j>=0 && temp<a[j]){
                    a[j+r]=a[j];
                    j-=r;
                }
                a[j+r]=temp;
            }
            x++;
            System.out.print("第"+x+"步排序结果：");//输出每一步的排序结果
            for ( h = 0; h <a.length ; h++) {
                System.out.print(" "+a[h]); //输出
            }
            System.out.print("\n");
        }
    }
    //快速排序
    void quickSort(int[] arr,int left,int right){
        int f,t;
        int rtemp,ltemp;
        ltemp=left;
        rtemp=right;
        f=arr[(left+right)/2]; //分界值

        while(ltemp<rtemp){
            while (arr[ltemp]<f){
                ++ltemp;
            }
            while (arr[rtemp]>f){
                --rtemp;
            }
            if (ltemp<=rtemp){
                t=arr[ltemp];
                arr[ltemp]=arr[rtemp];
                arr[rtemp]=t;
                --rtemp;
                ++ltemp;

            }
        }
        if (ltemp==rtemp){
            ltemp++;

        }
        if (left<rtemp){
            quickSort(arr,left,ltemp-1); //递归调用
        }
        if (ltemp<right){
            quickSort(arr,rtemp,right);  //递归调用
        }
    }


}
