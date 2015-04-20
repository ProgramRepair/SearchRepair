void test(int run_queue, int hctx, int async){
if ( run_queue     )     blk_mq_run_hw_queue ( hctx       , async       )    ;    }