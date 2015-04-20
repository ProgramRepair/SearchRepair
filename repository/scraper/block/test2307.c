void test(int rq, int bio){
if ( lk_mq_attempt_merge ( q       , ctx       , bio       )       )     { blk_mq_bio_to_request ( rq       , bio       )    ;   goto  insert_rq ;  }    }