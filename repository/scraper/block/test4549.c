void test(int cfqq, int cfqd){
if ( cfq_cfqq_slice_new ( cfqq       )       )     { cfq_set_prio_slice ( cfqd       , cfqq       )    ;  cfq_clear_cfqq_slice_new ( cfqq       )    ;  }    }