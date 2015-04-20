void test(int true, int hctx){
if ( blk_flush_complete_seq ( rq       , fq       , REQ_FSEQ_DATA       , error       )       )     blk_mq_run_hw_queue ( hctx       , true       )    ;    }