void test(int rq){
if ( lk_mark_rq_complete ( rq       )       )     __blk_mq_complete_request ( rq       )    ;    }