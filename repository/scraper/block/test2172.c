void test(int rq){
if ( - >    softirq_done_fn )     blk_mq_end_request ( rq       , rq    -  >       errors )    ;    else blk_mq_ipi_complete_request ( rq       )    ;    }