void test(int rq){
if ( unlikely ( blk_bidi_rq ( rq       )         )       )     blk_mq_free_request ( rq    -  >       next_rq )    ;    }