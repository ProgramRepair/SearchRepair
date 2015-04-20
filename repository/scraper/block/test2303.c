void test(int rq){
if ( blk_do_io_stat ( rq       )       )     blk_account_io_start ( rq       , 1       )    ;    }