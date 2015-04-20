void test(int bio){
if ( IS_ERR ( req       )       )     { bio_endio ( bio       , PTR_ERR ( req       )         )    ;   goto  out_unlock ;  }    }