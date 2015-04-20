int test(int bio, int NULL){
if ( unlikely ( blk_mq_queue_enter ( q       )         )       )     { bio_endio ( bio       , -  EIO )    ;  return NULL       ;  }    }