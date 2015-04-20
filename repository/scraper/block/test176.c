void test(int bio, int q){
if ( unlikely ( io_flagged ( bio       , BIO_SEG_VALID       )         )       )     blk_recount_segments ( q       , bio       )    ;    }