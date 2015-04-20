int test(int ret){
if ( ret  <  0     )     { if ( ret  ==  -     ENOSPC )     { printk ( KERN_ERR   "bsg: too many bsg devices\n"     )    ;  ret = -   EINVAL ;  }       goto  unlock ;  }    }