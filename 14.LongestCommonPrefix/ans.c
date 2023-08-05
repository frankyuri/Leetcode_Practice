char* longestCommonPrefix(char** strs, int strsSize) {
    int i,j;
    char* s="";
    if(strsSize==0) return s;
    for(j=0;j<strlen(*strs);j++)
      for(i=1;i<strsSize;i++) 
        if(*(*(strs+i)+j)!=*(*strs+j)) goto EXIT; 
   EXIT: 
    if(j==0) return s;
  *(*strs+j)='\0';
  return *strs;
}