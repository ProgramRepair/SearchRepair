int test(int EFAULT){
if ( copy_to_user ( uarg       , dr       , sizeof ( hdr       )         )       )     return   -  EFAULT        ;    }