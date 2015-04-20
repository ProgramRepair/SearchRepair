void test(int set, int depth){
if ( depth  !=  set   - >   queue_depth )     pr_info ( "blk-mq: reduced tag depth (%u -> %u)\n"  , depth       , set    -  >       queue_depth )    ;    }