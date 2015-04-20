void test(int rq, int error, int q){
if ( q   - >   mq_ops )     blk_mq_end_request ( rq       , error       )    ;    else __blk_end_request_all ( rq       , error       )    ;    }