int test(int q, int true){
if ( likely ( lk_queue_dying ( q       )         )       )     { __blk_get_queue ( q       )    ;  return true       ;  }    }