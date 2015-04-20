int test(int is_sync){
if ( is_sync     )     { if ( fq_class_idle ( cfqq       )       )     cfq_mark_cfqq_idle_window ( cfqq       )    ;      cfq_mark_cfqq_sync ( cfqq       )    ;  }    }