void test(int q){
if ( blk_flush_complete_seq ( rq       , fq       , REQ_FSEQ_DATA       , error       )       )     blk_run_queue_async ( q       )    ;    }