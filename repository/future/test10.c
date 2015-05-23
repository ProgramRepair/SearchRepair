void test(int b, int c, int a, int printf_tmp){
if ( ( a  <=  b   && b  <=  c     )   || ( c  <=  b   && b  <=  a     )     )
{ printf_tmp = b        ;  }
else if ( ( b  <=  a   && a  <=  c     )   || ( c  <=  a   && a  <=  b     )     )     { printf_tmp = a        ;  }
else { printf_tmp = c        ;  }    }
