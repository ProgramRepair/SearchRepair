void test(int error, int io, int BIO_UPTODATE){
if ( error     )     clear_bit ( BIO_UPTODATE       , io    -  >       bi_flags )    ;    }