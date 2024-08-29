package baitap;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("nhap phan tu thu "+i+":");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("so lon nhat la: "+max);
        System.out.println("so nho nhat la: "+min);
        int dem =0;
        int tong =0;
        double average=0;
        for(int i=0;i<a.length;i++){
            dem=dem+1;
            tong+=a[i];
            average=tong/dem;
        }
        System.out.println("tong: "+tong);
        System.out.println("trung binh cong: "+average);
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length ;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;                    
                }
            }
        }
        System.out.print("sap xep theo thu tu tang dan la: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
