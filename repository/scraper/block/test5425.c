int test(int bdev){
if ( bdev     )     { fsync_bdev ( bdev       )    ;  res = __invalidate_device ( bdev       , true       )          ;  bdput ( bdev       )    ;  }    }