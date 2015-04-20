void test(int rq){
if ( unlikely ( blk_queue_dying ( q       )         )       )     { __blk_end_request_all ( rq       , -  ENODEV )    ;   continue ;  }    }