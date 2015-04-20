void test(int req){
if ( lk_mark_rq_complete ( req       )       )     __blk_complete_request ( req       )    ;    }