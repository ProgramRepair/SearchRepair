void test(int tg, int rw){
if ( throtl_slice_used ( tg       , rw       )       )     throtl_start_new_slice ( tg       , rw       )    ;    }