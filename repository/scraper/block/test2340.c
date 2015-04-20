int test(int use_plug){
if ( use_plug   && lk_queue_nomerges ( q       )     && blk_attempt_plug_merge ( q       , bio       , equest_count       )       )     return      ;    }