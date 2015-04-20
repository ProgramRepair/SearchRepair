int test(int cfqd){
if ( blk_rq_pos ( rq       )    >=  cfqd   - >   last_position )     return blk_rq_pos ( rq       )      -  cfqd     -  >       last_position ;    }