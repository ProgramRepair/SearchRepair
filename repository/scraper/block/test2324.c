void test(int rq, int bio){
if ( unlikely ( is_flush_fua       )       )     { blk_mq_bio_to_request ( rq       , bio       )    ;  blk_insert_flush ( rq       )    ;   goto  run_queue ;  }    }