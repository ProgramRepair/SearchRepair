int test(int cfqq, int cfqd, int prev){
if ( prev  !=  cfqq   - >   next_rq )     cfq_prio_tree_add ( cfqd       , cfqq       )    ;    }