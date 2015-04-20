int test(int total_tags, int BLK_MQ_TAG_MAX, int NULL){
if ( total_tags  >  BLK_MQ_TAG_MAX     )     { pr_err ( "blk-mq: tag depth too large\n"  )    ;  return NULL       ;  }    }