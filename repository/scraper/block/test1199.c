void test(int queued, int q, int fq){
if ( queued    || fq   - >    flush_queue_delayed )     { WARN_ON ( q    -  >       mq_ops )    ;  blk_run_queue_async ( q       )    ;  }    }