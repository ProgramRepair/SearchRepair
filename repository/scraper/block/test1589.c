int test(int ret, int bio){
if ( unlikely ( ret       )       )     { bio_put ( bio       )    ;  return ret       ;  }    }