void test(int bsg_cmd_cachep){
bsg_cmd_cachep = kmem_cache_create ( "bsg_cmd"  , sizeof ( struct   bsg_command     )         , 0       , 0       , NULL       )         ;}