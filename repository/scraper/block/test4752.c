void test(int error, int uvp){
if ( error  ==  0     )     { uvp = compat_ptr ( arg       )          ;  if ( put_user ( kval       , uvp       )       )     error = -   EFAULT ;      }    }