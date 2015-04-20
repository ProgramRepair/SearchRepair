void test(int rq){
if ( blk_account_rq ( rq       )       )     {  q - >   in_flight [  rq_is_sync ( rq       )    ] ++ ;  set_io_start_time_ns ( rq       )    ;  }    }