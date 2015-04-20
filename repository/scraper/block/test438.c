void test(int bi_ioc, int bio, int NULL){
if ( bio   - >   bi_ioc )     { put_io_context ( bio    -  >       bi_ioc )    ;   bio - >  bi_ioc = NULL        ;  }    }