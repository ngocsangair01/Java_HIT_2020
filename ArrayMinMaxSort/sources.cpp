#include "header.h"
#include<iostream>
using namespace std;

void Array::Nhap() {
    cout<<"Nhap so phan tu mang: ";  cin>>n;
    for(int i=0;i<n;i++) {
        cout<<"a["<<i<<"]:";
        cin>>a[i];
    }
}
void Array::Max() {
    int Max=a[0];
    for(int i=0;i<n;i++) {
        if(a[i]>Max) {
            Max = a[i];
        }
    }
    cout<<endl<<"So lon nhat la:"<<Max;
}
void Array::Min() {
    int Min=a[0];
    for(int i=0;i<n;i++) {
        if(a[i]<Min) {
            Min = a[i];
        }
    }
    cout<<endl<<"So nho nhat la:"<<Min;
}
void Array::Xuat() {
    for(int i=0;i<n;i++) {
        cout<<a[i]<<" ";
    }
}
