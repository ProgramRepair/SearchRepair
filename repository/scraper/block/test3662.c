int test(int EFAULT){
if ( copy_from_user ( dr       , uarg       , sizeof ( hdr       )         )       )     return   -  EFAULT        ;    }