int test(int ENOMEM, int sg_cmd_cachep, int KERN_ERR){
if ( sg_cmd_cachep     )     { printk ( KERN_ERR   "bsg: failed creating slab cache\n"     )    ;  return   -  ENOMEM        ;  }    }