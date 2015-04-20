int test(int ret, int bvec, int EFAULT){
if ( ret  <  bvec   - >   bv_len )     return   -  EFAULT        ;    }