public void printTriangle(int n){
    if(n<1) return;
    printTriangle(n-1);
    printStars(n);
}