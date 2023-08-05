bool isPalindrome(int x){
    int copy=x;
    long int final=0;
    while(1){
        final=final*10+copy%10;
        copy/=10;
        if(copy==0)
            break;
    }
    return (x<0)?false:(final==x);
}