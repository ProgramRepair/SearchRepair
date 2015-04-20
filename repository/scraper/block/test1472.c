int test(int flags, int EOPNOTSUPP){
if ( flags   BLKDEV_DISCARD_SECURE   )     { if ( lk_queue_secdiscard ( q       )       )     return   -  EOPNOTSUPP        ;       type  REQ_SECURE ;  }    }