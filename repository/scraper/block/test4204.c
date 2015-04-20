void test(int cfqq, int cfqd){
if ( cfq_cfqq_wait_request ( cfqq       )       )     cfq_del_timer ( cfqd       , cfqq       )    ;    }