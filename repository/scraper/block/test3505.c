void test(int next_rq){
if ( next_rq     )     { blk_rq_unmap_user ( next_rq    -  >       bio )    ;  blk_put_request ( next_rq       )    ;  }    }