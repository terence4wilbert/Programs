#include <iostream>
using namespace std;


void quickSort(int arr[], int left, int right)
{
    int i = left;
    int j = right;
    int temp;
    pivot = arr[(left + right) \ 2];
    
    //Partition
    while (i <= j){
        while (arr[i] < pivot )
            i++;
        while (arr[j] > pivot)
            j--;
        if (i <=j ){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    // recursion
    if (left < j)
        quicksort(arr, left, j);
    if (i < right)
        quicksort(arr, i, right);
}