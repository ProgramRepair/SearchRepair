int test(int ret, int kaddr){
if ( ret     )     { kunmap_atomic ( kaddr       )    ;  return ret       ;  }    }