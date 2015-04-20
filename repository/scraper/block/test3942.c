void test(int cfqq, int slice_used){
if ( slice_used  >  cfqq   - >   allocated_slice )     { slice_used = cfqq    -  >        allocated_slice ;  }    }