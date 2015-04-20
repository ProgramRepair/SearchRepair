void test(int blkg, int new_blkg){
if ( blkg     )     blkg_free ( new_blkg       )    ;    else blkg = blkg_create ( lkcg_root       , q       , new_blkg       )          ;    }