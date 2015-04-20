void test(int charge, int cfqq, int r_sync){
if ( fq_cfqq_sync ( cfqq       )     && r_sync     )     charge = cfqq    -  >        allocated_slice ;    }