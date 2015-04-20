void test(int rq, int ret, int NULL){
if ( IS_ERR ( rq       )       )     { ret = PTR_ERR ( rq       )          ;  rq = NULL        ;   break ;  }    }